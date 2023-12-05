public static void main ( String input ) {
  int x = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int y = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int k = Integer . parseInt ( input . split ( " " ) [ 2 ] ) ;
  System . out . println ( min ( y , k ) + x - max ( k - y , 0 ) ) ;
}
