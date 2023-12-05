public static int n ( ) {
  int y = Integer . parseInt ( input . nextLine ( ) ) , i ;
  int ans_i = - 1 ;
  int ans_j = - 1 ;
  int ans_k = - 1 ;
  for ( i = 0 ;
  i < n + 1 ;
  i ++ ) {
    for ( j = 0 ;
    j < n - i + 1 ;
    j ++ ) {
      int k = n - i - j ;
      if ( k == y ) {
        ans_i = i ;
        ans_j = j ;
        ans_k = k ;
      }
    }
  }
  return ans_i ;
}
