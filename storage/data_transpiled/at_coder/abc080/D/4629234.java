public static int recording ( int N , int C , @ Nonnull List < Pair < Integer , Integer >> info ) {
  final int maxTime = Math . max ( info . size ( ) , new Comparator < Pair < Integer , Integer >> ( ) {
    @ Override public int compare ( Pair < Integer , Integer > o1 , Pair < Integer , Integer > o2 ) {
      return o1 . second - o2 . second ;
    }
  }
  ) ;
  maxTime = 2 * maxTime ;
  int [ ] [ ] cum = new int [ maxTime + 1 ] [ C ] ;
  for ( int s = 0 ;
  s < info . size ( ) ;
  s ++ ) {
    for ( int t = 0 ;
    t < info . size ( ) ;
    t ++ ) {
      cum [ 2 * s ] [ info . get ( s ) . second - 1 ] [ info . get ( t ) . second ] ++ ;
      cum [ 2 * t ] [ info . get ( t ) . second - 1 ] -- ;
    }
    for ( int t = 0 ;
    t < maxTime ;
    t ++ ) {
      for ( int ch = 0 ;
      ch < C ;
      ch ++ ) {
        cum [ t + 1 ] [ info . get ( t ) . second ] += cum [ t ] [ info . get ( t ) . second ] ;
      }
    }
  }
  if ( getClass ( ) . equals ( String . class ) ) {
    N = 0 ;
    N = Integer . parseInt ( input ( ) ) ;
    C = Integer . parseInt ( input ( ) ) ;
    info = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      info . add ( Pair . of ( i , i ) ) ;
    }
    int ans = recording ( N , C , info ) ;
    System . out . println ( ans ) ;
  }
  return ans ;
}
