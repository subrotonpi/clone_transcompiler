public static void print ( int n ) {
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int st = 1 ;
    while ( st <= d ) {
      st += a ;
      cnt ++ ;
    }
  }
  System . out . println ( cnt + x ) ;
}
