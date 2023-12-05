@ Nonnull public static List < Integer > fordFulkerson ( int s , int g , int n ) {
  final int [ ] [ ] path = new int [ n + 1 ] [ n + 1 ] ;
  final int [ ] [ ] p = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( System . in . readLine ( ) ) ;
  }
  final int [ ] [ ] i = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    i [ 0 ] = i ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    i [ 0 ] [ i ] = 1 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    i [ 0 ] [ i ] = 1 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    i [ 0 ] [ i ] = i ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    i [ 0 ] [ i ] = 1 ;
  }
  System . out . println ( fordFulkerson ( 0 , n , c , n + 1 ) ) ;
  return Arrays . asList ( path ) ;
}
