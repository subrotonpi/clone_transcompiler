public static int cases = Integer . parseInt ( input ) {
  for ( int cc = 0 ;
  cc < cases ;
  cc ++ ) {
    int distance = Integer . parseInt ( input . nextLine ( ) ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int maxTime = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int position = Integer . parseInt ( input . nextLine ( ) ) ;
      int speed = Integer . parseInt ( input . nextLine ( ) ) ;
      maxTime = Math . max ( maxTime , ( distance - position ) / speed ) ;
    }
    System . out . println ( "Case #" + ( cc + 1 ) + ": " + ( distance / maxTime ) + "lf" ) ;
  }
  return cases ;
}
