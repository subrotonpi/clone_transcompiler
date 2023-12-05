public static int [ ] getA ( int A , int B , int K ) {
  int [ ] ans = new int [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    if ( A + i <= B ) ans [ i ] = A + i ;
  }
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    if ( B - i >= A ) ans [ i ] = B - i ;
  }
  Arrays . sort ( ans ) ;
  for ( int i : ans ) {
    System . out . println ( i ) ;
  }
  return ans ;
}
