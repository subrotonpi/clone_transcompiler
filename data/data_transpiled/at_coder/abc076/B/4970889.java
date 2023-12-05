public static void print ( int n ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ope_A = ans * 2 ;
    int ope_B = ans + k ;
    ans = Math . min ( ope_A , ope_B ) ;
  }
  System . out . println ( ans ) ;
}
