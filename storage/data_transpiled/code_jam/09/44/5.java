static private double distance ( Point p1 , Point p2 ) throws IOException {
  final double distance ;
  final double solution ;
  final int [ ] points ;
  {
    solution = 10 * 10 ;
    for ( int p = 0 ;
    p < points . length ;
    p ++ ) {
      solution = distance ( points [ p ] , points [ p ] ) ;
      foobar = ( foobar + points [ p ] . x + points [ p ] . y ) / 2 ;
      if ( foobar >= points [ p ] . y ) {
        solution = Math . min ( solution , foobar ) ;
      }
      else {
        solution = Math . min ( solution , points [ p ] . y ) ;
      }
    }
    return solution ;
  }
  private int solve ( final int [ ] points ) {
    switch ( points . length ) {
      case 1 : return points [ 0 ] . y ;
      case 2 : return Math . max ( points [ 0 ] . x , points [ 1 ] . y ) ;
      case 3 : return solveThirdCase ( points ) ;
    }
  }
  public static void main ( String [ ] args ) {
    Scanner scanner = new Scanner ( System . in ) ;
    scanner . useDelimiter ( "\\s+" ) ;
    int tests = scanner . nextInt ( ) ;
    for ( int testCase = 1 ;
    testCase <= tests ;
    testCase ++ ) {
      final int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
      points = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        points [ i ] = scanner . nextInt ( ) ;
      }
      System . out . print ( "Case #" + testCase + ": " + solve ( points ) + "\n" ) ;
    }
  }
}
