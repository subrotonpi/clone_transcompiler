public static int N = Integer . parseInt ( input ) {
  List < Integer > monsters = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    monsters . add ( i ) ;
  }
  /* damage the monsters */
  int minvalue = Math . min ( monsters . size ( ) ) ;
  return minvalue ;
}
