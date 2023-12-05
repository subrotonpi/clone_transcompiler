static final int [ ] getStdIn ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] H = new int [ N ] ;
  int [ ] S = new int [ N ] ;
  int th = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    S [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* Check P */
  int T = Math . floor ( ( P - H ) / S ) ;
  int P_low = Integer . MIN_VALUE ;
  int P_high = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int p = H [ i ] ;
    if ( ( P_low < p ) && ( p > P_high ) ) {
      P_low = p ;
    }
  }
  return H ;
}
