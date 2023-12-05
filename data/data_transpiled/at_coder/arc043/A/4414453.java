static final void main ( String [ ] args ) throws IOException {
  System . setIn ( args ) ;
  Scanner input = new Scanner ( System . in ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int me = Arrays . stream ( L ) . mapToInt ( Integer :: intValue ) . sum ( ) / N ;
  int diff = Collections . max ( L ) - Collections . min ( L ) ;
  if ( diff == 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int P = B / ( diff ) ;
    int Q = A - P * me ;
    System . out . println ( P + " " + Q ) ;
  }
}
