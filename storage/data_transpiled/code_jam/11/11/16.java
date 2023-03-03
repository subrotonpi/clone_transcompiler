@ VisibleForTesting static void fractions ( String name ) throws IOException {
  String name = "A-large" ;
  BufferedReader f_in = new BufferedReader ( new FileReader ( name + ".in" ) ) ;
  PrintWriter f_out = new PrintWriter ( name + ".out" ) ;
  int T = Integer . parseInt ( f_in . readLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    System . out . println ( i ) ;
    int N = Integer . parseInt ( f_in . readLine ( ) ) ;
    int Pd = Integer . parseInt ( f_in . readLine ( ) ) ;
    int Pg = Integer . parseInt ( f_in . readLine ( ) ) ;
    if ( ( Pg == 100 ) && ( Pd != 100 ) ) {
      f_out . println ( "Case #" + ( i + 1 ) + ": " + "Broken" ) ;
    }
    else if ( ( Pg == 100 ) && ( Pd == 100 ) ) {
      f_out . println ( "Case #" + ( i + 1 ) + ": " + "Possible" ) ;
    }
    else if ( ( Pg == 0 ) && ( Pd != 0 ) ) {
      f_out . println ( "Case #" + ( i + 1 ) + ": " + "Broken" ) ;
    }
    else if ( ( Pg == 0 ) && ( Pd == 0 ) ) {
      f_out . println ( "Case #" + ( i + 1 ) + ": " + "Possible" ) ;
    }
    else if ( ( Pd == 100 ) && ( Pd == 100 ) ) {
      f_out . println ( "Case #" + ( i + 1 ) + ": " + "Possible" ) ;
    }
    else {
      boolean ret = false ;
      int g1 = Math . max ( 100 / gcd ( Pd , 100 ) , 100 / gcd ( 100 - Pd , 100 ) ) ;
      System . out . println ( g1 + ": " + N ) ;
      if ( ( g1 <= N ) && ( g1 <= N ) ) {
        f_out . println ( "Case #" + ( i + 1 ) + ": " + "Possible" ) ;
      }
      else {
        f_out . println ( "Case #" + ( i + 1 ) + ": " + "Broken" ) ;
      }
    }
  }
  f_in . close ( ) ;
  f_out . close (