public static void initializeSolver ( ) {
}
{
  int n = read ( ) ;
  int l = read ( ) ;
  String g = read ( Rettype . str ) ;
  String b = read ( false , String . class ) ;
  if ( g . contains ( b ) ) {
    return "IMPOSSIBLE" ;
  }
  StringBuilder outputFormat = new StringBuilder ( ) ;
  outputFormat . append ( "Case #%d: " ) ;
  String filename = input . nextLine ( ) . trim ( ) ;
  BufferedReader sbr = null ;
  PrintWriter tbr = null ;
  if ( filename != "" ) {
    sbr = new BufferedReader ( new FileReader ( filename + ".in" ) ) ;
    sbr . readLine ( ) ;
    tbr = new PrintWriter ( new FileWriter ( filename + ".out" ) ) ;
  }
  {
    String inputLine ;
    if ( sbr != null ) {
      inputLine = sbr . readLine ( ) . trim ( ) ;
    }
    else {
      inputLine = input . nextLine ( ) . trim ( ) ;
    }
    if ( split ) {
      return Lists . newArrayList ( inputLine . split ( " " ) ) ;
    }
    else {
      return rettype . apply ( inputLine ) ;
    }
  }
}
