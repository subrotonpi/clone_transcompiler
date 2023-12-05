public static String flips ( String a , String b ) {
  StringBuffer result = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < a . length ( ) ;
  i ++ ) {
    result . append ( a . charAt ( i ) == b . charAt ( i ) ? '0' : '1' ) ;
  }
  /* Flop */
  result . append ( a . charAt ( 0 ) ) ;
  result . append ( b . charAt ( 0 ) == '0' ? '1' : '0' ) ;
  for ( int t = 0 ;
  t < Integer . parseInt ( input ( ) ) ;
  t ++ ) {
    N = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
    L = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
    String [ ] start = input ( ) . split ( " " ) ;
    String [ ] goal = input ( ) . split ( " " ) ;
    int minimum = 1000 ;
    String first = start [ 0 ] ;
    for ( int g = 0 ;
    g < goal . length ;
    g ++ ) {
      String flip = flips ( goal [ g ] , first ) ;
      int popcount = flip . indexOf ( "1" ) ;
      if ( popcount < minimum ) {
        Set < String > outlets = new HashSet < > ( start ) ;
        Set < String > devices = new HashSet < > ( ) ;
        for ( String a : goal ) {
          devices . add ( flop ( a , flip ) ) ;
        }
        if ( outlets . equals ( devices ) ) {
          minimum = popcount ;
        }
      }
    }
  }
  int result = 0 ;
  System . out . println ( "Case #" + ( t + 1 ) + ": " + ( minimum != 1000 ? "NOT POSSIBLE" : "NOT POSSIBLE" ) ) ;
  return result . toString ( ) ;
}
