static public boolean isParallel ( ) {
  final String input = System . console ( ) . readLine ( ) ;
  int Ax = Integer . parseInt ( input ) ;
  int Ay = Integer . parseInt ( input ) ;
  int Bx = Integer . parseInt ( input ) ;
  int By = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int [ ] [ ] aXY = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    aXY [ i ] = Integer . parseInt ( sLine . split ( " " ) [ i ] ) ;
  }
  return true ;
}
