@ VisibleForTesting static void prime ( ) {
  final int N = 3 ;
  final int M = 5 ;
  final int K = 7 ;
  Map < Integer , Map < Integer , Integer >> problist = null ;
  {
    problist = new HashMap < > ( ) ;
    for ( int t = 2 ;
    t <= M ;
    t ++ ) {
      t = Integer . valueOf ( t ) ;
      for ( int k = 0 ;
      k < K ;
      k ++ ) {
        int p = 1 ;
        for ( boolean kk = k , tt = t ;
        kk > 0 ;
        kk ++ ) {
          if ( kk ) p *= tt ;
        }
        problist . put ( p , t ) ;
      }
    }
  }
  makeProblist ( ) ;
}
