@ VisibleForTesting static LinkedHashMap < Integer , Double > map ( ) {
  final LinkedHashMap < Integer , Double > map = new LinkedHashMap < > ( ) ;
  map . put ( 0 , INF ) ;
  final double mod = 10 * * 9 + 7 ;
  final double eps = 10 * * - 7 ;
  {
    final int in = Integer . parseInt ( input . nextLine ( ) ) ;
    final int inpl = Integer . parseInt ( input . nextLine ( ) ) ;
    final int inpls = Integer . parseInt ( input . nextLine ( ) ) ;
    final int N = in ;
    double tmp = INF ;
    double S = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final double A = inpl ;
      final double B = inpls ;
      S += A ;
      if ( A > B ) {
        tmp = Math . min ( B , tmp ) ;
      }
    }
    if ( tmp == INF ) {
      System . out . println ( 0 ) ;
    }
    else {
      System . out . println ( S - tmp ) ;
    }
  }
}
