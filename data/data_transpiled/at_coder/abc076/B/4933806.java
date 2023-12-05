public static void print ( int N ) {
  int K = Integer . parseInt ( input ( ) ) ;
  int i = 0 ;
  int ans = 1 ;
  while ( i < N ) {
    ans = Math . min ( ans * 2 , ans + K ) ;
    i ++ ;
  }
  System . out . println ( ans ) ;
}
