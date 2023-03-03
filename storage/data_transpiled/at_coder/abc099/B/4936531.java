public static void main ( String input ) {
  int a = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int b = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int div = b - a ;
  int num = 0 ;
  for ( int i = 1 ;
  i < div ;
  i ++ ) {
    num += i ;
  }
  System . out . println ( num - a ) ;
}
