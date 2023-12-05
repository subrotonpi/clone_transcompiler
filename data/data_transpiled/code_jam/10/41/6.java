static final Scanner stdin = new Scanner ( System . in ) {
  @ Override public void close ( ) {
    BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    int numCases = Integer . parseInt ( stdin . readLine ( ) ) ;
    for ( int caseNo : xrange ( 1 , numCases + 1 ) ) {
      int N = Integer . parseInt ( stdin . readLine ( ) ) ;
      {
        int i = 0 , j = 0 ;
        int row ;
        int col ;
        if ( i < N ) {
          row = i - j ;
          col = j ;
        }
        else {
          row = N - 1 - j ;
          col = i - N + 1 + j ;
        }
        return new IntRange ( row , col ) ;
      }
    }
  }
  private static final int N = Integer . parseInt ( stdin . readLine ( ) ) ;
  private static final int N = Integer . parseInt ( stdin . readLine ( ) ) ;
  private static final int [ ] [ ] A = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < 2 * N - 1 ;
  i ++ ) {
    String line = stdin . readLine ( ) ;
    for ( int j = 0 ;
    j < line . length ( ) ;
    j ++ ) {
      if ( Character . isDigit ( line . charAt ( j ) ) ) {
        A [ i ] [ j ] = line . charAt ( j ) ;
      }
    }
  }
  int best = 999999999 ;
  for ( int rrow = 0 ;
  rrow < 2 * N - 1 ;
  rrow ++ ) {
    for ( int rcol = 0 ;
    rcol < 2 * N - 1 ;
    rcol ++ ) {
      Map < Integer , Integer > B = new HashMap < Integer , Integer > ( ) ;
      int bad = 0 ;
      for ( int y0 = 0 ;
      y0 < A . size ( ) ;
      y0 ++ ) {
        int x0 = A . get ( y0 ) ;
        int y1 = rrow + ( rrow - y0 ) ;
        int x1 = x0 ;
        if ( ( y1 < A . size ( ) ) && A . get ( y1 , x1 ) != A . get ( y0 , x0 ) ) {
          bad = 1 ;
          break ;
        }
        int y2 = y0 ;
        int x2 = rcol + ( rcol - x0 ) ;
        if ( ( y2 < A . size ( ) ) && A . get ( y2 , x2 ) != A . get ( y2 , x2 ) ) {
          bad = 1 ;
          break ;
        }
        int y3 = rrow + ( rrow - y0 )