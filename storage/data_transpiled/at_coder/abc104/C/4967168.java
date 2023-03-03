public static int d = Integer . parseInt ( input ) {
  int g = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] problems = new int [ d ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < d ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    problems [ i ] = new int [ ] {
      ( ( i + 1 ) * 100 ) , p , c }
      ;
      ans += p ;
    }
    for ( int mask = 0 ;
    mask < 1 << d ;
    mask ++ ) {
      int solvedAmount = 0 ;
      int myScore = 0 ;
      for ( int i = 0 ;
      i < d ;
      i ++ ) {
        int score = problems [ i ] ;
        int occ = problems [ i ] ;
        int bonus = problems [ i ] ;
        if ( ( mask & ( 1 << i ) ) > 0 ) {
          solvedAmount += occ ;
          myScore += score * occ + bonus ;
        }
      }
      for ( int x = d - 1 ;
      x >= 0 ;
      x -- ) {
        if ( myScore >= g ) break ;
        if ( ( mask & ( 1 << x ) ) > 0 ) continue ;
        int score = problems [ x ] ;
        int occ = problems [ x ] ;
        for ( ;
        occ > 0 ;
        ) {
          solvedAmount ++ ;
          myScore += score ;
          if ( myScore >= g ) break ;
        }
      }
      if ( myScore >= g ) ans = Math . min ( ans , solvedAmount ) ;
    }
    System . out . println ( ans ) ;
    return ans ;
  }
  