public static int getAnc ( int v , int n ) {
  final int LOG_V = 17 ;
  int root = 0 ;
  int N = Integer . parseInt ( input ) ;
  LCA addEdge = new LCA ( ) {
    int x , y ;
    int ans ;
    int [ ] G = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) G [ i ] = new int [ i ] ;
  }
  ;
  LCA parent = new LCA ( ) {
    int [ ] [ ] parent = new int [ LOG_V ] ;
    int [ ] [ ] depth = new int [ N ] ;
    int [ ] [ ] lca = new int [ N ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int x = ( Integer . parseInt ( input ) ) ;
      int y = ( Integer . parseInt ( input ) ) ;
      addEdge ( x - 1 , y - 1 , 1 ) ;
    }
    int [ ] [ ] lca = new int [ N ] [ ] ;
    int [ ] [ ] depth = new int [ N ] [ ] ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) {
      int a = ( Integer . parseInt ( input ) ) ;
      int b = ( Integer . parseInt ( input ) ) ;
      a = b - 1 ;
      ans = depth [ a ] + depth [ b ] - 2 * depth [ lca ( a , b ) ] + 1 ;
    }
  }
  ;
  System . out . println ( ans ) ;
}
