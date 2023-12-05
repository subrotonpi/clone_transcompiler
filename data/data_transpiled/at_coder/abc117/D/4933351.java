public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ 40 ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 40 ;
  i >= 0 ;
  i -- ) {
    int bit = 0 ;
    for ( int a : A ) {
      bit += ( ( a >> i ) & 1 ) ;
    }
    int cond = 2 * i ;
    if ( ( N - bit ) > bit && K >= cond ) {
      ans += ( N - bit ) * cond ;
      K -= cond ;
    }
    else {
      ans += bit * cond ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
