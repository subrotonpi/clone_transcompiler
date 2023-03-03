@ VisibleForTesting static int [ ] [ ] createCounters ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] cost = new int [ C ] [ N ] ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) cost [ i ] = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cost [ i ] [ i ] = Lists . newArrayList ( ) ;
  }
  int [ ] [ ] color = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    color [ i ] [ i ] = Lists . newArrayList ( ) ;
  }
  HashMap < Integer , List < Integer >> mod3 = new HashMap < > ( ) ;
  mod3 . put ( 0 , new ArrayList < > ( ) ) ;
  mod3 . put ( 1 , new ArrayList < > ( ) ) ;
  mod3 . put ( 2 , new ArrayList < > ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int m = ( i + j ) % 3 ;
      mod3 . get ( m ) . add ( color [ i ] [ j ] ) ;
    }
  }
  HashMap < Integer , Integer > cnts = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    cnts . put ( i , mod3 . get ( i ) ) ;
  }
  int ans = Integer . MIN_VALUE ;
  for ( int p1 = 0 ;
  p1 < C ;
  p1 ++ ) {
    for ( int p2 = 0 ;
    p2 < C ;
    p2 ++ ) {
      if ( p2 == p1 ) continue ;
      for ( int p3 = 0 ;
      p3 < C ;
      p3 ++ ) {
        if ( p3 == p1 || p3 == p2 ) continue ;
        int [ ] p = {
          p1 , p2 , p3 }
          ;
          int cond = 0 ;
          for ( int i = 0 ;
          i < 3 ;
          i ++ ) {
            for ( int j = 0 ;
            j < 3 ;
            j ++ ) {
              cond += cnts . get ( i ) . get ( j ) * cost [ j ] [ p [ i ] ] ;
            }
          }
          ans = Math . min ( ans , cond ) ;
        }
      }
    }
    System . out . println ( ans ) ;
    return cost ;
  }
  