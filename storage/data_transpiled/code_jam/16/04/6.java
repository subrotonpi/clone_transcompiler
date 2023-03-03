public static BufferedReader IN = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
PrintWriter OUT = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
int NUM_TESTS = Integer . parseInt ( IN . readLine ( ) ) ;
for ( int test : xrange ( NUM_TESTS ) ) {
  int K = Integer . parseInt ( IN . readLine ( ) ) ;
  int C = Integer . parseInt ( IN . readLine ( ) ) ;
  int S = Integer . parseInt ( IN . readLine ( ) ) ;
  int total = K * C ;
  String [ ] answer ;
  if ( C * S < K ) {
    answer = "IMPOSSIBLE" ;
  }
  else {
    answer = new String [ total ] ;
    for ( int s = 0 ;
    s < S ;
    s ++ ) {
      int [ ] cover = new int [ s * C ] ;
      for ( int i = 0 ;
      i < cover . length ;
      i ++ ) {
        cover [ i ] = K * C ;
      }
    }
    answer [ s ] = 1 + Integer . parseInt ( cover [ s ] ) ;
  }
  OUT . println ( answer ) ;
}
IN . close ( ) ;
OUT . close ( ) ;
return OUT ;
}
