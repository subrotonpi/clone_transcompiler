@ VisibleForTesting static int from ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] an = Lists . newArrayList ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    while ( ( an [ i ] & 1 ) == 0 ) {
      an [ i ] = ( an [ i ] >> 1 ) ;
    }
  }
  ac = new AtomicInteger ( an ) ;
  return ac . size ( ) ;
}
