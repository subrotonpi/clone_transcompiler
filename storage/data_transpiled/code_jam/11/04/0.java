static final void main ( String [ ] args ) throws IOException {
  if ( args . length == 0 ) {
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
    _t ++ ) {
      int n = Integer . parseInt ( br . readLine ( ) ) ;
      int [ ] nums = ArrayUtil . toIntArray ( br . readLine ( ) . split ( " " ) ) ;
      int bad = 0 ;
      for ( int i : xrange ( n ) ) {
        if ( nums [ i ] != i + 1 ) {
          bad ++ ;
        }
      }
      System . out . println ( "Case #" + ( _t + 1 ) + ": " + bad + "6f" ) ;
    }
  }
}
