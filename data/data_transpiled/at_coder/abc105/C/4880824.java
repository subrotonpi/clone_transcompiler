public static int N ( ) {
  char [ ] a = new char [ 32 ] ;
  int n = 0 ;
  while ( N != 0 ) {
    char b = N % ( 2 * * ( n + 1 ) ) == 0 ? '0' : '1' ;
    a [ n ] = b ;
    N -= ( ( - 2 ) * * n ) * Integer . parseInt ( b ) ;
    n ++ ;
  }
  System . out . println ( a . length > 0 ? a [ 0 ] : 0 ) ;
  return 0 ;
}
