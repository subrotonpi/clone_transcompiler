public static int calculate ( ) {
  int c = Integer . parseInt ( input . nextLine ( ) ) , d = Integer . parseInt ( input . nextLine ( ) ) , v = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] coins = new int [ input . nextInt ( ) ] ;
  for ( int i = 0 ;
  i < coins . length ;
  i ++ ) {
    coins [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int currentMax = 0 ;
  int extraCoin = 0 ;
  for ( int i = 0 ;
  i < coins . length ;
  i ++ ) {
    if ( currentMax > v ) {
      return extraCoin ;
    }
    while ( currentMax < coins [ i ] - 1 ) {
      extraCoin ++ ;
      currentMax += ( currentMax + 1 ) * c ;
    }
    currentMax += coins [ i ] * c ;
  }
  while ( currentMax < v ) {
    extraCoin ++ ;
    currentMax += ( currentMax + 1 ) * c ;
  }
  return extraCoin ;
  /* main case */
  int ncase = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < ncase ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ": " + calculate ( ) ) ;
  }
  if ( getClass ( ) . equals ( String . class ) ) {
    return 0 ;
  }
  return 1 ;
}
