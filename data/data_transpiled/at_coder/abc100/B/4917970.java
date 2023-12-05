static final double INF = Double . POSITIVE_INFINITY ;
{
  double D = INF ;
  {
    if ( N != 100 ) {
      System . out . println ( Double . toString ( N ) + "00" * D ) ;
    }
    else {
      N = "101" ;
      System . out . println ( Double . toString ( N ) + "00" * D ) ;
    }
    return D ;
  }
  {
    /* Iterate through the input stream */
    Scanner scanner = new Scanner ( System . in ) ;
    while ( scanner . hasNextLine ( ) ) {
      String line = scanner . nextLine ( ) ;
      for ( String word : line . split ( " " ) ) {
        scanner . nextLine ( ) ;
      }
    }
    scanner . close ( ) ;
  }
  {
    /* Iterate through the input stream */
    Scanner scanner = new Scanner ( System . in ) ;
    while ( scanner . hasNextLine ( ) ) {
      String line = scanner . nextLine ( ) ;
      for ( String word : line . split ( " " ) ) {
        scanner . nextLine ( ) ;
      }
    }
    scanner . close ( ) ;
  }
  /* Iterate through the input stream */
  Scanner scanner = new Scanner ( System . in ) ;
  int D = Integer . parseInt ( scanner . nextLine ( ) ) ;
  int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
  scanner . close ( ) ;
  return D ;
}
