/*
DESCRIPTION="
*/
public static void main ( String [ ] args ) {
  final HelpFormatter formatter = new HelpFormatter ( ) ;
  final HelpFormatter perr = new HelpFormatter ( ) {
    @ Override public void printHelp ( String msg ) {
      System . err . println ( msg ) ;
      formatter . printHelp ( "perr" , "" ) ;
    }
    @ Override public void pinfo ( String msg ) {
      System . out . println ( msg ) ;
      formatter . printHelp ( "pinfo" , "" ) ;
    }
    @ Override public void runcmd ( String cmd ) {
      perr . printHelp ( "perr" , cmd ) ;
      Runtime . getRuntime ( ) . exec ( cmd ) ;
    }
  }
  ;
  final CommandLineParser parser = new GnuParser ( ) ;
  final CommandLine cmd ;
  try {
    cmd = parser . parse ( args ) ;
  }
  catch ( ParseException e ) {
    e . printStackTrace ( ) ;
  }
  final PrintWriter out ;
  final BufferedReader in ;
  final int T ;
  final int [ ] Scnt ;
  if ( null == outfile ) {
    out = new PrintWriter ( System . out ) ;
  }
  else {
    out = new PrintWriter ( new PrintStream ( outfile ) ) ;
  }
  try {
    in = new BufferedReader ( new FileReader ( cmd . getOptionValue ( "infile" ) ) ) ;
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
  final int T ;
  final int [ ] Smax ;
  final int [ ] Scnt ;
  try {
    T = Integer . parseInt ( in . readLine ( ) ) ;
    for ( int i = 1 ;
    i <= T ;
    i ++ ) {
      Arrays . sort ( Smax ) ;
      Smax = Integer . parseInt ( Smax ) ;
      Scnt = new int [ ] {
        Integer . parseInt ( SCnt [ i ] ) }
        ;
        out . println ( "Case #" + i + ": " + solve ( Smax , Scnt ) ) ;
      }
    }
    catch ( IOException e ) {
      e . printStackTrace ( ) ;
    }
    if ( null != outfile ) {
      outfile . close ( ) ;
    }
  }
  