public static void ? ( ) {
  int iN = Integer . parseInt ( input . nextLine ( ) ) ;
  int iM = Integer . parseInt ( input . nextLine ( ) ) ;
  int iD = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] aA = new int [ iM + 1 ] ;
  for ( int i = iN + 1 ;
  i < aA . length ;
  i ++ ) {
    aA [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] aN = new int [ iM + 1 ] ;
  for ( int i = 0 ;
  i < aN . length ;
  i ++ ) {
    aN [ i ] = aN [ i ] ;
  }
  boolean [ ] a = new boolean [ iN + 1 ] ;
  int [ ] aRet = new int [ iN + 1 ] ;
  for ( int i = 1 ;
  i <= iN ;
  i ++ ) {
    if ( a [ i ] ) {
      aT = new int [ i ] ;
      a [ i ] = true ;
      iNext = aN [ i ] ;
    }
  }
  a [ 0 ] = false ;
}
