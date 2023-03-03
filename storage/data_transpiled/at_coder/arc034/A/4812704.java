public static int n = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    int e = Integer . parseInt ( input . nextLine ( ) ) ;
    ans = Math . max ( ans , Math . pow ( a , b ) + c + d ) + e * 110 / 900 ;
  }
  return ans ;
}
