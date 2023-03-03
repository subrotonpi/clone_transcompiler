public static int [ ] convert ( String input ) {
  int L = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int [ ] X = new int [ N ] ;
  int [ ] Y = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = Integer . parseInt ( input ) ;
  Y [ 0 ] = L - X [ i ] ;
  int [ ] RL = new int [ X . length ] ;
  int [ ] RSL = new int [ X . length ] ;
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) {
    RL [ i ] = X [ i ] ;
    RSL [ i ] = RSL [ i ] + X [ i ] ;
  }
  int [ ] LL = new int [ X . length ] ;
  int [ ] LSL = new int [ X . length ] ;
  for ( int i = X . length - 1 ;
  i >= 0 ;
  i -- ) {
    LL [ i ] = L - X [ i ] ;
    LSL [ i ] = LSL [ i ] + ( L - X [ i ] ) ;
  }
  int [ ] D = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) D [ i ] = RSL [ i ] + LSL [ N - i ] ;
  int Ans = Math . max ( RL [ N ] , LL [ N ] ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int t ;
    int k = i ;
    if ( i < ( N + 1 ) / 2 ) {
      k = N - 2 * i ;
      t = ( D [ i ] - LSL [ Math . max ( k - 1 , 0 ) ] ) * 2 - LL [ N - i ] ;
      s = ( D [ i ] - LSL [ k ] ) * 2 - RL [ i ] ;
      Ans = Math . max ( Ans , t , s ) ;
    }
    else {
      k = 2 * i - N ;
      t = ( D [ i ] - RSL [ Math . max ( k - 1 , 0 ) ] ) * 2 - RL [ i ] ;
      s = ( D [ i ] - RSL [ k ] ) * 2 - LL [ N - i ] ;
      Ans = Math . max ( Ans , t , s ) ;
    }
  }
  System . out . println ( Ans ) ;
  return