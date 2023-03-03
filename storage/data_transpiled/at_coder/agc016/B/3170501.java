@ VisibleForTesting static LinkedHashMap < Integer , Double > map ( ) {
  final double INF = Double . MAX_VALUE ;
  final double mod = 10 * 9 + 7 ;
  final double eps = 10 * - 7 ;
  {
    final LinkedHashMap < Integer , Double > inpl = new LinkedHashMap < > ( ) ;
    final LinkedHashMap < Integer , Double > inpls = new LinkedHashMap < > ( ) ;
    final int N = Integer . parseInt ( input . nextLine ( ) ) ;
    final double [ ] aa = inpl . values ( ) ;
    final int MIN = min ( aa ) ;
    final int MAX = max ( aa ) ;
    if ( MAX - MIN > 1 ) {
      System . out . println ( "No" ) ;
    }
    else if ( MAX == MIN ) {
      if ( MAX == N - 1 ) {
        System . out . println ( "Yes" ) ;
      }
      else if ( MAX <= N / 2 ) {
        System . out . println ( "Yes" ) ;
      }
      else {
        System . out . println ( "No" ) ;
      }
    }
    else {
      int n_MIN = 0 ;
      int n_MAX = 0 ;
      for ( int a : aa ) {
        if ( a == MIN ) n_MIN ++ ;
        if ( a == MAX ) n_MAX ++ ;
        final int x_min = n_MIN + 1 ;
        final int x_max = n_MIN + n_MAX / 2 ;
        if ( x_min <= MAX && MAX <= x_max ) {
          System . out . println ( "Yes" ) ;
        }
        else {
          System . out . println ( "No" ) ;
        }
      }
    }
  }
}
