public static void print ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int suma = Arrays . stream ( A ) . mapToInt ( Integer :: sum ) . sum ( ) ;
  int unit = N * ( N + 1 ) / 2 ;
  if ( suma % unit > 0 ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  int ope = suma / unit ;
  int d = A [ 0 ] - A [ A . length - 1 ] ;
  for ( int a = 1 , b = 0 ;
  a < d ;
  a ++ , b ++ ) {
    if ( ( b - a ) % N != 0 ) {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
    k += ( ope - ( b - a ) ) / N ;
  }
  System . out . println ( k == ope ? "YES" : "NO" ) ;
}
