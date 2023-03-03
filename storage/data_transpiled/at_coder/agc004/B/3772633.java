static final void solve ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int x = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( i ) ;
  }
  int [ ] A = L . toArray ( ) ;
  ans = Integer . MAX_VALUE ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    A [ k ] = Math . min ( A [ k ] , x ) ;
  }
  System . out . println ( ans ) ;
}
