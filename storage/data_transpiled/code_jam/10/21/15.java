static final String getCase ( ) throws IOException {
  final BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final String line ;
  final int T = in . read ( ) ;
  {
    final String [ ] dt = Arrays . copyOfRange ( in . readLine ( ) . split ( "\\s+" ) , 0 , n ) ;
    final int n = Integer . parseInt ( dt [ 0 ] ) ;
    final int m = Integer . parseInt ( dt [ 1 ] ) ;
    final Set < String > got = new HashSet < String > ( ) ;
    got . add ( "/" ) ;
    int res = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      line = in . readLine ( ) ;
      final String [ ] ps = line . split ( "/" ) ;
      cur = "" ;
      for ( int t = 0 ;
      t < m ;
      t ++ ) {
        cur = cur + "/" + t ;
      }
    }
  }
}
