public static void main ( String input ) {
  int a = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int b = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < b - a ;
  i ++ ) {
    sum += i + 1 ;
  }
  System . out . println ( sum - b ) ;
}
