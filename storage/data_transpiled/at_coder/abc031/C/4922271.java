public static int seqGame ( int N , @ NonNull int [ ] A ) {
  int Tmax = - Integer . MAX_VALUE ;
  for ( int ti = 0 ;
  ti < N ;
  ti ++ ) {
    int Amax = - Integer . MIN_VALUE ;
    int Aidx = - 1 ;
    for ( int ai = 0 ;
    ai < N ;
    ai ++ ) {
      if ( ti == ai ) {
        continue ;
      }
      int ap ;
      if ( ti < ai ) {
        ap = Integer . valueOf ( A [ ti + 1 ] ) ;
      }
      else {
        ap = Integer . valueOf ( A [ ai + 1 ] ) ;
      }
      if ( Amax < ap ) {
        Amax = ap ;
        Aidx = ai ;
      }
    }
    if ( ti < Aidx ) {
      Tmax = Math . max ( Tmax , Integer . valueOf ( A [ ti ] ) ) ;
    }
    else {
      Tmax = Math . max ( Tmax , Integer . valueOf ( A [ Aidx ] ) ) ;
    }
  }
  if ( getClass ( ) . isEnum ( ) ) {
    N = Integer . parseInt ( input ( ) ) ;
    Arrays . stream ( A ) . forEach ( s -> System . out . println ( s ) ) ;
    int ans = seqGame ( N , A ) ;
    System . out . println ( ans ) ;
  }
  return Tmax ;
}
