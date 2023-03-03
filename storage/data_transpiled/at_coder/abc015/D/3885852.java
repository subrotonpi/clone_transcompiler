static void ? ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int W = Integer . parseInt ( input . nextLine ( ) ) ;
  final int N = input . nextInt ( ) , K = Integer . parseInt ( input . nextLine ( ) ) ;
  final HashMap < Integer , HashMap < Integer , Integer >> dp = new HashMap < > ( ) ;
  final double INF = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int w = Integer . parseInt ( input . nextLine ( ) ) , v = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( w <= W ) {
      for ( int k : dp . keySet ( ) . keySet ( ) ) {
        if ( K <= k ) continue ;
        int tk = k + 1 ;
        for ( int j : dp . get ( k ) . keySet ( ) ) {
          tv = j + v ;
          tMin = Math . min ( dp . get ( tk ) , INF ) ;
        }
      }
    }
  }
  System . out . println ( max ( max ( ed . keySet ( ) ) ) ) ;
}
