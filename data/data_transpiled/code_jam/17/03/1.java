public static int t = Integer . parseInt ( input ) {
  for ( int tc = 1 ;
  tc <= t ;
  tc ++ ) {
    System . out . print ( "Case #" + tc + ": " ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) , k = Integer . parseInt ( input . nextLine ( ) ) ;
    Map < Integer , Integer > map = new HashMap < > ( ) ;
    map . put ( n , 1 ) ;
    int lastc = 0 ;
    while ( k > 0 ) {
      int c = Collections . max ( map ) ;
      lastc = c ;
      map . put ( ( c - 1 ) / 2 , map . getOrDefault ( ( c - 1 ) / 2 , 0 ) + map . get ( c ) ) ;
      map . put ( c / 2 , map . getOrDefault ( c / 2 , 0 ) + map . get ( c ) ) ;
      k -= map . get ( c ) ;
      -- c ;
    }
    System . out . println ( lastc / 2 + " " + ( lastc - 1 ) / 2 ) ;
  }
  return t ;
}
