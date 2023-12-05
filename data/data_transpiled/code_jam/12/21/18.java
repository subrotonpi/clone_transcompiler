public static int tc = Integer . parseInt ( scanner . nextLine ( ) ) {
  int tc = scanner . nextInt ( ) ;
  for ( int t = 1 ;
  t <= tc ;
  t ++ ) {
    String [ ] p = scanner . nextLine ( ) . split ( " " ) ;
    int n = Integer . parseInt ( p [ 0 ] ) ;
    int len = Integer . parseInt ( p [ 1 ] ) ;
    List < Integer > b = new LinkedList < Integer > ( ) ;
    for ( int i = 0 ;
    i < len ;
    i ++ ) b . add ( i ) ;
    int somma = sum ( p ) ;
    int somma2 = sum ( p ) ;
    len = Math . min ( somma , c ) ;
    while ( somma > 0 ) {
      int m = Math . min ( somma , c ) ;
      int c = p . indexOf ( m ) ;
      int d = Math . min ( somma , c ) ;
      len = Math . max ( somma , d ) ;
      somma -= d ;
    }
    float [ ] res = new float [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      res [ i ] = ( float ) ( len - b . get ( i ) ) / somma2 * 100 ;
    }
    System . out . println ( "Case #" + t + ": " + Arrays . toString ( res ) ) ;
  }
  return tc ;
}
