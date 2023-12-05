public static int dp ( int no ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > li_b = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    li_b . add ( new Integer ( i + 2 ) ) ;
  }
  /* dp(no) */
  List < Integer > buka_saralys = li_b . stream ( ) . filter ( b -> b . intValue ( ) == no ) . collect ( Collectors . toList ( ) ) ;
  if ( buka_saralys . size ( ) == 0 ) {
    return 1 ;
  }
  else {
    return Math . max ( buka_saralys . size ( ) , buka_saralys . size ( ) ) + 1 ;
  }
}
