public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int [ ] A = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  if ( A [ 0 ] <= A [ 2 ] && A [ 1 ] <= A [ 2 ] ) {
    return "Yes" ;
  }
  else {
    return "No" ;
  }
}
