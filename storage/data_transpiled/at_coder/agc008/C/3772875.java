static final void solve ( ) {
  final int [ ] L = new int [ ] {
    Integer . parseInt ( input . nextLine ( ) ) }
    ;
    int I_max = L [ 0 ] / 2 * 2 + L [ 3 ] / 2 * 2 + L [ 4 ] / 2 * 2 ;
    if ( L [ 0 ] >= 1 && L [ 3 ] >= 1 && L [ 4 ] >= 1 ) {
      I_max = Math . max ( I_max , Math . max ( 0 , ( L [ 0 ] - 1 ) / 2 ) * 2 + Math . max ( 0 , ( L [ 3 ] - 1 ) / 2 ) * 2 + 3 ) ;
    }
    System . out . println ( I_max + L [ 1 ] ) ;
  }
  