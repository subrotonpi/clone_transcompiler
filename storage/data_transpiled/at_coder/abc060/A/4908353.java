public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final String [ ] A = input . nextLine ( ) . split ( " " ) ;
  final String [ ] B = input . nextLine ( ) . split ( " " ) ;
  final String [ ] C = input . nextLine ( ) . split ( " " ) ;
  if ( A [ A . length - 1 ] . equals ( B [ 0 ] ) && B [ B . length - 1 ] . equals ( C [ 0 ] ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
