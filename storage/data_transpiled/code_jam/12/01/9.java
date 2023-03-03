@ VisibleForTesting static String getString ( String filename ) throws IOException {
  int testCase = 1 ;
  String problem = "A" ;
  boolean practice = false ;
  if ( practice ) {
    practice = "-practice" ;
  }
  else {
    practice = "-attempt0" ;
  }
  BufferedReader in ;
  PrintWriter out ;
  switch ( testCase ) {
    case 0 : in = new BufferedReader ( new FileReader ( problem + "-" + "sample" + practice + ".in" ) ) ;
    out = new PrintWriter ( problem + "-" + "sample" + practice + ".out" ) ;
    break ;
    case 1 : in = new BufferedReader ( new FileReader ( problem + "-" + "small" + practice + ".in" ) ) ;
    out = new PrintWriter ( problem + "-" + "small" + practice + ".out" ) ;
    break ;
    case 2 : in = new BufferedReader ( new FileReader ( problem + "-" + "large" + practice + ".in" ) ) ;
    out = new PrintWriter ( problem + "-" + "large" + ".out" ) ;
    break ;
    default : throw new IllegalArgumentException ( "Invalid case" ) ;
  }
  String alpha = "abcdefghijklmnopqrstuvwxyz " ;
  String trans = "ynficwlbkuomxsevzpdrjgthaq " ;
  String table = makeTable ( trans , alpha ) ;
  int cases = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  for ( int i = 0 ;
  i < cases ;
  i ++ ) {
    String instr = in . readLine ( ) . trim ( ) ;
    String output = translate ( instr , table ) ;
    out . println ( "Case #" + ( i + 1 ) + ": " + output ) ;
  }
  in . close ( ) ;
  out . close ( ) ;
  return "" ;
}
