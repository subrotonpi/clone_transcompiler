public static int g ( ) {
  int g = 0 ;
  for ( int i = 0 ;
  i < Integer . parseInt ( input ( ) ) ;
  i ++ ) {
    List l = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < l . size ( ) ;
    j ++ ) {
      l . add ( Integer . parseInt ( input ( ) ) ) ;
    }
    int c = Integer . parseInt ( l . get ( 0 ) ) + 110 / 900 * l . get ( 4 ) ;
    g = Math . max ( g , c ) ;
  }
  return g ;
}
