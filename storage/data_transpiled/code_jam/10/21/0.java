public static int addFolder ( String s ) throws IOException {
  String folder = "/" ;
  int aux = 0 ;
  int idx = 1 ;
  for ( int i = s . indexOf ( "/" ) + 1 ;
  i < s . length ( ) ;
  i ++ ) {
    folder += s . substring ( i , i + 1 ) + "/" ;
    if ( ! dirs . contains ( folder ) ) {
      dirs . add ( folder ) ;
      aux ++ ;
    }
  }
  return aux ;
}
