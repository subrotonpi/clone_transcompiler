static private int countWinners ( int minA , int maxA , int minB , int maxB ) {
  final double phi = 0.5 * ( 1.0 + Math . sqrt ( 5.0 ) ) ;
  /* Count the number of winners */
  int result = 0 ;
  final int numberOfBs = maxB - minB + 1 ;
  for ( int A = minA ;
  A <= maxA ;
  A ++ ) {
    final double minLosingB = Math . ceil ( A / phi ) ;
    final double maxLosingB = Math . floor ( A * phi ) ;
    final int loosers = Math . min ( maxB , maxLosingB ) - Math . max ( minB , minLosingB ) + 1 ;
    if ( loosers < 0 ) {
      loosers = 0 ;
    }
    result += numberOfBs - loosers ;
  }
  /* Invalid input */
  final String firstLine = next ( ) ;
  final List < Integer > numbers = new ArrayList < Integer > ( ) ;
  for ( String s : firstLine . split ( " " ) ) {
    numbers . add ( Integer . parseInt ( s ) ) ;
  }
  if ( numbers . size ( ) != 1 ) {
    throw new IllegalArgumentException ( ) ;
  }
  final int T = numbers . get ( 0 ) ;
  for ( int caseNumber = 1 ;
  caseNumber <= T ;
  caseNumber ++ ) {
    final String thisLine = next ( ) ;
    numbers = new ArrayList < Integer > ( ) ;
    for ( String s : thisLine . split ( " " ) ) {
      numbers . add ( Integer . parseInt ( s ) ) ;
    }
    if ( numbers . size ( ) != 4 ) {
      throw new IllegalArgumentException ( ) ;
    }
    final int minA = numbers . get ( 0 ) ;
    final int maxA = numbers . get ( 1 ) ;
    final int minB = numbers . get ( 2 ) ;
    final int maxB = numbers . get ( 3 ) ;
    assert ( 1 <= minA && maxA <= 10 * 6 ) ;
    assert ( 1 <= minB && maxB <= 10 * 6 ) ;
    final int result = countWinners ( minA , maxA , minB , maxB ) ;
    System . out . println ( "Case #{0}: {1}" , caseNumber , result ) ;
  }
  return result ;
}
