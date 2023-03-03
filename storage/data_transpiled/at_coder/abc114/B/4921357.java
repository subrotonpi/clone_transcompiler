static final double INF = Double . POSITIVE_INFINITY ;
{
  String S = S . toString ( ) ;
  System . out . println ( Math . min ( Math . abs ( Integer . parseInt ( S . substring ( i , i + 3 ) ) - 753 ) , Integer . MAX_VALUE ) ) ;
  return INF ;
  /* Iterate through the input stream */
  try {
    BufferedReader reader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    String line ;
    while ( ( line = reader . readLine ( ) ) != null ) {
      for ( String word : line . split ( " " ) ) {
        /* Iterate through the tokens */
        StringTokenizer tokens = new StringTokenizer ( word ) ;
        int S = Integer . parseInt ( tokens . nextToken ( ) ) ;
        solve ( S ) ;
      }
    }
  }
  catch ( Exception e ) {
    e . printStackTrace ( ) ;
  }
  if ( getClass ( ) . isAnonymousClass ( ) ) {
    return INF ;
  }
  return INF ;
}
