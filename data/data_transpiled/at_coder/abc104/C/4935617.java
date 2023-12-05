public static int D = Integer . parseInt ( input ) {
  int G = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] probs = new int [ D ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    probs [ i ] = new int [ ] {
      ( ( i + 1 ) * 100 ) , p , c }
      ;
      ans += p ;
    }
    for ( int mask = 0 ;
    mask < 1 << D ;
    mask ++ ) {
      int solved = 0 ;
      int myScore = 0 ;
      for ( int i = 0 ;
      i < D ;
      i ++ ) {
        int score = probs [ i ] ;
        int occ = probs [ i ] ;
        int bonus = probs [ i ] ;
        if ( ( mask & ( 1 << i ) ) > 0 ) {
          solved += occ ;
          myScore += score * occ + bonus ;
        }
      }
      for ( int x = D - 1 ;
      x >= 0 ;
      x -- ) {
        if ( myScore >= G ) break ;
        int score = probs [ x ] ;
        int occ = probs [ x ] ;
        int bounDs = probs [ x ] ;
        for ( ;
        ;
        ) {
          solved += 1 ;
          myScore += score ;
          if ( myScore >= G ) break ;
        }
      }
      if ( myScore >= G ) {
        ans = Math . min ( ans , solved ) ;
      }
    }
    System . out . println ( ans ) ;
    return ans ;
  }
  