public static void main ( InputStream is ) throws IOException {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( is ) ) ;
  int n = Integer . parseInt ( br . readLine ( ) ) ;
  /* max sum subsequence of seq */
  int maxsofar = 0 ;
  int maxendinghere = 0 ;
  for ( int s : n ) {
    maxendinghere = Math . max ( maxendinghere + s , 0 ) ;
    maxsofar = Math . max ( maxsofar , maxendinghere ) ;
  }
  int testCase = 1 ;
  String line ;
  while ( ( line = br . readLine ( ) ) != null ) {
    int result = 0 ;
    int npoints = Integer . parseInt ( line . trim ( ) ) , dist = Integer . parseInt ( line . trim ( ) ) ;
    int [ ] points = new int [ npoints ] ;
    int nvend = 0 ;
    for ( int x = 0 ;
    x < npoints ;
    x ++ ) {
      int [ ] line = new int [ npoints ] ;
      for ( int y = 0 ;
      y < npoints ;
      y ++ ) {
        line [ y ] = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
        nvend += line [ y ] ;
        for ( int j = 0 ;
        j < line [ y ] ;
        j ++ ) {
          points [ y ] = line [ j ] ;
        }
      }
    }
    double [ ] totaldist = dist * ( nvend - 1 ) ;
    Arrays . sort ( points ) ;
    double [ ] dists = new double [ points . length ] ;
    for ( int x = 0 ;
    x < points . length - 1 ;
    x ++ ) {
      dists [ x ] = dist - ( points [ x + 1 ] - points [ x ] ) ;
    }
    result = maxsofar ( dists ) / 2.0f ;
    System . out . println ( "Case #" + testCase + ": " + result ) ;
    testCase ++ ;
  }
}
