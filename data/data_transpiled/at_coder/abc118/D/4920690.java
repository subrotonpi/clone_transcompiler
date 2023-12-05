public static int [ ] [ ] solve ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] A = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  /* Num k = Integer.parseInt(input); */
  int [ ] costs = {
    2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 }
    ;
    /* Num k = Integer.parseInt(input); */
    int inf = 1000 ;
    int [ ] dp = new int [ N + 1 ] ;
    for ( int k = 0 ;
    k < N ;
    k ++ ) {
      dp [ k ] = - inf ;
    }
    dp [ 0 ] = 0 ;
    List < Integer > costList = new ArrayList < Integer > ( ) ;
    for ( int k = 0 ;
    k < N ;
    k ++ ) {
      costList . add ( A [ k ] ) ;
    }
    for ( int d = 0 ;
    d < N ;
    d ++ ) {
      for ( int k = 0 ;
      k < N ;
      k ++ ) {
        if ( many - num ( k ) < 0 ) {
          /* No cost */
        }
        else {
          if ( dp [ many - num ( k ) ] == dp [ many ] - 1 ) {
            ans += k ;
            many -= num ( k ) ;
            break ;
          }
          else {
            /* No cost */
          }
        }
      }
    }
    System . out . println ( Integer . parseInt ( ans ) ) ;
    return dp ;
  }
  