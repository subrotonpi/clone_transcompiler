@ VisibleForTesting static void solve ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int T = scanner . nextInt ( ) ;
  final int a = Integer . parseInt ( scanner . nextLine ( ) ) ;
  final int b = Integer . parseInt ( scanner . nextLine ( ) ) ;
  scanner . close ( ) ;
  final int [ ] result = new int [ T ] ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    result [ i ] = scanner . nextInt ( ) ;
  }
  scanner . close ( ) ;
  System . out . println ( "Case #" + i + ": " + result [ 0 ] ) ;
}
