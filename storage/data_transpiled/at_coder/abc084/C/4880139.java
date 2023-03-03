@ VisibleForTesting static int ceil ( int N ) {
  int [ ] CSF = new int [ N - 1 ] ;
  for ( int i = 0 ;
  i < CSF . length ;
  i ++ ) {
    CSF [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    if ( j == N - 1 ) {
      System . out . println ( 0 ) ;
      exit ( ) ;
    }
    int cc = CSF [ j ] ;
    int ss = CSF [ j ] ;
    int ff = CSF [ j ] ;
    int t = ss + cc ;
    for ( int i = j + 1 ;
    i < N - 1 ;
    i ++ ) {
      int c = CSF [ i ] ;
      int s = CSF [ i ] ;
      int f = CSF [ i ] ;
      if ( t <= s ) {
        t = s + c ;
      }
      else {
        int num = ceil ( t / f ) ;
        t = num * f + c ;
      }
    }
    System . out . println ( t ) ;
  }
  return N ;
}
