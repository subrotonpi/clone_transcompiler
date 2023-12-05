public static void main ( String input ) {
  int a = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int b = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int d = b - a ;
  int h = 0 ;
  for ( int i = 0 ;
  i < d ;
  i ++ ) {
    h += i + 1 ;
  }
  System . out . println ( h - b ) ;
}
