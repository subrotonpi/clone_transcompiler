private static void readFile ( File inFile ) throws IOException {
  File outFile = new File ( "B-large.in.in" ) ;
  outFile . createNewFile ( ) ;
  int N = Integer . parseInt ( inFile . readLine ( ) ) ;
  for ( int I = 1 ;
  I <= N ;
  I ++ ) {
    int numPoints = Integer . parseInt ( inFile . readLine ( ) ) ;
    int minDist = Integer . parseInt ( inFile . readLine ( ) ) ;
    Vector < Integer > vendors = new Vector < Integer > ( numPoints ) ;
    for ( int i = 0 ;
    i < numPoints ;
    i ++ ) {
      Integer point = Integer . parseInt ( inFile . readLine ( ) ) ;
      int numVendors = Integer . parseInt ( inFile . readLine ( ) ) ;
      for ( int j = 0 ;
      j < numVendors ;
      j ++ ) {
        vendors . add ( point ) ;
      }
    }
    int maxMove = 0 ;
    for ( int i = 1 ;
    i < vendors . size ( ) ;
    i ++ ) {
      if ( vendors . get ( i ) - vendors . get ( i - 1 ) < minDist ) {
        maxMove = Math . max ( maxMove , vendors . get ( i - 1 ) - vendors . get ( i ) + minDist ) ;
        vendors . set ( i , vendors . get ( i - 1 ) + minDist ) ;
      }
    }
    outFile . createNewFile ( ) ;
    System . out . println ( "Case #" + I + ": " + maxMove / 2 ) ;
  }
}
