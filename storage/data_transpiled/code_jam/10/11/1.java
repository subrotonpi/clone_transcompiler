public static int T = Integer . parseInt ( Scanner in ) {
  for ( int testCase = 0 ;
  testCase < T ;
  testCase ++ ) {
    int N = in . nextInt ( ) ;
    int K = in . nextInt ( ) ;
    char [ ] grid2 = new char [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( char ch = in . next ( ) ;
      ch != '.' ;
      ch = in . next ( ) ) {
        if ( ch != '.' ) grid2 [ i ] = ch + grid2 [ i ] ;
      }
      while ( grid2 [ i ] . length ( ) < N ) grid2 [ i ] += '.' ;
    }
    boolean winR = false ;
    boolean winB = false ;
    int [ ] di = {
      - 1 , - 1 , - 1 , 0 , 1 , 1 , 1 , 0 }
      ;
      int [ ] dj = {
        - 1 , 0 , 1 , 1 , - 1 , 0 , 1 , - 1 }
        ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          for ( int j = 0 ;
          j < N ;
          j ++ ) {
            if ( grid2 [ i ] [ j ] == '.' ) continue ;
            for ( int dir = 0 ;
            dir < 8 ;
            dir ++ ) {
              int ci = i , cj = j ;
              boolean fail = false ;
              for ( int steps = 0 ;
              steps < K ;
              steps ++ ) {
                if ( ci >= 0 && cj >= 0 && ci < N && cj < N && grid2 [ ci ] [ cj ] == grid2 [ i ] [ j ] ) {
                  ci += di [ dir ] ;
                  cj += dj [ dir ] ;
                }
                else {
                  fail = true ;
                  break ;
                }
              }
              if ( ! fail ) {
                if ( grid2 [ i ] [ j ] == 'B' ) winB = true ;
                else winR = true ;
              }
            }
          }
        }
        String s = "Neither" ;
        if ( winR && winB ) s = "Both" ;
        else if ( winR ) s = "Red" ;
        else if ( winB ) s = "Blue" ;
        System . out . println ( "Case #" + ( testCase + 1 ) + ": " + s ) ;
      }
      return T ;
    }
    