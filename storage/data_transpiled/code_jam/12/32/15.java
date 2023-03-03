static final Scanner in = new Scanner ( System . in ) {
  private PrintWriter out = new PrintWriter ( System . out ) {
    private double d ;
    private void printAnswer ( int testCase , String answer ) {
      out . println ( "Case #" + ( testCase + 1 ) + ": " + answer ) ;
    }
    private void solveSimple ( double tc , double a , double d ) {
      double t = Math . sqrt ( 2.0 * d / a ) ;
      if ( t < tc ) t = tc ;
      out . println ( t ) ;
    }
    private void solveCase ( int caseNo ) {
      final String d = in . nextLine ( ) ;
      final String n = in . nextLine ( ) ;
      final String a = in . nextLine ( ) ;
      d = Double . parseDouble ( d ) ;
      final int n = Integer . parseInt ( n ) ;
      final int a = Integer . parseInt ( a ) ;
      printAnswer ( caseNo , "" ) ;
      double xc = d + 100.0 ;
      double tc = 0 ;
      if ( n == 1 ) {
        final double t0 = Double . parseDouble ( in . nextLine ( ) ) ;
        final double x0 = Double . parseDouble ( in . nextLine ( ) ) ;
        if ( x0 > d + ( 0.00000001 ) ) tc = 0 ;
        else {
          tc = t0 ;
          System . out . println ( tc ) ;
        }
      }
      if ( n == 2 ) {
        final double t0 = Double . parseDouble ( in . nextLine ( ) ) ;
        final double x0 = Double . parseDouble ( in . nextLine ( ) ) ;
        final double t1 = Double . parseDouble ( in . nextLine ( ) ) ;
        final double x1 = Double . parseDouble ( in . nextLine ( ) ) ;
        final double vc = ( x1 - x0 ) / ( t1 - t0 ) ;
        if ( x1 > d ) tc = t0 + ( d - x0 ) / vc ;
        else tc = t1 ;
      }
      final double [ ] av = in . nextLine ( ) . split ( " " ) ;
      for ( final double a : av ) {
        solveSimple ( tc , a , d ) ;
      }
    }
    private static void main ( String [ ] args ) {
      int cases = Integer . parseInt ( in . nextLine ( ) ) ;
      for ( int testCase = 0 ;
      testCase < cases ;
      testCase ++ ) {
        solveCase ( testCase ) ;
      }
    }
  }
  ;
  if ( className . equals ( "org.sqlite.JDBC" ) ) {
    in . close ( ) ;
    out . close ( ) ;
  }
  else {
    in . close ( ) ;
  }
  