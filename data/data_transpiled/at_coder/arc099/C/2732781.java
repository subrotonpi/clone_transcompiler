public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  boolean [ ] [ ] E = new boolean [ N ] [ N ] ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    E [ n ] [ n ] = true ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    a = a - 1 ;
    b = b - 1 ;
    E [ a ] [ b ] = true ;
    E [ b ] [ a ] = true ;
  }
  Set < Integer > unvisited = new HashSet < Integer > ( ) ;
  int [ ] color = new int [ N ] ;
  Arrays . fill ( color , 0 ) ;
  Arrays . fill ( color , 0 ) ;
  ArrayList < ArrayList > components = new ArrayList < ArrayList > ( ) ;
  while ( unvisited . size ( ) > 0 ) {
    int v0 = ( Integer ) unvisited . remove ( 0 ) ;
    int [ ] count = {
      0 , 0 }
      ;
      Stack < ArrayList > stack = new Stack < ArrayList > ( ) ;
      stack . push ( new ArrayList < Object > ( ) ) ;
      while ( stack . size ( ) > 0 ) {
        int v = stack . pop ( ) ;
        boolean c = ( boolean ) E [ v ] . get ( ) ;
        if ( color [ v ] == 0 ) {
          color [ v ] = c ;
          unvisited . remove ( v ) ;
          count [ c ] ++ ;
          for ( int u = 0 ;
          u < count [ u ] ;
          u ++ ) {
            boolean f = E [ v ] [ u ] ;
            if ( ! f ) {
              stack . push ( new ArrayList < Object > ( ) ) ;
            }
          }
        }
        else if ( color [ v ] != c ) {
          System . out . println ( - 1 ) ;
          exit ( ) ;
        }
      }
      components . add ( count ) ;
    }
    int L = N / 2 + 1 ;
    boolean [ ] [ ] dp = new boolean [ L ] [ L ] ;
    dp [ 0 ] = true ;
    for ( int a = 0 ;
    a < components . size ( ) ;
    a ++ ) {
      int b = components . get ( a ) ;
      boolean [ ] [ ] ndp = new boolean [ L ] [ L ] ;
      for ( int i = 0 ;
      i < dp . length ;
      i ++