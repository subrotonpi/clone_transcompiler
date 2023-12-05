@ VisibleForTesting static void heapify ( String ... args ) {
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int M = Integer . parseInt ( readLine ( ) ) ;
    int N = Integer . parseInt ( readLine ( ) ) ;
    int [ ] [ ] b = new int [ M ] [ N ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      String l = readLine ( ) ;
      StringBuilder sb = new StringBuilder ( ) ;
      for ( int j = 0 ;
      j < l . length ( ) ;
      j ++ ) {
        sb . append ( ( "0000" + ( Integer . toBinaryString ( l . charAt ( j ) ) ) ) . substring ( l . length ( ) - 4 ) ) ;
      }
      b [ i ] = Integer . parseInt ( sb . toString ( ) ) ;
    }
    int [ ] [ ] R = new int [ M ] [ N ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      for ( int j = 0 ;
      j < N - 2 ;
      j ++ ) {
        int c = b [ i ] [ j ] ;
        if ( ( c != b [ i + 1 ] [ j ] ) && ( c != b [ i ] [ j + 1 ] ) && ( c == b [ i + 1 ] [ j + 1 ] ) ) {
          R [ i ] [ j ] = 1 + Math . min ( R [ i ] [ j + 1 ] , R [ i + 1 ] [ j ] , R [ i + 1 ] [ j + 1 ] ) ;
        }
        else {
          R [ i ] [ j ] = 1 ;
        }
      }
    }
    List < Integer > Q = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) for ( int j = 0 ;
    j < N ;
    j ++ ) {
      Q . add ( new Integer ( - R [ i ] [ j ] ) ) ;
    }
    heapify ( Q ) ;
    int [ ] cut = new int [ M ] ;
    while ( ( Q . size ( ) ) > 0 ) {
      int mk = heapify ( Q ) ;
      int i = 0 ;
      int j = 0 ;
      int k = - mk ;
      if ( ( R [ i ] [ j ] == k ) && ( cut [ k ] > 0 ) ) {
        cut [ k ] ++ ;
      }
      else {
        Q . add ( new Integer ( k1