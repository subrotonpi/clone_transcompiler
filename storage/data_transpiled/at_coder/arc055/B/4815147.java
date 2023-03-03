public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int dp [ ] [ ] = new int [ k + 2 ] [ k + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dp [ i ] [ 0 ] = 0 ;
    dp [ i ] [ 1 ] = 1 ;
  }
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    for ( int j = 0 ;
    j < k + 1 ;
    j ++ ) {
      double p = 1 / ( i + 1 ) ;
      double out = Math . max ( dp [ i + 1 ] [ j + 1 ] [ 1 ] , dp [ i + 1 ] [ j ] [ 0 ] ) * p ;
      dp [ i ] [ j ] [ 0 ] = dp [ i + 1 ] [ j ] [ 0 ] * ( 1 - p ) + out ;
      dp [ i ] [ j ] [ 1 ] = dp [ i + 1 ] [ j ] [ 1 ] * ( 1 - p ) + out ;
    }
  }
  System . out . println ( dp [ 0 ] [ 0 ] [ 0 ] ) ;
}
