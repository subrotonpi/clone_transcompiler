public static final int nCr ( int N , int D ) {
  int X , Y ;
  int [ ] aM = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    D = Integer . parseInt ( input . nextLine ( ) ) ;
    X = Math . abs ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    Y = Math . abs ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    if ( X % D != 0 && Y % D != 0 ) {
      System . out . println ( 0 ) ;
      exit ( ) ;
    }
    X /= D ;
    Y /= D ;
    aM [ i ] = 1 ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      aM [ i ] = aM [ i - 1 ] * i ;
    }
  }
  /* nCr */
  {
    int n = N + 1 ;
    int r = N + 1 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      aM [ i ] = aM [ n ] / aM [ n - r ] / aM [ r ] ;
    }
  }
  /* nCrlog */
  {
    int n = N + 1 ;
    int r = N + 1 ;
    int nCrlog = Math . log10 ( aM [ n ] ) - Math . log10 ( aM [ n - r ] ) - Math . log10 ( aM [ r ] ) ;
    if ( N < X + Y ) {
      System . out . println ( 0 ) ;
    }
    else if ( N == X + Y ) {
      System . out . println ( 10 * ( N * Math . log10 ( 0.25 ) + nCrlog ( N , X ) ) ) ;
    }
    else if ( ( N - ( X + Y ) ) % 2 != 0 ) {
      System . out . println ( 0 ) ;
    }
    else {
      int dxy = N - ( X + Y ) ;
      int iC = 0 ;
      for ( int dx = 0 ;
      dx < dxy / 2 ;
      dx ++ ) {
        int dy = ( dxy - 2 * dx ) / 2 ;
        iC += 10 * ( N * Math . log10 ( 0.25 ) + nCrlog ( N , X + dx ) + nCrlog ( N - ( X + dx ) , dx ) + nCrlog ( Y + 2 * dy , dy ) ) ;
      }
      System . out