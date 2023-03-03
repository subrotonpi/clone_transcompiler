@ VisibleForTesting static void print ( String s ) throws IOException {
  final Scanner fin = new Scanner ( new File ( "1_input.txt" ) ) ;
  final PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "1_output.txt" ) ) ) ;
  final int cases = Integer . parseInt ( fin . nextLine ( ) ) ;
  final long t0 = System . currentTimeMillis ( ) ;
  for ( int casenr = 0 ;
  casenr < cases ;
  casenr ++ ) {
    final int n = Integer . parseInt ( fin . nextLine ( ) ) ;
    fout . println ( "Case #" + ( casenr + 1 ) + ": " + s ) ;
  }
}
