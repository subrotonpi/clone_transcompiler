static final double INF = Double . POSITIVE_INFINITY ;
{
  double X = INF ;
  double Y = INF ;
  {
    System . out . println ( X + Y / 2 ) ;
    return X ;
  }
  {
    /* Iterate through the input stream */
    Scanner scanner = new Scanner ( System . in ) ;
    while ( scanner . hasNextDouble ( ) ) {
      String line = scanner . nextLine ( ) ;
      for ( String word : line . split ( " " ) ) {
        /* Iterate through the tokens */
        StringTokenizer tokens = new StringTokenizer ( line ) ;
        X = Integer . parseInt ( tokens . nextToken ( ) ) ;
        Y = Integer . parseInt ( tokens . nextToken ( ) ) ;
        solve ( X , Y ) ;
      }
    }
  }
  ;
  if ( Class . isAnnotationPresent ( Test . class ) ) {
    System . out . println ( "Test passed" ) ;
  }
  return X ;
}
