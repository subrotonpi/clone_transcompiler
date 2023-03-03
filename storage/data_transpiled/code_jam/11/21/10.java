public static void inFile ( File inFile ) throws IOException {
  File outFile = new File ( "A-large.in.in" ) ;
  int N = Integer . parseInt ( inFile . nextLine ( ) ) ;
  for ( int I = 1 ;
  I <= N ;
  I ++ ) {
    int M = Integer . parseInt ( inFile . nextLine ( ) ) ;
    char [ ] [ ] grid = new char [ M ] [ M ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) grid [ i ] = Character . toString ( inFile . nextLine ( ) ) ;
    int [ ] won = new int [ M ] ;
    int [ ] played = new int [ M ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) won [ i ] = 0 ;
    int [ ] played = new int [ M ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) played [ i ] = 0 ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      for ( int j = 0 ;
      j < M ;
      j ++ ) if ( grid [ i ] [ j ] != '.' ) {
        played [ i ] ++ ;
        if ( grid [ i ] [ j ] == '1' ) won [ i ] ++ ;
      }
    }
  }
  double [ ] owp = new double [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) owp [ i ] = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int n = 0 ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) if ( grid [ i ] [ j ] != '.' ) owp [ i ] += ( won [ j ] - ( int ) grid [ j ] [ i ] ) / ( played [ j ] - 1 ) ;
    n ++ ;
    if ( n != 0 ) owp [ i ] /= n ;
  }
  double [ ] rpi = new double [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    rpi [ i ] += .25 * won [ i ] / played [ i ] + .5 * owp [ i ] ;
    int oowp = 0 ;
    n = 0 ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) if ( grid [ i ] [ j ] != '.' ) oowp += owp [ j ] ;
    n ++ ;
    if ( n != 0 ) rpi [ i