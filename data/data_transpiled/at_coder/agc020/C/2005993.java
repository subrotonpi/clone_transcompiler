static final String nextLine ( ) {
  final String nextLine = System . console ( ) . readLine ( ) ;
  final int N = Integer . parseInt ( nextLine ) ;
  final int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( nextLine ) ;
  }
  final int S = Integer . parseInt ( nextLine ) ;
  int bits = 1 ;
  for ( int a : A ) {
    bits |= bits << a ;
  }
  int ans = ( S + 1 ) / 2 ;
  bits >>= ans ;
  do {
    if ( bits & 1 != 0 ) {
      System . out . println ( ans ) ;
      exit ( ) ;
    }
    bits >>= 1 ;
    ans ++ ;
  }
  while ( bits != 0 ) ;
  return nextLine ;
}
