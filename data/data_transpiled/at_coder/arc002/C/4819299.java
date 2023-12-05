static final int count ( int n ) {
  String s = "S" + input ;
  List < List < Integer >> rr = Lists . newArrayList ( ) ;
  List < List < Integer >> ll = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    rr . add ( i ) ;
  }
  List < List < Integer >> ll = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ll . add ( i ) ;
  }
  /* count(List<Integer> l, List<Integer> r) */
  int [ ] k = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( ( s . charAt ( i - 1 ) == l . charAt ( 0 ) && s . charAt ( i ) == l . charAt ( 1 ) ) || ( s . charAt ( i - 1 ) == r . charAt ( 0 ) && s . charAt ( i ) == r . charAt ( 1 ) ) ) {
      k [ i ] = Math . min ( k [ i - 1 ] + 1 , k [ i - 2 ] + 1 ) ;
    }
    else {
      k [ i ] = k [ i - 1 ] + 1 ;
    }
  }
  int ans = 10 * 10 ;
  for ( List < Integer > ri : rr ) {
    for ( List < Integer > li : ll ) {
      ans = Math . min ( ans , count ( li , ri ) ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
