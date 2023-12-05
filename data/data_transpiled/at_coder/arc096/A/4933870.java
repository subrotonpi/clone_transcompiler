public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = - 1 ;
  for ( int n_AB = 0 ;
  n_AB <= X ;
  n_AB ++ ) {
    int n_A = Math . max ( X - n_AB , 0 ) ;
    int n_B = Math . max ( Y - n_AB , 0 ) ;
    int p = n_A * n_B + n_B * n_AB * 2 * C ;
    ans = p == - 1 || p < ans ? p : ans ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
