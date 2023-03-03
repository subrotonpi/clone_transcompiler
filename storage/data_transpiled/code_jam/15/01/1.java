public static void input ( ) {
  t = input . nextInt ( ) ;
  for ( int j = 0 ;
  j < xrange ( t ) ;
  j ++ ) {
    smax = input . nextInt ( ) ;
    shy = input . nextInt ( ) ;
    int maxshortage = 0 ;
    int shortage = 0 ;
    for ( int k : xrange ( shy . length ( ) ) ) {
      if ( shortage > maxshortage ) {
        maxshortage = shortage ;
      }
      shortage += 1 - Integer . parseInt ( shy . charAt ( k ) ) ;
    }
    System . out . println ( "Case #" + ( j + 1 ) + ": " + maxshortage ) ;
  }
}
