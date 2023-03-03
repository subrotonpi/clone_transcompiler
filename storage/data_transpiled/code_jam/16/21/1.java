@ VisibleForTesting static String [ ] [ ] eliminate ( Fraction [ ] [ ] matrix ) {
  int n = matrix . length , m = matrix [ 0 ] . length - 1 ;
  for ( int r : xrange ( m ) ) {
    int i = r ;
    while ( matrix [ i ] [ r ] == 0 ) ++ i ;
    matrix [ r ] = matrix [ i ] [ r ] ;
    Fraction s = new Fraction ( matrix [ r ] [ r ] ) ;
    for ( int j : xrange ( m + 1 ) ) matrix [ r ] [ j ] /= s ;
    for ( int i : xrange ( n ) ) {
      if ( i != r && matrix [ i ] [ r ] != 0 ) {
        s = matrix [ i ] [ r ] ;
        for ( int j : xrange ( m + 1 ) ) matrix [ i ] [ j ] -= matrix [ r ] [ j ] * s ;
      }
    }
  }
  for ( int i : xrange ( m , n ) ) {
    assert matrix [ i ] [ m ] == 0 ;
  }
  String WORDS = "ZERO ONE TWO THREE FOUR FIVE SIX SEVEN EIGHT NINE" . split ( " " ) ;
  for ( int t = 1 ;
  t <= input . nextInt ( ) ;
  t ++ ) {
    Scanner s = new Scanner ( System . in ) ;
    int [ ] [ ] eqns = new int [ 2 ] [ ] ;
    for ( int c = 0 ;
    c < 26 ;
    c ++ ) {
      char C = ( char ) ( 'A' + c ) ;
      int [ ] eqn = new int [ s . nextInt ( ) ] ;
      for ( int i = 0 ;
      i < eqn . length ;
      i ++ ) eqn [ i ] = WORDS [ i ] . indexOf ( C ) ;
      eqn [ i ] = s . nextInt ( ) ;
      eqns [ i ] = eqn ;
    }
    int [ ] x = eliminate ( eqns ) ;
    StringBuffer ans = new StringBuffer ( ) ;
    for ( int i = 0 ;
    i < x . length ;
    i ++ ) {
      if ( x [ i ] > 0 ) ans . append ( ( char ) ( 48 + i ) * Integer . parseInt ( x [ i ] ) ) ;
    }
    System . out . println ( "Case #" + t + ": " + ans ) ;
  }
  return matrix ;
}
