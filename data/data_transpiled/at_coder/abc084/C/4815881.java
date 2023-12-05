static final double [ ] [ ] range ( int i , int j ) {
  int inf = i ;
  double eps = 1.0 / j ;
  int mod = 10 * j + 7 ;
  double [ ] dd = {
    ( - 1 ) , ( 0 ) , ( 1 ) , ( 1 ) , ( 0 ) , ( 0 , - 1 ) }
    ;
    double [ ] ddn = {
      ( - 1 ) , ( 0 ) , ( - 1 ) , ( 1 ) , ( 1 ) , ( 1 ) , ( 0 , - 1 ) }
      ;
      /* LI */
      for ( int j = 1 ;
      j < N ;
      j ++ ) {
        dd [ j ] [ 0 ] = Integer . parseInt ( System . in . readLine ( ) ) ;
      }
      /* LI_ */
      for ( int j = 1 ;
      j < N ;
      j ++ ) {
        dd [ j ] [ 0 ] = Integer . parseInt ( System . in . readLine ( ) ) ;
      }
      /* LF */
      for ( int j = 1 ;
      j < N ;
      j ++ ) {
        dd [ j ] [ 1 ] = Double . parseDouble ( System . in . readLine ( ) ) ;
      }
      /* LS */
      for ( int j = 1 ;
      j < N ;
      j ++ ) {
        dd [ j ] [ 0 ] = Double . parseDouble ( System . in . readLine ( ) ) ;
      }
      /* I */
      for ( int j = 1 ;
      j < N ;
      j ++ ) {
        int N = N ;
        double [ ] [ ] CSF = new double [ N ] [ N ] ;
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          CSF [ j ] [ 0 ] = LI ( j , i , j ) ;
        }
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          int current = j ;
          double time = 0 ;
          for ( int k = 0 ;
          k < CSF . length ;
          k ++ ) {
            CSF [ k ] [ 0 ] = CS [ current ] [ k ] ;
            if ( time < CSF [ 1 ] ) {
              time = CSF [ 1 ] + CSF [ 0 ] ;
            }
            else if ( time % CSF [ 2 ] == 0 ) {
              time += CSF [ 0 ] ;
            }
            else {
              double div = time % CSF [ 2 ] ;
              time -= div ;
              time += CSF [ 2 ] ;
              time += CSF [ 0 ] ;
            }
            current ++ ;
          }
          System . out . println