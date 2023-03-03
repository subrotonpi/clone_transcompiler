public static void main ( String className ) throws IOException {
  if ( className . equals ( "org.apache.hadoop.util.jar.JarFileSystem" ) ) {
    BufferedReader inFile = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
    PrintWriter outFile = new PrintWriter ( new FileWriter ( "practice.out" ) ) ;
    int caseNum = Integer . parseInt ( inFile . readLine ( ) ) ;
    for ( int i = xrange ( 1 , caseNum + 1 ) ;
    i < caseNum ;
    i ++ ) {
      int rtv = 0 ;
      int N = Integer . parseInt ( inFile . readLine ( ) ) ;
      int K = Integer . parseInt ( inFile . readLine ( ) ) ;
      int B = Integer . parseInt ( inFile . readLine ( ) ) ;
      int T = Integer . parseInt ( inFile . readLine ( ) ) ;
      int X = Integer . parseInt ( inFile . readLine ( ) ) ;
      int V = Integer . parseInt ( inFile . readLine ( ) ) ;
      float [ ] tc = new float [ N ] ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        float tmpT = ( B - X ) / ( float ) V ;
        tc [ j ] = ( B - X ) / ( float ) V ;
      }
      rtv = 0 ;
      int fg = 0 ;
      int lg = 0 ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        int h = N - j - 1 ;
        if ( tc [ h ] > T ) {
          lg ++ ;
        }
        else {
          fg ++ ;
          rtv += lg ;
          if ( fg >= K ) {
            break ;
          }
        }
      }
      if ( fg < K ) {
        outFile . println ( "Case #" + ( i ) + ": IMPOSSIBLE" ) ;
      }
      else {
        outFile . println ( "Case #" + ( i ) + ": " + rtv ) ;
      }
    }
    outFile . close ( ) ;
    inFile . close ( ) ;
  }
}
