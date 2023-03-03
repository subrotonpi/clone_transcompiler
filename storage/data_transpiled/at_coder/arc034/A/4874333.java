public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    int d = Integer . parseInt ( input . readLine ( ) ) ;
    int e = Integer . parseInt ( input . readLine ( ) ) ;
    int tmp = a + b + c + d + e * 110 / 900 ;
    ans = Math . max ( ans , tmp ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
