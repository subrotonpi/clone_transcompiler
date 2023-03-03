@ VisibleForTesting static int [ ] [ ] createCosts ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] cost = new int [ C ] [ ] ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    cost [ i ] = Lists . newArrayList ( ) ;
  }
  int [ ] [ ] color = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    color [ i ] = Lists . newArrayList ( ) ;
  }
  int [ ] [ ] mod3 = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int m = ( i + j ) % 3 ;
      mod3 [ m ] [ i ] = color [ i ] [ j ] ;
    }
  }
  Counter [ ] cnts = new Counter [ C ] [ ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    cnts [ i ] = new Counter [ C ] ;
  }
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    cnts [ i ] . incrementCount ( ) ;
  }
  int [ ] [ ] costMod = new int [ C ] [ C ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int to = 0 ;
    to < C ;
    to ++ ) {
      int cond = 0 ;
      for ( int from : cnts [ i ] . keySet ( ) ) {
        cond += cnts [ i ] [ from ] * cost [ from ] [ to ] ;
      }
      costMod [ i ] [ to ] = cond ;
    }
  }
  int ans = Integer . MIN_VALUE ;
  for ( int [ ] p : permutations ( C , 3 ) ) {
    int cond = 0 ;
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      cond += costMod [ i ] [ p [ i ] ] ;
    }
    ans = Math . min ( ans , cond ) ;
  }
  System . out . println ( ans ) ;
  return cost ;
}
