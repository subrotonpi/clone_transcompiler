public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int cnt = 0 ;
  if ( s <= w && w <= t ) {
    cnt ++ ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    w += Integer . parseInt ( input . nextLine ( ) ) ;
    if ( s <= w && w <= t ) {
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
}
