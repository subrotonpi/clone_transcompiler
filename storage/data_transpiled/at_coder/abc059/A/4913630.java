public static String main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final List < String > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . nextInt ( ) ;
  i ++ ) {
    A . add ( input . nextLine ( ) ) ;
  }
  final String ans = A . get ( 0 ) . charAt ( 0 ) + A . get ( 1 ) . charAt ( 0 ) + A . get ( 2 ) . charAt ( 0 ) ;
  return ans . toUpperCase ( ) ;
}
