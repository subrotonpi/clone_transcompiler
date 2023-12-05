@ Test public static void main ( String TEST ) throws IOException {
  final String IN = "B-" + TEST + ".in" ;
  final String OUT = "B-" + TEST + ".out" ;
  /* Run the stack */
  int n = stack . length ( ) ;
  stack += "+" ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( stack . charAt ( i ) != stack . charAt ( i + 1 ) ) {
      cnt ++ ;
    }
  }
  /* Run the test */
  try ( BufferedReader fin = new BufferedReader ( new FileReader ( IN ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( OUT ) ) ) ) {
    int t = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    for ( int i = 0 ;
    i < t ;
    i ++ ) {
      String stack = fin . readLine ( ) . trim ( ) ;
      int res = run ( stack ) ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + res ) ;
    }
  }
  if ( Class . forName ( "org.apache.commons.logging.Log" ) . equals ( "org.apache.commons.logging.Log" ) ) {
    System . out . println ( "Log " + in + " " + out ) ;
  }
}
