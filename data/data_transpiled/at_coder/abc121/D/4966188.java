static final double INF = Double . POSITIVE_INFINITY ;
{
  double f = INF ;
  if ( n % 2 == 0 ) {
    if ( ( n / 2 ) % 2 == 0 ) {
      return n ;
    }
    else {
      return 1 ^ n ;
    }
  }
  else {
    if ( ( ( n + 1 ) / 2 ) % 2 == 0 ) {
      return 0 ;
    }
    else {
      return 1 ;
    }
  }
  /* solve the first two tokens */
  {
    int A = 0 ;
    int B = 0 ;
    System . out . println ( f ( B ) ^ f ( A - 1 ) ) ;
    return A ;
  }
  /* main loop */
  {
    StringTokenizer tokenizer = new StringTokenizer ( System . in , " " ) ;
    while ( tokenizer . hasMoreTokens ( ) ) {
      String line = tokenizer . nextToken ( ) ;
      for ( String word : line . split ( " " ) ) {
        /* skip the word */
        token = new StringTokenizer ( word ) ;
      }
    }
    {
      StringTokenizer tokens = new StringTokenizer ( System . in , " " ) ;
      A = Integer . parseInt ( tokens . nextToken ( ) ) ;
      B = Integer . parseInt ( tokens . nextToken ( ) ) ;
      solve ( A , B ) ;
    }
  }
  if ( className . equals ( "java.util.Scanner" ) ) {
    /* main loop */
  }
  return f ;
}
