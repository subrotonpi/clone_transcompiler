static final Scanner in = new Scanner ( System . in ) {
  private PrintWriter out = new PrintWriter ( System . out ) {
    @ Override public String nextLine ( ) {
      String x = in . nextLine ( ) ;
      if ( x . length ( ) > 0 ) {
        return x . substring ( 0 , x . length ( ) - 1 ) ;
      }
      else {
        return x ;
      }
    }
    @ Override public int nextInt ( ) {
      return Integer . parseInt ( in . nextLine ( ) ) ;
    }
    @ Override public float nextDouble ( ) {
      return Float . parseFloat ( in . nextLine ( ) ) ;
    }
    @ Override public int nextInt ( ) {
      String xs [ ] = in . nextLine ( ) . split ( " " ) ;
      return Arrays . asList ( Integer . parseInt ( xs [ 0 ] ) ) . iterator ( ) . next ( ) ;
    }
    @ Override public float nextDouble ( ) {
      String xs [ ] = in . nextLine ( ) . split ( " " ) ;
      return Arrays . asList ( Double . parseDouble ( xs [ 0 ] ) ) . iterator ( ) . next ( ) ;
    }
    @ Override public void writeline ( String x ) {
      out . println ( x + "\n" ) ;
    }
    @ Override public void writeCase ( int casenum , String x ) {
      out . println ( "Case #" + casenum + ": " + x ) ;
    }
  }
  ;
  public void run ( final Runnable main ) {
    int t ;
    String [ ] args = new String [ ] {
      "-1" , "-2" }
      ;
      if ( args . length == 1 ) {
        in = System . in ;
        out = System . out ;
      }
      else if ( args . length == 2 ) {
        if ( args [ 1 ] . equals ( "-" ) ) {
          in = System . in ;
        }
        else {
          in = new Scanner ( args [ 1 ] ) ;
        }
        if ( args [ 1 ] . endsWith ( ".in" ) ) {
          out = new PrintWriter ( args [ 1 ] . substring ( 0 , args [ 1 ] . length ( ) - 3 ) + ".out" ) ;
        }
        else {
          out = System . out ;
        }
      }
      else if ( args . length == 3 ) {
        if ( args [ 1 ] . equals ( "-" ) ) {
          in = System . in ;
        }
        else {
          in = new Scanner ( args [ 1 ] ) ;
        }
        if ( args [ 2 ] . equals ( "-" ) ) {
          out . println ( args [ 2 ] )