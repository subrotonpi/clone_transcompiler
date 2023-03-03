public static void input ( Scanner scanner ) {
  int t = scanner . nextInt ( ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    Map < String , Integer > root = new HashMap < > ( ) ;
    int n , m ;
    n = scanner . nextInt ( ) ;
    m = scanner . nextInt ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      String [ ] dirs = scanner . nextLine ( ) . split ( "\n" ) ;
      Map < String , Integer > now = root ;
      for ( String d : dirs ) {
        now . putIfAbsent ( d , new HashMap < > ( ) ) ;
        now = now . get ( d ) ;
      }
    }
    int res = 0 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      String [ ] dirs = scanner . nextLine ( ) . split ( "\n" ) ;
      Map < String , Integer > now = root ;
      for ( String d : dirs ) {
        if ( ! now . containsKey ( d ) ) {
          res ++ ;
          now . put ( d , new HashMap < > ( ) ) ;
        }
        now = now . get ( d ) ;
      }
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + res ) ;
  }
}
