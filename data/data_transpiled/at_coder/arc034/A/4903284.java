public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    List < Integer > aa = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      aa . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
    res = Math . max ( res , Integer . valueOf ( aa . size ( ) ) + aa . get ( aa . size ( ) - 1 ) * 11 / 90 ) ;
  }
  System . out . println ( res ) ;
}
