public static void solve ( ) {
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    System . out . println ( "? " + ( 10 * i ) ) ;
    String ans = input . nextLine ( ) ;
    if ( ans . equals ( "N" ) ) {
      solve2 ( i ) ;
      return ;
    }
  }
  solve1 ( ) ;
  {
    int lower = 10 * ( i - 1 ) ;
    int upper = 10 * i - 1 ;
    while ( ( upper - lower ) > 1 ) {
      int mid = ( lower + upper ) / 2 ;
      System . out . println ( "? " + mid ) ;
      String ans = input . nextLine ( ) ;
      if ( ans . equals ( "Y" ) ) {
        upper = mid ;
      }
      else {
        lower = mid ;
      }
    }
    System . out . println ( "! " + upper ) ;
  }
}
