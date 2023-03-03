public static int digitSum ( int x ) {
  int s = 0 ;
  while ( x > 0 ) {
    s = s + x % 10 ;
    x = x / 10 ;
  }
  return s ;
}
LinkedList < Integer > l = new LinkedList < Integer > ( ) ;
l . add ( 1 ) ;
for ( int i = 10 ;
i < 100000 ;
i ++ ) {
  while ( digitSum ( i ) * l . peek ( ) > digitSum ( l . peek ( ) ) * i ) {
    l . pop ( ) ;
  }
  l . add ( i ) ;
}
for ( int length = 6 ;
length < 20 ;
length ++ ) {
  for ( int j = 1000 ;
  j < 10000 ;
  j ++ ) {
    int i = j * 10 * ( length - 4 ) + 10 * ( length - 4 ) - 1 ;
    while ( digitSum ( i ) * l . peek ( ) > digitSum ( l . peek ( ) ) * i ) {
      l . pop ( ) ;
    }
    l . add ( i ) ;
  }
}
int k = Integer . parseInt ( input . nextLine ( ) ) ;
for ( int i = 0 ;
i <= k ;
i ++ ) {
  System . out . println ( l . get ( i ) ) ;
}
return k ;
}
