public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int ans = - 10 * 18 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Stack < Integer > stack = new Stack < > ( ) ;
    Stack < Integer > stack2 = new Stack < > ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int tmp1 = 0 ;
      int tmp2 = 0 ;
      if ( i == j ) continue ;
      if ( i > j ) {
        for ( int k = j ;
        k <= i ;
        k ++ ) {
          if ( k % 2 == j % 2 ) tmp1 += a [ k ] ;
          else tmp2 += a [ k ] ;
        }
      }
      else {
        for ( int k = i ;
        k <= j ;
        k ++ ) {
          if ( k % 2 == i % 2 ) tmp1 += a [ k ] ;
          else tmp2 += a [ k ] ;
        }
      }
      stack . push ( tmp1 ) ;
      stack2 . push ( tmp2 ) ;
    }
    ans = Math . max ( ans , stack . peek ( ) . intValue ( ) ) ;
  }
  System . out . println ( ans ) ;
}
