@ VisibleForTesting static final int [ ] [ ] getMatchingValues ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int nim = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int X = Integer . parseInt ( input . nextLine ( ) ) ;
    int Y = Integer . parseInt ( input . nextLine ( ) ) ;
    int Z = Integer . parseInt ( input . nextLine ( ) ) ;
    int M = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] [ ] bomb = new int [ M ] [ ] ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      bomb [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    for ( int i = 0 ;
    i < maxN ;
    i ++ ) {
      bomb [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    for ( int j = 0 ;
    j < maxN ;
    j ++ ) {
      bomb [ j ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
      nim ^= bomb [ j ] [ j ] ;
      nim ^= maxN - bomb [ j - 1 ] [ j ] - 1 ;
    }
  }
  System . out . println ( nim > 0 ? "WIN" : "LOSE" ) ;
  return bomb ;
}
