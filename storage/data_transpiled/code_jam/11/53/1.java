static final int [ ] [ ] solve ( int m , int n , int [ ] [ ] mmm ) {
  System . setRecursionDesired ( 11000 ) ;
  final int MOD = 1000003 ;
  {
    int [ ] [ ] colors = new int [ m ] [ n ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int answer = doTest ( input ) ;
      System . out . println ( "Case #" + ( test + 1 ) + ": " + answer ) ;
      System . out . flush ( ) ;
    }
  }
  {
    int [ ] [ ] edges = new int [ m ] [ n ] ;
    int [ ] [ ] neighbours = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        char ch = mmm [ i ] [ j ] ;
        int di , dj ;
        if ( ch == '|' ) {
          di = 1 ;
          dj = 0 ;
        }
        if ( ch == '-' ) {
          di = 0 ;
          dj = 1 ;
        }
        if ( ch == '/' ) {
          di = 1 ;
          dj = - 1 ;
        }
        if ( ch == '\\' ) {
          di = 1 ;
          dj = 1 ;
        }
        int i1 = ( i + di ) % m ;
        int i2 = ( i - di ) % m ;
        int j1 , j2 ;
        int c1 = i1 * n + j1 ;
        int c2 = i2 * n + j2 ;
        edges [ i ] [ j ] = c1 ;
        neighbours [ c1 ] [ j1 ] = c2 ;
        neighbours [ c2 ] [ j1 ] = c1 ;
      }
    }
    colors = new int [ nvert ] [ n ] ;
    int clr = 0 ;
    for ( int i = 0 ;
    i < nvert ;
    i ++ ) {
      if ( colors [ i ] == 0 ) {
        color ( neighbours , colors , i , clr ) ;
        clr ++ ;
      }
    }
    int [ ] cedges = new int [ clr ] ;
    int [ ] cvert = new int [ clr ] ;
    for ( int i = 0 ;
    i < nvert ;
    i ++ ) {
      cvert [ colors [ i ] ] ++ ;
    }
    for ( int x = 0 ;
    x < edges . length ;
    x ++ ) {
      cedges [ colors [ x ] ] ++ ;
    }
    int res = 1 ;
    for ( int i = 0 ;
    i < clr ;
    i ++ )