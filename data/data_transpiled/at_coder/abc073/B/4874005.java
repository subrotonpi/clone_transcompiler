public static void print ( int n ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int r = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int l = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    ans += l - r + 1 ;
  }
  System . out . println ( ans ) ;
}
