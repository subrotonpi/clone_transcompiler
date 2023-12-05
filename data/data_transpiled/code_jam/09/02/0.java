static final int [ ] [ ] read ( int [ ] [ ] res ) {
  int qt = 0 ;
  int [ ] [ ] q = new int [ 3 ] [ 3 ] ;
  int color = 0 ;
  for ( int a = 0 ;
  a < 3 ;
  a ++ ) {
    int [ ] a = new int [ 3 ] ;
    int i = 0 ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      System . err . println ( Arrays . toString ( a ) ) ;
    }
    int [ ] [ ] a = new int [ 3 ] [ 3 ] ;
    for ( int test = 0 ;
    test < 3 ;
    test ++ ) {
      int n = xrange ( n ) ;
      int m = xrange ( m ) ;
      System . err . println ( Arrays . toString ( a ) ) ;
      int [ ] [ ] dr = {
        - 1 , 0 , 0 , 1 }
        ;
        int [ ] dc = {
          0 , - 1 , 1 , 0 }
          ;
          HashMap < Integer , Integer > to = new HashMap < Integer , Integer > ( ) ;
          for ( int r = 0 ;
          r < n ;
          r ++ ) {
            for ( int c = 0 ;
            c < m ;
            c ++ ) {
              int best = a [ r ] [ c ] ;
              int bestd = - 1 ;
              for ( int d = 0 ;
              d < 4 ;
              d ++ ) {
                int r2 = r + dr [ d ] ;
                int c2 = c + dc [ d ] ;
                if ( ( r2 < 0 ) || ( r2 >= n ) || ( c2 < 0 ) || ( c2 >= m ) ) continue ;
                int lvl = a [ r2 ] [ c2 ] ;
                if ( ( lvl < best ) && ( best == 0 ) ) {
                  best = lvl ;
                  bestd = d ;
                }
              }
              if ( ( bestd != - 1 ) && ( r2 < n ) ) {
                int r2 = r + dr [ bestd ] ;
                int c2 = c + dc [ bestd ] ;
                if ( to . containsKey ( new Integer ( r2 ) ) ) to . put ( new Integer ( r2 ) , new Integer ( c2 ) ) ;
                if ( to . containsKey ( new Integer ( r2 ) ) ) to . put ( new Integer ( r2 ) , new Integer ( c2 ) ) ;
              }
            }
          }
          res [ i ] = color ;
        }
      }
      System . err . println ( "Case #" + ( test + 1 ) + ":" ) ;
      for ( int i = 0 ;
      i < xrange (