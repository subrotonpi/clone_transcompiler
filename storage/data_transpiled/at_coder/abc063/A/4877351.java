public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int A = Integer . parseInt ( input . nextLine ( ) ) ;
  final int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A + B >= 10 ) {
    return "error" ;
  }
  else {
    return A + B ;
  }
}
