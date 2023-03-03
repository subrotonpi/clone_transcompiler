@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int p = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] choco = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    choco [ x - 1 ] [ y - 1 ] = y ;
  }
  int ret = 0 ;
  for ( int [ ] boys : combinations ( n , p , q ) ) {
    int [ ] tgtchoco = new int [ m ] ;
    for ( int i : boys ) {
      for ( int j = 0 ;
      j < m ;
      j ++ ) {
        tgtchoco [ j ] += choco [ i ] [ j ] ;
      }
    }
    ret = Math . max ( ret , Arrays . stream ( tgtchoco ) . sorted ( ) . limit ( ) . filter ( Objects :: nonNull ) . count ( ) ) ;
  }
  System . out . println ( ret ) ;
  return ret ;
}
