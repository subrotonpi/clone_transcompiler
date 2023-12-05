static final int [ ] binarySearch ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] cards = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cards [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int dp [ ] = - 1 ;
  for ( int i = 0 ;
  i < cards . length ;
  i ++ ) {
    dp [ i ] = cards [ i ] ;
  }
  return dp ;
}
