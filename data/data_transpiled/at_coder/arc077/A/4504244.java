static void print ( String input ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  System . setOut ( new PrintStream ( System . out ) ) ;
  final int n = scanner . nextInt ( ) ;
  final int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = scanner . nextInt ( ) ;
  }
  final int [ ] B = new int [ n ] ;
  if ( n % 2 != 0 ) {
    B [ n ] = A [ n ] ;
  }
}
