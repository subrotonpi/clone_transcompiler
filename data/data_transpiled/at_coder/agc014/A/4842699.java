public static int a , int b , int c ;
int cnt = 0 ;
for ( int i = 0 ;
i < input . length ;
i ++ ) {
  a = input . nextInt ( ) ;
  b = input . nextInt ( ) ;
  c = input . nextInt ( ) ;
  if ( a == b == c && a % 2 == 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    cnt = 0 ;
    while ( a % 2 == b % 2 == c % 2 == 0 ) {
      a = ( b + c ) / 2 ;
      b = ( a + c ) / 2 ;
      c = ( a + b ) / 2 ;
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
}
