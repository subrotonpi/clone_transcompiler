static final int [ ] getLevels ( ) {
  final int [ ] [ ] points = new int [ 2 ] [ 2 ] ;
  final double INF = Double . POSITIVE_INFINITY ;
  System . arraycopy ( points , 0 , points , 0 , points . length ) ;
  final double [ ] dy = {
    0 , - 1 , 0 , 1 }
    ;
    final double [ ] dx = {
      1 , 0 , - 1 , 0 }
      ;
      /* inside the y and x */
      final int y = points [ 0 ] [ 0 ] ;
      final int x = points [ 1 ] [ 0 ] ;
      final int H = points [ 2 ] [ 1 ] ;
      final int W = points [ 3 ] [ 2 ] ;
      /* main loop */
      final int N = input . nextInt ( ) ;
      final int S = input . nextInt ( ) ;
      final int r = S < N ? N : S ;
      final int g = S < N ? N : S ;
      final int b = S < N ? N : S ;
      System . out . println ( r % 2 + g % 2 + b % 2 ) ;
      if ( __name__ == "main" ) {
        main ( ) ;
      }
      return dy ;
    }
    