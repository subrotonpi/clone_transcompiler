public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int A = Integer . parseInt ( input . nextLine ( ) ) ;
  final int B = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean vic = true ;
  if ( N <= A ) {
    vic = true ;
  }
  else if ( N > A ) {
    if ( A == B ) {
      if ( N % ( A + 1 ) == 0 ) {
        vic = false ;
      }
    }
    else {
      if ( A < B ) {
        vic = false ;
      }
    }
  }
  if ( vic ) {
    System . out . println ( "Takahashi" ) ;
  }
  else {
    System . out . println ( "Aoki" ) ;
  }
}
