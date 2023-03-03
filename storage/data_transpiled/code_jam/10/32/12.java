@ VisibleForTesting static long loadFile ( ) throws IOException {
  String inpath = "B-large.in" ;
  String outpath = "B.out" ;
  BufferedReader fin = new BufferedReader ( new FileReader ( inpath ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( outpath ) ) ) ;
  /* Test cases */
  double t = Math . log ( ( double ) P / L , C ) ;
  int i = 0 ;
  while ( t > 2 * i ) {
    i ++ ;
  }
  long timestart = System . currentTimeMillis ( ) ;
  int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    L = Integer . parseInt ( fin . readLine ( ) ) ;
    P = Integer . parseInt ( fin . readLine ( ) ) ;
    C = Integer . parseInt ( fin . readLine ( ) ) ;
  }
  String result = "" ;
  fout . println ( result ) ;
  return timestart ;
}
