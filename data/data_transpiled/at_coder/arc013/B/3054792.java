public static int C = Integer . parseInt ( input ) {
  int lm = 0 ;
  int wm = 0 ;
  int dm = 0 ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    List < Integer > lwd = new ArrayList < Integer > ( Arrays . asList ( input . split ( " " ) ) ) ;
    lm = Math . max ( lm , lwd . get ( 0 ) ) ;
    wm = Math . max ( wm , lwd . get ( 1 ) ) ;
    dm = Math . max ( dm , lwd . get ( 2 ) ) ;
  }
  System . out . println ( lm * wm * dm ) ;
}
