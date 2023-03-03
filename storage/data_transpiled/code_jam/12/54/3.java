public static String parse ( BufferedReader inFile ) throws IOException {
  int k = inFile . readInt ( ) ;
  String S = inFile . readLine ( ) ;
  return ( k == 0 ) ? S : ( k + " " + S ) ;
}
