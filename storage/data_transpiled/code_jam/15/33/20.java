public static void main ( String input ) {
  for ( int tc = 1 ;
  tc <= Integer . parseInt ( readLine ( input ) ) ;
  tc ++ ) {
    int c = Integer . parseInt ( readLine ( input ) ) ;
    int d = Integer . parseInt ( readLine ( input ) ) ;
    int v = Integer . parseInt ( readLine ( input ) ) ;
    TreeSet < Integer > n = new TreeSet < > ( ) ;
    for ( int i = 0 ;
    i < d ;
    i ++ ) {
      n . add ( Integer . parseInt ( readLine ( input ) ) ) ;
    }
    int r = 0 , m = 1 ;
    while ( m <= v ) {
      if ( n . size ( ) > 0 && n . get ( 0 ) <= m ) {
        m += n . get ( 0 ) * c ;
        n . clear ( ) ;
      }
      else {
        r ++ ;
        m += m * c ;
      }
    }
    System . out . println ( "Case #" + tc + ": " + r ) ;
  }
}
