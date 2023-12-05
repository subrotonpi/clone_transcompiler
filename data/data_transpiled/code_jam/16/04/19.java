public static void print ( int t = input ) {
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    int k = Integer . parseInt ( input . readLine ( ) ) ;
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    int s = Integer . parseInt ( input . readLine ( ) ) ;
    if ( c * s < k ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": IMPOSSIBLE" ) ;
      continue ;
    }
    List < String > pos = new ArrayList < > ( ) ;
    int x = 0 ;
    while ( x < k ) {
      int a = 0 ;
      for ( ;
      a < c ;
      a ++ ) {
        a *= k ;
        a += Math . min ( x , k - 1 ) ;
        if ( x < k ) x ++ ;
      }
      pos . add ( String . valueOf ( a + 1 ) ) ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + pos . toString ( ) ) ;
  }
}
