@ VisibleForTesting static < V > Dinic < V > createDinic ( ) {
  class Dinic < V > {
    private int inf ;
    private int vCount ;
    private int [ ] edges ;
    private int [ ] [ ] iter ;
    private int [ ] level ;
    @ Override public int [ ] get ( ) {
      int N = Integer . parseInt ( input ( ) ) ;
      int [ ] a = Lists . newArrayList ( ) ;
      a [ 0 ] = Integer . parseInt ( input ( ) ) ;
      inf = Integer . parseInt ( input ( ) ) ;
      vCount = vCount ;
      edges = new int [ N ] [ N ] ;
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) {
        int n = a [ i ] ;
        if ( n >= 0 ) edges [ i ] [ n ] = new int [ n ] ;
        else edges [ i ] [ n ] = new int [ n ] ;
      }
      for ( int j = i ;
      j < N + 1 ;
      j ++ ) edges [ j ] [ i ] = new int [ n ] ;
      level = null ;
      createGraph ( edges ) ;
    }
    private void createGraph ( ) {
      int [ ] [ ] edges = this . edges ;
      for ( int i = 0 , start = 1 ;
      i < edges . length ;
      i ++ ) {
        int origin = edges [ i ] [ start ] ;
        int dest = edges [ i ] [ start ] ;
        int cap = edges [ i ] [ start ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new int [ cap ] ;
        edges [ i ] [ start ] = new