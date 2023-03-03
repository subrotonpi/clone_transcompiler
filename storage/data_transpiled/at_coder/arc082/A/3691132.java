public static int N = Integer . parseInt ( input ) {
  /* Enter your code here to do the work on all cases */
  int [ ] inpl = new int [ 10 * 5 + 2 ] ;
  for ( int i = 0 ;
  i < inpl . length ;
  i ++ ) {
    inpl [ i ] = i ;
  }
  int [ ] a = inpl . get ( ) ;
  for ( int i : a ) {
    ctr [ i ] ++ ;
  }
  int subsum = ctr [ 0 ] + ctr [ 1 ] + ctr [ 2 ] ;
  int ans = subsum ;
  for ( int i = 2 ;
  i <= 10 * 5 ;
  i ++ ) {
    subsum = subsum - ctr [ i - 2 ] + ctr [ i + 1 ] ;
    ans = Math . max ( ans , subsum ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
