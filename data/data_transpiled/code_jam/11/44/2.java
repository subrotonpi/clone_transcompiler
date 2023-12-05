static final int solve ( int P , int [ ] [ ] wh ) throws IOException {
  final int [ ] [ ] nbh = new int [ P ] [ ] ;
  wh = wh . clone ( ) ;
  for ( int test = 0 ;
  test < N ;
  test ++ ) {
    int ans1 = doTest ( input ) ;
    System . out . format ( "Case #%d: %s%n" , test + 1 , ans1 , ans2 ) ;
    System . out . flush ( ) ;
  }
  final int [ ] distance = new int [ P ] ;
  final int [ ] [ ] maxthr = new int [ P ] [ ] ;
  for ( int x = 0 ;
  x < P ;
  x ++ ) {
    distance [ x ] = new int [ N ] ;
    maxthr [ x ] = new int [ N ] ;
  }
  Set < Integer > ep = new HashSet < Integer > ( ) ;
  for ( int x = 0 ;
  x < P ;
  x ++ ) {
    ep . add ( x ) ;
    distance [ x ] = 0 ;
    maxthr [ x ] [ 0 ] = new int [ N ] ;
    int d0 = 0 ;
    while ( ! ep . contains ( 1 ) ) {
      Set < Integer > ep2 = new HashSet < Integer > ( ) ;
      for ( int x = 0 ;
      x < ep . size ( ) ;
      x ++ ) {
        for ( int y = 0 ;
        y < maxthr [ x ] [ x ] ;
        y ++ ) {
          if ( distance [ y ] < 0 ) {
            int a = nbh [ x ] . length ;
            int b = nbh [ y ] . length ;
            int mxthr = - 1 ;
            for ( int s = 0 ;
            s < a ;
            s ++ ) {
              int thr = maxthr [ x ] [ y ] ;
              int th = thr - 1 + b ;
              int ll = nbh [ x ] . length + Arrays . binarySearch ( nbh [ y ] , x ) ;
              if ( s >= 0 ) ll += nbh [ s ] [ b ] ;
              Set < Integer > ss = new HashSet < Integer > ( Arrays . copyOf ( nbh [ x ] , a ) ) ;
              for ( int tt = 0 ;
              tt < a ;
              tt ++ ) {
                if ( ss . contains ( tt ) ) th -- ;
              }
              mxthr = Math . max ( mxthr , th ) ;
            }
            maxthr [ x ] [ y ] = new int [ N ] ;
            ep2 . add