public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final String S = input . nextLine ( ) ;
  final int n = S . length ( ) ;
  final int m = new HashSet < String > ( S ) . size ( ) ;
  if ( n == m ) {
    System . out . println ( "yes" ) ;
  }
  else {
    System . out . println ( "no" ) ;
  }
}
