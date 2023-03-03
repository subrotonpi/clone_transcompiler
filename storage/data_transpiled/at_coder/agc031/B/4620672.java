public static int N = Integer . parseInt ( input ) {
  int preStone = 0 ;
  int div = 10 * 9 + 7 ;
  int dp = 1 ;
  HashMap < Integer , Integer > dpMap = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( preStone != c ) {
      preStone = c ;
      if ( ! dpMap . containsKey ( c ) ) {
        dpMap . put ( c , 0 ) ;
      }
      dp += dpMap . get ( c ) ;
      dpMap . put ( c , dp ) ;
    }
  }
  System . out . println ( dp % div ) ;
  return dp ;
}
