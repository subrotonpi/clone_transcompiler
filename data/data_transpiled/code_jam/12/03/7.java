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
    ++ _t ) {
      int a = Integer . parseInt ( br . readLine ( ) ) ;
      int b = Integer . parseInt ( br . readLine ( ) ) ;
      int total = 0 ;
      for ( int i = xrange ( a , b ) ;
      i < a ;
      ++ i ) {
        Set < Integer > s = new HashSet < Integer > ( ) ;
        String cs = Integer . toString ( i ) ;
        for ( int j : xrange ( 1 , cs . length ( ) ) ) {
          int k = Integer . parseInt ( cs . substring ( j ) + cs . substring ( 0 , j ) ) ;
          if ( i < k && k <= b ) {
            s . add ( k ) ;
          }
        }
        total += s . size ( ) ;
      }
      System . out . println ( "Case #" + ( _t + 1 ) + ": " + total ) ;
    }
  }
}
