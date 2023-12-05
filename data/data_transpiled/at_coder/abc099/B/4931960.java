public static void main ( String input ) {
  int a = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int b = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int s = 0 ;
  for ( int i = 0 ;
  i < b - a + 1 ;
  i ++ ) {
    s = s + i ;
  }
  System . out . println ( s - b ) ;
}
