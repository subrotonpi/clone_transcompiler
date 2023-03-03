static final double INF = Double . MAX_VALUE ;
final double MOD = 10 * * 9 + 7 ;
{
  /* LI */
  for ( int i = 0 ;
  i < in . length ;
  i ++ ) {
    /* LI_ */
    for ( int j = 0 ;
    j < in . length ;
    j ++ ) {
      /* LS */
      for ( int j = in . length - 1 ;
      j < in . length ;
      j ++ ) {
        /* II */
      }
    }
  }
  {
    /* SI */
    Scanner scanner = new Scanner ( System . in ) ;
    /* main */
    String s = scanner . next ( ) ;
    double res = 0 ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      int u = s . length ( ) - i - 1 ;
      int d = s . length ( ) - u - 1 ;
      if ( s . charAt ( i ) == 'U' ) {
        res += u + 2 * d ;
      }
      else {
        res += 2 * u + d ;
      }
    }
    return res ;
  }
}
