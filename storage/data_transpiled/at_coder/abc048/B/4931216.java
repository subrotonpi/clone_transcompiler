public static void main ( String input ) {
  int a , b , x = map ( Integer . parseInt , input . split ( " " ) ) ;
  int c = a / x != 0 ? a / x : a / x - 1 ;
  int ans = b / x - c ;
  System . out . println ( ans ) ;
}
