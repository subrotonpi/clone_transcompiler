static final Scanner in = new Scanner ( System . in ) {
  private PrintWriter out = new PrintWriter ( System . out ) {
    @ Override public String nextLine ( ) {
      String x = in . nextLine ( ) ;
      if ( x . length ( ) > 0 && x . charAt ( x . length ( ) - 1 ) == '\n' ) {
        return x . substring ( 0 , x . length ( ) - 1 ) ;
      }
      else {
        return x ;
      }
    }
    @ Override public int nextInt ( ) {
      return Integer . parseInt ( in . nextLine ( ) ) ;
    }
    @ Override public double nextDouble ( ) {
      return Double . parseDouble ( in . nextLine ( ) ) ;
    }
    @ Override public int nextInt ( ) {
      return Integer . parseInt ( in . nextLine ( ) ) ;
    }
    @ Override public double nextDouble ( ) {
      return Double . parseDouble ( in . nextLine ( ) ) ;
    }
    @ Override public void nextLine ( ) {
      out . println ( in . nextLine ( ) + "\n" ) ;
    }
    @ Override public void writeCase ( int casenum , double answer ) {
      out . println ( "Case #" + casenum + ": " + answer ) ;
    }
  }
  ;
  public void run ( final Runnable main ) {
    final String [ ] args = new String [ ] {
      in . nextLine ( ) , out . nextLine ( ) }
      ;
      in = new Scanner ( System . in ) ;
      out = new PrintWriter ( System . out ) ;
      if ( args . length == 2 ) {
        if ( args [ 1 ] != null ) {
          in . close ( ) ;
          if ( args [ 1 ] . endsWith ( ".in" ) ) {
            out . println ( args [ 1 ] . substring ( 0 , args [ 1 ] . length ( ) - 3 ) + ".out" ) ;
          }
        }
      }
      else if ( args . length == 3 ) {
        if ( args [ 1 ] != null ) {
          in . close ( ) ;
        }
        if ( args [ 2 ] != null ) {
          out . println ( args [ 2 ] ) ;
        }
      }
      else if ( args . length > 3 ) {
        System . err . println ( "Expected 0, 1, or 2 arguments, not " + ( args . length - 1 ) ) ;
        System . err . println ( args ) ;
        return ;
      }
      int t = in . nextInt ( ) ;
      for ( int casenum = 1 ;
      casenum <= t ;
      casenum ++ ) {
        main . run ( casenum ) ;
        