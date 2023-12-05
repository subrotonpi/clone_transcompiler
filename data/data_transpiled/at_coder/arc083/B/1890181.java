public static int solve ( int n , List < List < Integer >> tbl ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    List < Integer > rowI = tbl . get ( i ) ;
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      List < Integer > rowJ = tbl . get ( j ) ;
      int ij = rowI . get ( j ) ;
      double mind = Math . min ( ( ik + kj ) , Double . MAX_VALUE ) ;
      if ( ij > mind ) return - 1 ;
      if ( ij < mind ) ans += ij ;
    }
  }
  return ans ;
}
