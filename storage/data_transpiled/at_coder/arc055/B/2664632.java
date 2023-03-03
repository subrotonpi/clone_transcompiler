public static int [ ] [ ] [ ] dp ( ) {
  int n = ( int ) input . nextInt ( ) ;
  int k = ( int ) input . nextInt ( ) ;
  int [ ] [ ] [ ] dp = new int [ k + 2 ] [ n + 1 ] [ k + 1 ] ;
  for ( int i = 0 ;
  i < k + 1 ;
  i ++ ) dp [ n ] [ i ] [ 1 ] = 1 ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    for ( int j = 0 ;
    j < Math . min ( i + 1 , k + 1 ) ;
    j ++ ) {
      dp [ i ] [ j ] [ 0 ] = ( dp [ i + 1 ] [ j ] [ 0 ] * i + Math . max ( dp [ i + 1 ] [ j ] [ 0 ] , dp [ i + 1 ] [ j + 1 ] [ 1 ] ) ) / ( i + 1 ) ;
      dp [ i ] [ j ] [ 1 ] = ( dp [ i + 1 ] [ j ] [ 1 ] * i + Math . max ( dp [ i + 1 ] [ j ] [ 0 ] , dp [ i + 1 ] [ j + 1 ] [ 1 ] ) ) / ( i + 1 ) ;
    }
  }
  System . out . println ( dp [ 0 ] [ 0 ] [ 0 ] ) ;
  return dp ;
}
