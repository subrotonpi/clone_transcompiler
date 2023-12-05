public static void input ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  a = Arrays . stream ( input . split ( " " ) ) . map ( Integer :: parseInt ) . collect ( Collectors . toList ( ) ) ;
  int res = - 10 * 10 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int maxScore = - 10 * 10 ;
    int tScore = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i == j ) continue ;
      String t = a . substring ( Math . min ( i , j ) , Math . max ( i , j ) + 1 ) ;
      if ( maxScore < Integer . MAX_VALUE ) {
        maxScore = Integer . MAX_VALUE ;
        tScore = Integer . MAX_VALUE ;
      }
    }
    if ( tScore > res ) res = tScore ;
  }
  System . out . println ( res ) ;
}
