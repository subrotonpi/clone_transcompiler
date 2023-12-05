private static void processTest ( String testId ) {
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > horses = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    horses . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  double destTime = Math . max ( ( d - horses . get ( 0 ) ) / horses . get ( 1 ) , horses . size ( ) ) ;
  double ans = d / destTime ;
  System . out . println ( "Case #" + testId + ": " + ans + ".8f" ) ;
}
