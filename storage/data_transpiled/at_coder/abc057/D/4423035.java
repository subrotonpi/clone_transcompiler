static final int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] v = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) v [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( v , Collections . reverseOrder ( ) ) ;
  int ans1 = 0 ;
  for ( int i = 0 ;
  i < A ;
  i ++ ) {
    ans1 += v [ i ] ;
  }
  ans1 /= A ;
  System . out . println ( ans1 ) ;
  int p = v [ A - 1 ] ;
  int q = v . indexOf ( p ) ;
  int r = v . indexOf ( p ) ;
  int ans2 = 0 ;
  if ( ! v [ 0 ] . equals ( v [ A - 1 ] ) ) {
    ans2 = Math . factorial ( q ) / Math . factorial ( q + r - A ) / Math . factorial ( A - r ) ;
  }
  else {
    for ( int i = A ;
    i <= Math . min ( q , B ) ;
    i ++ ) {
      ans2 += Math . factorial ( q ) / Math . factorial ( q - i ) / Math . factorial ( i ) ;
    }
  }
  return ans2 ;
}
