static final int [ ] getMemory ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > src = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    src . add ( i ) ;
  }
  if ( A == 1 ) {
    for ( int v : new ArrayList < > ( src ) ) {
      System . out . println ( v ) ;
    }
    exit ( ) ;
  }
  List < Memory > mem = new ArrayList < > ( src . size ( ) ) ;
  int maxv = 0 ;
  for ( int i = 0 ;
  i < src . size ( ) ;
  i ++ ) {
    mem . add ( new Memory ( src . get ( i ) ) ) ;
    if ( src . get ( i ) > maxv ) maxv = src . get ( i ) ;
  }
  heapify ( mem ) ;
  while ( true ) {
    int v = heapify ( mem ) ;
    if ( B == 0 || ( v * A > maxv && B % N == 0 ) ) {
      heapify ( mem ) ;
      break ;
    }
    maxv = Math . max ( maxv , src . get ( i ) * A ) ;
    heapify ( mem ) ;
    B -- ;
  }
  int MOD = 10 * 9 + 7 ;
  double p = Math . pow ( A , B / N , MOD ) ;
  while ( mem . size ( ) > 0 ) {
    int v = heapify ( mem ) ;
    System . out . println ( ( v * p ) % MOD ) ;
  }
  return mem . toArray ( ) ;
}
