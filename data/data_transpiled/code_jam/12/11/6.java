static final String getTestCaseName ( ) throws IOException {
  if ( __name__ == null ) {
    BufferedReader br = null ;
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
      int a = Integer . parseInt ( br . readLine ( ) ) ;
      int b = Integer . parseInt ( br . readLine ( ) ) ;
      double [ ] p = Double . parseDouble ( br . readLine ( ) ) ;
      assert p . length == a ;
      double best = ( double ) b + 2 ;
      double pright = 1.0 ;
      for ( int i = xrange ( 0 , a + 1 ) ;
      i < b ;
      ++ i ) {
        pright = 1.0 ;
        for ( int j = xrange ( a - i ) ;
        j < b ;
        ++ j ) {
          pright *= p [ j ] ;
        }
        double expected = pright * ( i + i + ( b - a ) + 1 ) + ( 1 - pright ) * ( i + i + ( b - a ) + 1 + b + 1 ) ;
        best = Math . min ( best , expected ) ;
      }
      System . out . println ( "Case #" + ( _t + 1 ) + ": " + best + "\t" + ( best == 0 ? "" : "\t" ) ) ;
    }
  }
  return null ;
}
