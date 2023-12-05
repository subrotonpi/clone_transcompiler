public static void readFile ( InputStream in ) throws IOException {
  PrintStream out = new PrintStream ( new FileOutputStream ( "smallInput.txt" ) ) ;
  int trials = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int i = 0 ;
  i < xrange ( trials ) ;
  i ++ ) {
    int N = Integer . parseInt ( in . readLine ( ) ) ;
    String [ ] stats = new String [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      stats [ j ] = in . readLine ( ) . trim ( ) ;
    }
    double [ ] WP = new double [ N ] ;
    double [ ] [ ] WPex = new double [ N ] [ N ] ;
    double [ ] WPtotal = new double [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      for ( int k = 0 ;
      k < N ;
      k ++ ) {
        if ( stats [ j ] [ k ] . equals ( "1" ) ) {
          WP [ j ] += 1.0 ;
          WPtotal [ j ] += 1.0 ;
        }
        else if ( stats [ j ] [ k ] . equals ( "0" ) ) {
          WPtotal [ j ] += 1.0 ;
        }
      }
    }
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      for ( int k = 0 ;
      k < N ;
      k ++ ) {
        double total = WPtotal [ j ] ;
        WPex [ j ] [ k ] = WP [ j ] ;
        if ( stats [ j ] [ k ] . equals ( "1" ) ) {
          WPex [ j ] [ k ] -= 1.0 ;
          total -= 1.0 ;
        }
        else if ( stats [ j ] [ k ] . equals ( "0" ) ) {
          total -= 1.0 ;
        }
        WPex [ j ] [ k ] = WPex [ j ] [ k ] / total ;
      }
      WP [ j ] = WP [ j ] / WPtotal [ j ] ;
    }
    double [ ] OWP = new double [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      OWP [ j ] = 0.0 ;
      for ( int k = 0 ;
      k < N ;
      k ++ ) {
        if ( j != k && stats [ j ] [ k ] . equals ( "." ) ) OWP [ j ] += WPex [ k ] [ j ] ;
      }
      OWP [ j ] = OWP [ j ] / WPtotal [ j ] ;
    }
    out . println ( s ) ;
  }
  in . close (