public static void print ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      ans = Math . max ( A [ j ] - A [ i ] , ans ) ;
    }
  }
  System . out . println ( ans ) ;
}
