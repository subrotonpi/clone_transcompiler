static public final boolean isParallel ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  int Ax , Ay , Bx , By ;
  final int N = Integer . parseInt ( input ) ;
  final int [ ] [ ] aXY = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    aXY [ i ] = Integer . parseInt ( sLine . split ( " " ) [ i ] ) ;
  }
  return true ;
}
