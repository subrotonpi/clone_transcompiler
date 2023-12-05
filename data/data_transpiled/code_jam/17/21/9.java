@ Sys public static void Sys ( ) throws IOException {
  int T = Integer . parseInt ( stdin . readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int D = ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
    int N = ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
    Double m = null ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      int K = ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
      int S = ( Integer . parseInt ( stdin . readLine ( ) ) ) ;
      Double l = ( Double . parseDouble ( stdin . readLine ( ) ) ) / S ;
      if ( m == null || m < l ) {
        m = l ;
      }
    }
    Double s = D / m ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + s ) ;
  }
}
