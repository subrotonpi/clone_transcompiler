public static String print ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  String [ ] S = new String [ n + 1 ] ;
  int [ ] T = new int [ n + 1 ] ;
  String U = "" ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    S [ i ] = input ( ) ;
  }
  for ( int i = 97 ;
  i < 123 ;
  i ++ ) {
    T [ i ] = Math . min ( S [ i ] . indexOf ( ( char ) i ) , T [ i ] ) ;
  }
  for ( int k = 0 ;
  k < T . length ;
  k ++ ) {
    U += ( char ) ( k + 97 ) * T [ k ] ;
  }
  System . out . println ( U ) ;
  return U ;
}
