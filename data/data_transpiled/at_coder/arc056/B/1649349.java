static final void main ( String [ ] args ) {
  final int N = Integer . parseInt ( args [ 0 ] ) ;
  final double INF = Double . MAX_VALUE ;
  System . setOut ( new PrintStream ( System . out ) {
    @ Override public void print ( String s ) {
      int N = Integer . parseInt ( input ) ;
      int M = Integer . parseInt ( input ) ;
      int S = Integer . parseInt ( input ) ;
      S -- ;
      Map < Integer , Integer > graph = new HashMap < > ( ) ;
      for ( int i = 0 ;
      i < M ;
      i ++ ) {
        int u = Integer . parseInt ( input ) ;
        int v = Integer . parseInt ( input ) ;
        u -- ;
        v -- ;
        graph . put ( u , v ) ;
        graph . put ( v , u ) ;
      }
      List < Integer > h = new ArrayList < > ( ) ;
      heapsort ( h , - S , S ) ;
      int [ ] table = new int [ N ] ;
      table [ S ] = S ;
      while ( h . size ( ) > 0 ) {
        int cost = heapsort ( h , - S , S ) ;
        int node = graph . get ( node ) ;
        cost = - cost ;
        for ( int to : graph . get ( node ) ) {
          int newCost = Math . min ( cost , to ) ;
          if ( newCost <= table [ to ] ) continue ;
          table [ to ] = newCost ;
          heapsort ( h , - newCost , to ) ;
        }
      }
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( table [ i ] >= i ) System . out . println ( i + 1 ) ;
      }
    }
  }
  ) ;
}
