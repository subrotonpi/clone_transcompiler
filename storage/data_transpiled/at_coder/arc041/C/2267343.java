public static int N = Integer . parseInt ( input ) {
  int [ ] L = new int [ N ] ;
  int [ ] R = new int [ N ] ;
  int mode = 0 ;
  int prev = 1 ;
  {
    int med ;
    int i ;
    int S , T ;
    int S ;
    int T ;
    int [ ] R = new int [ N ] ;
    int S ;
    int S ;
    int T ;
    int [ ] R = new int [ N ] ;
    int [ ] S = new int [ S ] ;
    int [ ] T = new int [ T ] ;
    S = L . length ;
    T = R . length ;
    int Ld = - S * ( S - 1 ) / 2 ;
    for ( i = S - 2 ;
    i >= 0 ;
    i -- ) Ld += L [ L . length - 1 - L [ i ] ] ;
    int Rd = - T * ( T - 1 ) / 2 ;
    for ( i = 1 ;
    i < T ;
    i ++ ) Rd += R [ i ] - R [ 0 ] ;
    return Ld + Rd + med * Math . max ( S , T ) ;
  }
}
