static final String input ( ) {
  Scanner input = new Scanner ( System . in ) ;
  N , A , B = Integer . parseInt ( input . nextLine ( ) ) ;
  return N + ( ( B - A + 1 ) % 2 == 1 ? "Alice" : "Borys" ) ;
}
