public static void print ( int n ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    ans += a * b ;
  }
  System . out . println ( ( int ) ( ( ans * 1.05 / 1 ) ) ) ;
}
