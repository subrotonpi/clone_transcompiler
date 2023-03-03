public static void main ( String input ) {
  int a = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int b = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int n = b - a ;
  int tmp = n * ( n + 1 ) / 2 ;
  int ans = tmp - b ;
  System . out . println ( ans ) ;
}
