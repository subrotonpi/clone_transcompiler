@ VisibleForTesting static LinkedHashMap < Integer , Integer > map ( ) {
  final int INF = Integer . MAX_VALUE ;
  final int mod = 10 * 9 + 7 ;
  final int eps = 10 * - 7 ;
  {
    final int N = Integer . parseInt ( input . nextLine ( ) ) ;
    final int M = Integer . parseInt ( input . nextLine ( ) ) ;
    final int D = Integer . parseInt ( input . nextLine ( ) ) ;
    final int [ ] [ ] aa = inpl ( ) ;
    final int L = ( int ) Math . log2 ( D ) + 1 ;
    final LinkedHashMap < Integer , Integer > T = new LinkedHashMap < > ( N , M , D ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      T . put ( i , i ) ;
    }
    for ( int j = 0 ;
    j < L ;
    j ++ ) {
      T . put ( 0 , N ) ;
    }
    for ( int a = 0 ;
    a < N ;
    a ++ ) {
      T . put ( 0 , N ) ;
    }
    for ( int a = 0 ;
    a < L ;
    a ++ ) {
      T . put ( 0 , N ) ;
    }
    for ( int a = 0 ;
    a < N ;
    a ++ ) {
      T . put ( 0 , N ) ;
    }
    final int [ ] flags = new int [ L ] ;
    for ( int k = 0 ;
    k < L ;
    k ++ ) {
      flags [ k ] = D >> k & 1 ;
    }
    for ( int k = 1 ;
    k < L ;
    k ++ ) {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        T . put ( k , N ) ;
      }
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int ans = i ;
      for ( int k = 0 ;
      k < flags . length ;
      k ++ ) {
        final boolean flag = flags [ k ] ;
        if ( flag ) {
          ans = T . get ( k ) . get ( ans ) ;
        }
      }
      System . out . println ( ans + 1 ) ;
    }
  }
  return T ;
}
