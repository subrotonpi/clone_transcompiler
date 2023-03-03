@ VisibleForTesting static void from ( String input ) {
  int r = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  int [ ] rowCandy = new int [ r ] ;
  int [ ] colCandy = new int [ c ] ;
  int [ ] [ ] candys = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < candys [ i ] . length ;
    j ++ ) {
      rowCandy [ candys [ i ] [ j ] ] ++ ;
      colCandy [ candys [ j ] [ j ] ] ++ ;
    }
  }
  int [ ] rowCount = new int [ rowCandy . length ] ;
  for ( int i = 0 ;
  i < k + 1 ;
  i ++ ) {
    rowCount [ i ] = rowCount [ i ] ;
    for ( int j = 0 ;
    j < candys [ i ] . length ;
    j ++ ) {
      int p = rowCandy [ i - 1 ] + colCandy [ j - 1 ] ;
      if ( p == k ) {
        ans -- ;
      }
      if ( p == k + 1 ) {
        ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
}
