@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > xs = Lists . newArrayList ( ) ;
  for ( int x : input . split ( " " ) ) {
    xs . add ( x ) ;
  }
  /* no */
  System . out . println ( "Impossible" ) ;
  quit ( 0 ) ;
  /* yes */
  System . out . println ( "Possible" ) ;
  quit ( 0 ) ;
}
