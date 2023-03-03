public static void solve ( int n ) {
  int r = 0 ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    boolean [ ] visited = new boolean [ n ] ;
    int dr = 0 ;
    Stack < Integer > st = new Stack < Integer > ( ) ;
    int v = r ;
    visited [ v ] = true ;
    st . push ( new Integer ( v ) ) ;
    while ( st . size ( ) > 0 ) {
      v = st . pop ( ) ;
      int d = v + 1 ;
      if ( dr < d ) {
        r = v ;
        dr = d ;
      }
      for ( int w : adjList [ v ] ) {
        if ( ! visited [ w ] ) {
          visited [ w ] = true ;
          st . push ( new Integer ( w ) ) ;
        }
      }
    }
    if ( i == 0 ) {
      x = r ;
    }
    else {
      y = r ;
    }
  }
  /* main program */
  String input = "Enter number of elements (" + n + ") for example (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" + n + ") for (" +