public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] lists = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    lists [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] cases = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    cases [ i ] = i ;
  }
  int cur = 0 ;
  for ( int cd : lists ) {
    for ( int i = 0 ;
    i < cases . length ;
    i ++ ) {
      if ( cases [ i ] == cd ) {
        int tmp = cur ;
        cur = cases [ i ] ;
        cases [ i ] = tmp ;
        break ;
      }
    }
  }
  for ( int cd : cases ) {
    System . out . println ( cd ) ;
  }
}
