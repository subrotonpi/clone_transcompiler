public static void main ( String input ) {
  int x = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int y = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int ans = 0 ;
  while ( x <= y ) {
    x *= 2 ;
    ans ++ ;
  }
  System . out . println ( ans ) ;
}
