public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int A = Integer . parseInt ( input . nextLine ( ) ) ;
  final int B = Integer . parseInt ( input . nextLine ( ) ) ;
  final int C = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 1 ;
  i <= B ;
  i ++ ) {
    if ( ( A * i ) % B == C ) {
      return "YES" ;
    }
  }
}
