static final boolean isPalindrome ( ) {
  return A . equals ( A . substring ( 0 , A . length ( ) - 1 ) ) ;
  /* main method */
  int l = A . length ( ) ;
  if ( l == 1 ) {
    System . out . println ( 0 ) ;
    return false ;
  }
  if ( isPalindrome ( ) ) {
    if ( l % 2 == 0 ) {
      System . out . println ( l * 25 ) ;
      return false ;
    }
    else {
      System . out . println ( ( l - 1 ) * 25 ) ;
      return false ;
    }
  }
  int [ ] aL = A . clone ( ) ;
  int [ ] aR = A . clone ( ) ;
  for ( int i = l / 2 ;
  i < aL . length ;
  i ++ ) {
    aL [ i ] = aL [ i ] ;
  }
  int [ ] aR = A . clone ( ) ;
  int [ ] aL2 = new int [ l ] ;
  for ( int i = l - l / 2 ;
  i < aR . length ;
  i ++ ) {
    aL2 [ i ] = ( int ) ( Collections . binarySearch ( aL , aR [ i ] ) ) ;
  }
  int [ ] aR2 = new int [ l ] ;
  for ( int i = l - l / 2 ;
  i < aR . length ;
  i ++ ) {
    aR2 [ i ] = ( int ) ( Collections . binarySearch ( aR , aL [ i ] ) ) ;
  }
  int dNum = ( aL2 . length != aR2 . length ) ? aL2 [ 0 ] : aR2 [ 0 ] ;
  if ( dNum == 1 ) {
    System . out . println ( ( l - 2 ) * 25 + 2 * 24 ) ;
    return false ;
  }
  System . out . println ( l * 25 ) ;
  if ( getClass ( ) . isAnnotationPresent ( A . getClass ( ) ) ) {
    A = input . read ( ) ;
    main ( ) ;
  }
  return true ;
}
