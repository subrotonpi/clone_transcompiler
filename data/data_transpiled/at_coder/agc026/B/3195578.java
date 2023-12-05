static final int [ ] [ ] getIntegerArray ( ) {
  int iT = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] aR = new int [ iT ] [ iT ] ;
  for ( int i = 0 ;
  i < aR . length ;
  i ++ ) {
    aR [ i ] = Integer . parseInt ( sLine . readLine ( ) ) ;
  }
  return aR ;
}
