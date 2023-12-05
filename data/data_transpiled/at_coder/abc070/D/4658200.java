static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) throws IOException {
    Scanner scanner = new Scanner ( System . in ) ;
    scanner . useLocale ( Locale . ENGLISH ) ;
    @ SuppressWarnings ( "resource" ) int N = scanner . nextInt ( ) ;
    ArrayList < Integer > ad = new ArrayList < > ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) ad . add ( new ArrayList < > ( ) ) ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      int a = scanner . nextInt ( ) ;
      int b = scanner . nextInt ( ) ;
      int c = scanner . nextInt ( ) ;
      a -- ;
      b -- ;
      ad . get ( a ) . add ( new Integer ( b ) ) ;
      ad . get ( b ) . add ( new Integer ( c ) ) ;
    }
    int Q = scanner . nextInt ( ) ;
    int K = scanner . nextInt ( ) ;
    K -- ;
    int [ ] [ ] query = new int [ Q ] [ Q ] ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) query [ i ] = new int [ Q ] ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) query [ i ] [ i ] = scanner . nextInt ( ) - 1 ;
    int [ ] dis = new int [ N ] ;
    {
      int v = K , d = 0 , pv = - 1 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int nv = ad . get ( i ) ;
        int nd = ad . get ( i ) ;
        if ( nv == pv ) continue ;
        dis [ i ] = d + nd ;
        dfs ( nv , d + nd , v ) ;
      }
    }
  }
}
