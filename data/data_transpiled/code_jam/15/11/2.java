public static int gao1 ( int [ ] l ) {
  int ans = 0 ;
  for ( int i = 1 ;
  i < l . length ;
  i ++ ) {
    if ( l [ i ] < l [ i - 1 ] ) {
      ans += l [ i - 1 ] - l [ i ] ;
    }
  }
  /* gao2 */
  int rate = 0 ;
  for ( int i = 1 ;
  i < l . length ;
  i ++ ) {
    rate = Math . max ( rate , l [ i - 1 ] - l [ i ] ) ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i < l . length ;
  i ++ ) {
    ans += Math . min ( l [ i - 1 ] , rate ) ;
  }
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int cas = 0 ;
  cas < t ;
  cas ++ ) {
    System . out . printf ( "Case #%d:" , cas + 1 ) ;
    int n = input . nextInt ( ) ;
    l = new LinkedList < Integer > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      l . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
    System . out . println ( gao1 ( l ) + " " + gao2 ( l ) ) ;
  }
  return ans ;
}
