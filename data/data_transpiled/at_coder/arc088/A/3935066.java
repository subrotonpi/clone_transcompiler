public static void main ( String input ) {
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  int cnt = 0 ;
  while ( x <= y ) {
    cnt ++ ;
    x *= 2 ;
  }
  System . out . println ( cnt ) ;
}
