@ VisibleForTesting static void main ( String [ ] args ) {
  final int N = 10 ;
  final double INF = Double . MAX_VALUE ;
  System . setErr ( new PrintStream ( System . err ) {
    final int [ ] dy = {
      0 , - 1 , 0 , 1 }
      ;
      final int [ ] dx = {
        1 , 0 , - 1 , 0 }
        ;
        @ Override public boolean inside ( int y , int x , int H , int W ) {
          return 0 <= y && y < H && 0 <= x && x < W ;
        }
        @ Override public void dfs ( int now , Set < Integer > used , Map < Integer , Integer > graph , Map < Integer , Integer > cost ) {
          for ( int weight : graph . get ( now ) ) {
            int node = graph . get ( node ) ;
            if ( used . contains ( node ) ) {
              continue ;
            }
            cost . put ( node , cost . get ( now ) * weight ) ;
            used . add ( node ) ;
            dfs ( node , used , graph , cost ) ;
          }
        }
        @ Override public void main ( String [ ] args ) {
          int N = Integer . parseInt ( input ( args [ 0 ] ) ) ;
          List < Integer > l = new ArrayList < > ( ) ;
          Set < Integer > unitSet = new HashSet < > ( ) ;
          for ( int i = 0 ;
          i < N ;
          i ++ ) {
            int a = Integer . parseInt ( input ( args [ 1 ] ) ) ;
            int b = Integer . parseInt ( input ( args [ 2 ] ) ) ;
            int c = Integer . parseInt ( input ( args [ 3 ] ) ) ;
            l . add ( new Integer ( a ) ) ;
            l . add ( new Integer ( b ) ) ;
            l . add ( new Integer ( c ) ) ;
            unitSet . add ( a ) ;
            unitSet . add ( c ) ;
          }
          Map < Integer , Integer > unitNo = new HashMap < > ( ) ;
          List < Integer > unitList = new LinkedList < > ( ) ;
          for ( int i = 0 ;
          i < unitList . size ( ) ;
          i ++ ) {
            unitNo . put ( unitList . get ( i ) , i ) ;
          }
          Map < Integer , Integer > graph = new TreeMap < > ( ) ;
          for ( int a = 0 ;
          a < l . size ( ) ;
          a ++ ) {
            int b = l . get ( a ) ;
            int c = unitNo . get ( c ) ;
            graph . put ( c ,