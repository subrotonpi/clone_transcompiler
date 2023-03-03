static void ? ( ) {
  final int iN = Integer . parseInt ( input . nextLine ( ) ) ;
  final int iM = Integer . parseInt ( input . nextLine ( ) ) ;
  final int iD = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] aA = new int [ iM + 1 ] ;
  for ( int i = iN + 1 ;
  i < aN ;
  i ++ ) {
    aA [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int [ ] aN = new int [ iM + 1 ] ;
  for ( int i = iM - 1 ;
  i >= 0 ;
  i -- ) {
    aN [ aA [ i ] ] = aN [ aA [ i ] + 1 ] ;
  }
  aN [ 0 ] = 1 ;
  final int [ ] [ ] aB = new int [ 30 ] [ ] ;
  for ( int i = 1 ;
  i < 30 ;
  i ++ ) {
    final int [ ] aT = new int [ iN + 1 ] ;
    for ( int j = 1 ;
    j <= iN + 1 ;
    j ++ ) {
      aT [ j ] = aB [ aB . length - 1 ] [ aB [ aB . length - 1 ] [ j ] ] ;
    }
    aT [ 0 ] = aB [ aB . length - 1 ] [ 0 ] * 2 ;
    aB [ 0 ] = aT ;
    if ( iD / 2 <= aT [ 0 ] ) {
      break ;
    }
  }
  final int [ ] aRet = new int [ iN + 1 ] ;
  for ( int i = aB . length - 1 ;
  i >= 0 ;
  i -- ) {
    if ( aB [ i ] [ 0 ] <= iD ) {
      for ( int j = 1 ;
      j <= iN + 1 ;
      j ++ ) {
        aRet [ j ] = aB [ i ] [ aRet [ j ] ] ;
      }
      iD -= aB [ i ] [ 0 ] ;
    }
  }
  System . out . print ( Arrays . toString ( aRet ) ) ;
}
