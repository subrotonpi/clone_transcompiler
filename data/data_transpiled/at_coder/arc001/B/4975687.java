public static void print ( int n ) {
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int M [ ] = {
    0 , n }
    ;
    for ( int i = 1 ;
    i <= 5 ;
    i ++ ) {
      M = Math . max ( M [ 0 ] , c . indexOf ( String . valueOf ( i ) ) ) ;
    }
    System . out . println ( * M ) ;
  }
  