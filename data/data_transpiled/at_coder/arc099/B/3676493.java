public static int digSum ( int num ) {
  int ds = 0 ;
  while ( num > 0 ) {
    ds += num % 10 ;
    num /= 10 ;
  }
  return ds ;
}
K = Integer . parseInt ( input . nextLine ( ) ) ;
List < Integer > candidates = new ArrayList < > ( ) ;
List < Integer > digSums = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < 15 ;
i ++ ) {
  int base = 10 * i ;
  for ( int j = 1 ;
  j < 150 ;
  j ++ ) {
    int candidate = j * base + ( base - 1 ) ;
    candidates . add ( candidate ) ;
  }
}
Collections . sort ( candidates ) ;
digSums = new ArrayList < > ( ) ;
for ( int candidate : candidates ) {
  digSums . add ( digSum ( candidate ) ) ;
}
List < Integer > snukeNums = new ArrayList < > ( ) ;
SmallerAsSnuke smallerAsSnuke = new SmallerAsSnuke ( ) {
  @ Override public boolean isSatisfiedBy ( int n , int m , int dsN , int dsM ) {
    return n * dsM <= m * dsN ? true : false ;
  }
}
;
for ( int i = 0 ;
i < candidates . size ( ) ;
i ++ ) {
  int candidate = candidates . get ( i ) ;
  int dsCand = digSums . get ( i ) ;
  for ( int j = i + 1 ;
  j < candidates . size ( ) ;
  j ++ ) {
    int otherNum = candidates . get ( j ) ;
    int dsOther = digSums . get ( j ) ;
    if ( ! smallerAsSnuke . isSatisfiedBy ( candidate , otherNum , dsCand , dsOther ) ) {
      break ;
    }
  }
  else {
    snukeNums . add ( candidate ) ;
  }
}
for ( int snukeNum : snukeNums . subList ( 0 , K ) ) {
  System . out . println ( snukeNum ) ;
}
return snukeNum ;
}
