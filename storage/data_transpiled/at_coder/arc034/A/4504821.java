public static void print ( int n ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    int e = Integer . parseInt ( input . nextLine ( ) ) ;
    ans = Math . max ( ans , a + b + c + d + 110 * e / 900 ) ;
  }
  System . out . println ( ans ) ;
}
