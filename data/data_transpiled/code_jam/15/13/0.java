@ Produces @ Immutable public static int [ ] gcd ( @ Nonnull final int a , @ Nonnull final int b ) {
  final int [ ] pts = new int [ 1 + input . nextInt ( ) ] ;
  int n = input . nextInt ( ) ;
  for ( int i : xrange ( n ) ) {
    int x = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    pts [ i ] = new int [ x + y ] ;
  }
  System . out . println ( "Case #" + cas + ":" ) ;
  System . out . println ( "Case #" + cas + ":" ) ;
  for ( int i : xrange ( n ) ) {
    System . out . println ( "Case #" + i ) ;
  }
  return pts ;
}
