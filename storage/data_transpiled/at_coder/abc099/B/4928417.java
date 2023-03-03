public static void main ( String input ) {
  int a = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int b = Integer . parseInt ( input ) ;
  int dif = b - a ;
  int tower_b = 0 ;
  for ( int i = 0 ;
  i < dif ;
  i ++ ) tower_b += i + 1 ;
  System . out . println ( tower_b - b ) ;
}
