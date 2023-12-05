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
    @ Override public int [ ] nextInt ( ) {
      String xs [ ] = in . nextLine ( ) . split ( " " ) ;
      return new int [ xs . length ] ;
    }
    @ Override public float nextDouble ( ) {
      return Float . parseFloat ( in . nextLine ( ) ) ;
    }
    @ Override public void writeline ( String x ) {
      out . println ( x + "\n" ) ;
    }
  }
  ;
  public void run ( final Consumer < String > main ) {
    String [ ] args = in . nextLine ( ) . split ( " " ) ;
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
        out = System . out ;
      }
      else {
        out = new PrintWriter ( args [ 2 ] ) ;
      }
    }
    else {
      System . err . println ( "Expected 0, 1, or 2 args, not " + ( args . length - 1 ) ) ;
      System . err . println ( args ) ;
      return ;
    }
    int t = in . nextInt ( ) ;
    for ( int casenum = 1 ;
    casenum