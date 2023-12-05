@ InputFunction public static int dValentine ( int N , int M , int P , int Q , int R , int [ ] [ ] C ) {
  int [ ] [ ] choco = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    choco [ i ] [ N - 1 ] [ i ] = C [ i ] [ 2 ] ;
  }
  int ans = 0 ;
  for ( int [ ] girl : new int [ N ] [ P ] ) {
    int [ ] target = new int [ M ] ;
    for ( int i = 0 ;
    i < girl . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < M ;
      j ++ ) {
        target [ j ] += choco [ girl [ i ] [ j ] ] ;
      }
    }
    ans = Math . max ( ans , Integer . valueOf ( target ) ) ;
  }
  return ans ;
}
