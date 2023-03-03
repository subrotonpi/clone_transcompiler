@ VisibleForTesting static Iterable < Integer > permutations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] inputs = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    inputs [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int first : permutations ( 1 , 11 ) ) {
    int second = Integer . parseInt ( input . nextLine ( ) ) ;
    int count = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ( i % 2 == 0 && inputs [ i ] == first ) || ( i % 2 == 1 && inputs [ i ] == second ) ) {
        count ++ ;
      }
    }
    ans = Math . max ( ans , count ) ;
  }
  System . out . println ( c * ( n - ans ) ) ;
  return inputs ;
}
