public static void for ( int testCase : xrange ) {
  int n = input . nextInt ( ) ;
  int [ ] a = map ( Integer . parseInt ( readLine ( ) ) , n ) ;
  System . out . println ( "Case #" + ( testCase + 1 ) + ": " + Arrays . stream ( a ) . filter ( i -> a [ i ] != i + 1 ) . count ( ) ) ;
}
