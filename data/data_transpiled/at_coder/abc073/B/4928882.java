public static void print ( int n ) {
  int num = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) , r = Integer . parseInt ( input . nextLine ( ) ) ;
    num += ( r - l + 1 ) ;
  }
  System . out . println ( num ) ;
}
