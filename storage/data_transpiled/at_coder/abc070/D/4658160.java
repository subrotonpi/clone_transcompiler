static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) throws IOException {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    ArrayList < ArrayList < Integer >> ad = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) ad . add ( new ArrayList < > ( ) ) ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      int a = Integer . parseInt ( input . nextLine ( ) ) ;
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      int c = Integer . parseInt ( input . nextLine ( ) ) ;
      a -- ;
      b -- ;
      ad . get ( a ) . add ( new Integer ( b ) ) ;
      ad . get ( b ) . add ( new Integer ( c ) ) ;
    }
    int Q = Integer . parseInt ( input . nextLine ( ) ) ;
    int K = Integer . parseInt ( input . nextLine ( ) ) ;
    K -- ;
    ArrayList < Integer > query = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) query . add ( new ArrayList < > ( ) ) ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) query . add ( new ArrayList < > ( ) ) ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) query . add ( new ArrayList < > ( ) ) ;
    int [ ] dis = new int [ N ] ;
    {
    }
  }
  @ Override public void bfs ( int sv = K ) {
    Queue < Integer > dq = new LinkedList < > ( ) ;
    dq . add ( new Integer ( sv ) ) ;
    while ( dq . size ( ) > 0 ) {
      int v = dq . poll ( ) ;
      int d = dq . poll ( ) ;
      int pv = dq . poll ( ) ;
      for ( int nv = ad . get ( v ) ;
      nv < nd ;
      nv ++ ) {
        int nd = ad . get ( v ) . get ( nd ) ;
        if ( nv == pv ) continue ;
        dis [ nv ] = d + nd ;
        dq . add ( new Integer ( nv ) ) ;
      }
    }
  }
}
