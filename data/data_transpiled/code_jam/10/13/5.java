static final String [ ] args = new String [ ] {
  "--input" , "--output" , "--output" , "--output" , "--output" , "--output" , "--output" , "--output" }
  ;
  final String [ ] args = new String [ ] {
    "--input" , "--output" , "--output" }
    ;
    if ( args . length != 2 ) {
      System . err . println ( "specify input file" ) ;
      exit ( ) ;
    }
    final long startTime = System . nanoTime ( ) ;
    final Scanner fin = new Scanner ( new File ( args [ 0 ] ) ) ;
    final PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( new File ( args [ 1 ] ) + ".out" ) ) ) ;
    final double phi = 0.5 * ( sqrt ( 5 ) + 1 ) ;
    /* loosing */
    return args [ 0 ] . substring ( 1 ) ;
  }
  