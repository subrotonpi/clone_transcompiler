@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > input ) {
  final double INF = Double . MAX_VALUE ;
  final double mod = 10 * 9 + 7 ;
  final double eps = 10 * - 7 ;
  /* inpl */
  final List < Integer > inpl = Lists . newArrayList ( ) ;
  /* inpls */
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] aa = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    aa [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final Map < Integer , Integer > cnt = new TreeMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int a = aa [ i ] ;
    final int ev = cnt . get ( a ) ;
    final int od = cnt . get ( a ) ;
    if ( i % 2 == 0 ) {
      if ( ev == 0 ) {
        ans ++ ;
        cnt . put ( a , ev ) ;
      }
      else {
        cnt . put ( a , od ) ;
      }
    }
    else {
      if ( od == 0 ) {
        ans ++ ;
        cnt . put ( a , ev ) ;
      }
      else {
        cnt . put ( a , ev ) ;
      }
    }
  }
  System . out . println ( ans / 2 ) ;
}
