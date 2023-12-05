public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final char a = input . charAt ( 0 ) ;
  final char b = input . charAt ( 1 ) ;
  if ( a == 'H' ) {
    System . out . println ( b ) ;
  }
  else {
    if ( b == 'H' ) {
      System . out . println ( "D" ) ;
    }
    else {
      System . out . println ( "H" ) ;
    }
  }
}
