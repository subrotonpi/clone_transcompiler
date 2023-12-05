static final String solve ( ) throws IOException {
  if ( __name__ == "solve" ) {
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
      int n = Integer . parseInt ( br . readLine ( ) ) ;
      int [ ] nums = ArrayUtil . toIntArray ( br . readLine ( ) . split ( " " ) ) ;
      int tot = 0 ;
      for ( int x : nums ) tot ^= x ;
      String ans ;
      if ( tot != 0 ) ans = "NO" ;
      else ans = Integer . toString ( nums . length ) - Math . min ( nums . length , n ) ;
      System . out . println ( "Case #" + ( _t + 1 ) + ": " + ans ) ;
    }
  }
  return null ;
}
