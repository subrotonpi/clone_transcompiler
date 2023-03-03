public static int N ( ) {
  String [ ] W = input . split ( " " ) ;
  W [ W . length - 1 ] = W [ W . length - 1 ] . substring ( 0 , W . length - 1 ) ;
  int num = 0 ;
  for ( int i = 0 ;
  i < W . length ;
  i ++ ) {
    if ( W [ i ] . equals ( "TAKAHASHIKUN" ) || W [ i ] . equals ( "Takahashikun" ) || W [ i ] . equals ( "takahashikun" ) ) num ++ ;
  }
  return num ;
}
