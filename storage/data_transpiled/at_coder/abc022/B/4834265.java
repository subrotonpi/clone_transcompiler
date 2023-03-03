public static void print ( int N ) {
  int ans = 0 ;
  Set < Integer > A_set = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = Integer . parseInt ( input ( ) ) ;
    if ( A_set . contains ( A ) ) ans ++ ;
    A_set . add ( A ) ;
  }
  System . out . println ( ans ) ;
}
