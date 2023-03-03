public static int N = Integer . parseInt ( input ) {
  int [ ] A = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int ans = 0 ;
  @ SuppressWarnings ( "unused" ) for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    ans = Math . max ( ans , Math . abs ( A [ i ] - A [ i ] ) ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
