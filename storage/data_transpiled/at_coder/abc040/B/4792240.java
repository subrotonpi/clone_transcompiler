public static double n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( int i = 0 ;
  i < 1000 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 1000 ;
    j ++ ) {
      if ( i * j > n ) {
        continue ;
      }
      else {
        if ( ans > n - ( i * j ) + Math . abs ( i - j ) ) {
          ans = n - ( i * j ) + Math . abs ( i - j ) ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
