public static int solve ( List < Card > hand , List < Card > deck , int score , int turns ) {
  if ( hand . isEmpty ( ) || turns == 0 ) return score ;
  Collections . sort ( hand ) ;
  int t , c , s ;
  if ( hand . size ( ) > 0 ) {
    hand . remove ( hand . size ( ) - 1 ) ;
    turns += t - 1 ;
    score += s ;
    if ( c > 0 && deck . size ( ) > 0 ) hand . add ( deck . remove ( deck . size ( ) - 1 ) ) ;
    return solve ( hand , deck , score , turns ) ;
  }
  else {
    int score0 = score ;
    for ( int i = 0 ;
    i < hand . size ( ) ;
    i ++ ) {
      Card card = hand . get ( i ) ;
      t = card . getBetterType ( ) ;
      c = card . getBetterType ( ) ;
      s = card . getBetterType ( ) ;
      if ( c == 1 ) {
        for ( t = hand . get ( i - turns ) ;
        t < card . getBetterType ( ) ;
        t = hand . get ( i ) ) score0 += s ;
        break ;
      }
    }
    t = hand . remove ( hand . size ( ) - 1 ) ;
    c = hand . remove ( hand . size ( ) - 1 ) ;
    s = hand . remove ( hand . size ( ) - 1 ) ;
    turns -- ;
    score += s ;
    if ( c > 0 && deck . size ( ) > 0 ) hand . add ( deck . remove ( deck . size ( ) - 1 ) ) ;
    int score1 = solve ( hand , deck , score , turns ) ;
    return Math . max ( score0 , score1 ) ;
  }
}
