private static void rl ( ) {
  rl ( new Scanner ( System . in ) ) ;
  /* go through the sample */
  int res = 0 ;
  for ( int x : sample ) {
    if ( v == x ) {
      res ++ ;
    }
  }
  /* solve the sample */
  int bestS = 0 ;
  double bestP = - 1 ;
  for ( int a = 2 ;
  a <= m ;
  a ++ ) {
    for ( int b = 2 ;
    b <= m ;
    b ++ ) {
      for ( int c = 2 ;
      c <= m ;
      c ++ ) {
        int [ ] s = {
          a , b , c }
          ;
          int [ ] ps = {
            1 , a , b , c , a * b , b * c , c * a , a * b * c }
            ;
            double p = 0 ;
            boolean bad = false ;
            for ( int v : sample ) {
              if ( ! ps [ v ] ) {
                bad = true ;
              }
            }
            if ( bad ) {
              continue ;
            }
            for ( int v : ps ) {
              p += 1.0 / 8 * go ( v , sample ) ;
            }
            if ( p > bestP ) {
              bestP = p ;
              bestS = s ;
            }
          }
        }
      }
      System . out . println ( Arrays . toString ( bestS ) ) ;
    }
    