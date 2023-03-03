static final String getTestCaseName ( ) throws IOException {
  if ( __name__ == null ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int t = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _t = xrange ( t ) ;
    _t < t ;
    ++ _t ) {
      int [ ] ns = ArrayUtil . newIntArray ( Integer . parseInt ( br . readLine ( ) ) ) ;
      int n = ns [ 0 ] ;
      int s = ns [ 1 ] ;
      int p = ns [ 2 ] ;
      assert ns . length == n + 3 ;
      int [ ] scores = Arrays . copyOfRange ( ns , 3 , 3 + n ) ;
      int sure = 0 ;
      int ifSurprising = 0 ;
      for ( int x : scores ) {
        int notSurprising = ( x + 2 ) / 3 ;
        int isSurprising = ( x + 4 ) / 3 ;
        if ( notSurprising >= p ) {
          sure ++ ;
        }
        else if ( ( 2 <= x && x <= 28 ) && isSurprising >= p ) {
          ifSurprising ++ ;
        }
      }
      System . out . println ( "Case #" + ( _t + 1 ) + ": " + ( sure + Math . min ( ifSurprising , s ) ) ) ;
    }
  }
  return null ;
}
