static final String solve ( ) {
  final Scanner s = new Scanner ( System . in ) ;
  final Counter < String > c = new Counter < String > ( ) ;
  for ( final String s : s . nextLine ( ) . split ( "\n" ) ) {
    c . incrementCount ( ) ;
  }
  final String [ ] sol = new String [ xrange ( 10 ) ] ;
  for ( int i = 0 ;
  i < sol . length ;
  i ++ ) sol [ i ] = null ;
  final String [ ] letters = {
    "ZERO" , "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , "NINE" }
    ;
    for ( int i = 0 ;
    i < xrange ( 10 ) ;
    i ++ ) for ( final String s : letters ) check [ i ] += s . charAt ( i ) ;
    final String solution = "" ;
    for ( int i = 0 ;
    i < sol . length ;
    i ++ ) solution += sol [ i ] ;
    System . out . println ( solution ) ;
    if ( __name__ . equals ( "solve" ) ) {
      final int t = Integer . parseInt ( s . nextLine ( ) ) ;
      for ( int i = 0 ;
      i < t ;
      i ++ ) {
        solution += i * sol [ i ] ;
      }
      System . out . println ( solution ) ;
    }
    if ( __name__ . equals ( "solve" ) ) {
      final int t = Integer . parseInt ( s . nextLine ( ) ) ;
      for ( int i = 0 ;
      i < t ;
      i ++ ) {
        solution += i * sol [ i ] ;
      }
      System . out . println ( solution ) ;
    }
    return solution ;
  }
  