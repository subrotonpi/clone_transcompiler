static final long solve ( ) throws IOException {
  BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int N = Integer . parseInt ( in . readLine ( ) ) ;
  int H = Integer . parseInt ( in . readLine ( ) ) ;
  int A = Integer . parseInt ( in . readLine ( ) ) ;
  int B = Integer . parseInt ( in . readLine ( ) ) ;
  int C = Integer . parseInt ( in . readLine ( ) ) ;
  int D = Integer . parseInt ( in . readLine ( ) ) ;
  int E = Integer . parseInt ( in . readLine ( ) ) ;
  int h = H ;
  int K = N * E - H ;
  B += E ;
  D += E ;
  if ( ( H - E * N > 0 ) && ( H - E * N > 0 ) ) System . out . println ( 0 ) ;
  else {
    long m = 10000000000000 ;
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      if ( ( K - ( B * i ) ) <= 0 ) m = Math . min ( m , ( A * i ) ) ;
      else m = Math . min ( m , ( K - ( B * i ) ) / D * C + C + A * i ) ;
    }
    System . out . println ( m ) ;
  }
  return m ;
}
