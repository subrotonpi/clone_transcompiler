public static void print ( int a ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < a + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < b + 1 ;
    j ++ ) {
      for ( int k = 0 ;
      k < c + 1 ;
      k ++ ) {
        if ( 500 * i + 100 * j + 50 * k == x ) {
          ans ++ ;
        }
        else {
        }
      }
    }
  }
  System . out . println ( ans ) ;
}
