public static void print ( int n ) {
  int d = Integer . parseInt ( input . nextLine ( ) ) , x = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = 1 ;
    j <= d ;
    j += a ) {
      x ++ ;
    }
  }
  System . out . println ( x ) ;
}
