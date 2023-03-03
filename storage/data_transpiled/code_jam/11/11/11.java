public static void inFile ( Scanner in ) throws FileNotFoundException {
  int num_cases = in . nextInt ( ) ;
  for ( int iter = 0 ;
  iter < num_cases ;
  iter ++ ) {
    String [ ] testCase = in . nextLine ( ) . split ( " " ) ;
    Arrays . sort ( testCase ) ;
    for ( int i = 1 ;
    i < 2 * Integer . parseInt ( testCase [ 0 ] ) ;
    i += 2 ) {
      testCase [ i ] = new int [ ] {
        ( Integer . parseInt ( testCase [ i ] ) == 'B' ) ? 1 : - 1 , ( int ) ( Double . parseDouble ( testCase [ i + 1 ] ) ) }
        ;
      }
      int x = 1 , y = 1 , t = 0 ;
      int xt = 1 , yt = 1 , d = 1 ;
      while ( testCase . length > 0 ) {
        int [ ] z = testCase [ 0 ] . split ( " " ) ;
        if ( z [ 0 ] > 0 ) {
          d = Math . max ( 0 , Math . abs ( z [ 1 ] - x ) - ( t - xt ) ) ;
          t = t + d + 1 ;
          x = z [ 1 ] ;
          xt = t ;
        }
        else {
          d = Math . max ( 0 , Math . abs ( z [ 1 ] - y ) - ( t - yt ) ) ;
          t = t + d + 1 ;
          y = z [ 1 ] ;
          yt = t ;
        }
      }
      System . out . println ( "Case #" + iter + ": " + ( t - 1 ) ) ;
    }
  }
  