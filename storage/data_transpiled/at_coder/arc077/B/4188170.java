public static int N = Integer . parseInt ( input ) {
  int [ ] L = new int [ N + 1 ] ;
  int [ ] a = new int [ N + 2 ] ;
  for ( int i = 0 ;
  i < N + 2 ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
  }
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    if ( L [ a [ i ] ] == - 1 ) {
      L [ a [ i ] ] = i ;
    }
    else {
      int x1 = ( Math . min ( L [ a [ i ] ] , i ) ) ;
      int x2 = ( Math . max ( L [ a [ i ] ] , i ) ) ;
      int i ;
      int i ;
      int power = ( a [ i ] >> 1 ) ? a [ i ] : a [ i ] ;
      int i ;
      int j ;
      int i ;
      int j ;
      int k ;
      int j ;
      int k ;
      int j ;
      int k ;
      int a = a [ i ] ;
      j = j ;
      k = j ;
      j = k ;
      k = k + 1 ;
      j = k + 1 ;
      k = k + 1 ;
      j = k + 1 ;
      k = k + 1 ;
      j = k + 1 ;
      k = k + 2 ;
      j = k + 2 ;
      k = k + 3 ;
      j = k + 4 ;
      k = k + 5 ;
      j = k + 5 ;
      k = k + 6 ;
      k = k + 6 ;
      j = k + 6 ;
      k = k + 7 ;
      j = k + 6 ;
      k = k + 7 ;
    }
  }
  int [ ] fac_lim = N ;
  int [ ] fac = new int [ fac_lim + 1 ] ;
  fac [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < fac_lim ;
  i ++ ) {
    fac [ i + 1 ] = fac [ i ] * ( i + 1 ) ;
    fac [ i + 1 ] = fac [ i + 1 ] % 1000000007 ;
  }
  int [ ] fac_inv = new int [ fac_lim + 1 ] ;
  fac_inv [ fac_lim ] = power ( fac [ fac_lim ] , 1000000005 ) ;
  for ( int i = fac_lim ;
  i > 0 ;
  i -- ) {
    fac_inv [ i - 1 ] = ( fac_inv [ i ] * i ) % 1000000007 ;
  }
  / * ▁