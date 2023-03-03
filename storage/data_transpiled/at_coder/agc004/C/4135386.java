public static void readLine ( int i ) throws IOException {
  BufferedReader writelines = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int H = Integer . parseInt ( readLine ( ) ) ;
  int W = Integer . parseInt ( readLine ( ) ) ;
  StringBuilder S = new StringBuilder ( ) ;
  StringBuilder T = new StringBuilder ( ) ;
  for ( int j = 0 ;
  j < H ;
  j ++ ) {
    for ( int a = 0 ;
    a < W ;
    a ++ ) {
      if ( a == '#' ) {
        S . append ( "#" ) ;
        T . append ( "#" ) ;
      }
      else {
        if ( j == 0 ) {
          S . append ( "." ) ;
          T . append ( a ) ;
        }
        else {
          S . append ( "." ) ;
          T . append ( a ) ;
        }
      }
    }
  }
  S . append ( "\n" ) ;
  writelines . append ( T ) ;
}
