public static int [ ] getA ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int mi = 100000000 ;
  int ma = - 100000000 ;
  int miN = 0 ;
  int maN = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] > ma ) {
      ma = A [ i ] ;
      maN = i + 1 ;
    }
    if ( A [ i ] < mi ) {
      mi = A [ i ] ;
      miN = i + 1 ;
    }
  }
  if ( mi >= 0 ) {
    System . out . println ( N - 1 ) ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      System . out . println ( i + 1 + " " + i + 2 ) ;
    }
  }
  else if ( ma <= 0 ) {
    System . out . println ( N - 1 ) ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      System . out . println ( N - i + " " + N - i - 1 ) ;
    }
  }
  else {
    System . out . println ( N + N - 1 ) ;
    if ( Math . abs ( ma ) > Math . abs ( mi ) ) {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        System . out . println ( maN + " " + i + 1 ) ;
      }
      for ( int j = 0 ;
      j < N - 1 ;
      j ++ ) {
        System . out . println ( j + 1 + " " + j + 2 ) ;
      }
    }
    else {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        System . out . println ( miN + " " + i + 1 ) ;
      }
      for ( int j = 0 ;
      j < N - 1 ;
      j ++ ) {
        System . out . println ( N - j + " " + N - j - 1 ) ;
      }
    }
  }
  return A ;
}
