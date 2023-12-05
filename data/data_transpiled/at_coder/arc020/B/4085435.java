@ VisibleForTesting static Iterable < Integer > permutations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] inputs = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    inputs [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 10 * 10 ;
  for ( Pair < Integer , Integer > pair : permutations ( 1 , 11 ) ) {
    int count = 0 ;
    int first = pair . first ;
    int second = pair . second ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( i % 2 == 0 && inputs [ i ] != first ) {
        count += c ;
      }
      else if ( i % 2 == 1 && inputs [ i ] != second ) {
        count += c ;
      }
    }
    ans = Math . min ( ans , count ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
