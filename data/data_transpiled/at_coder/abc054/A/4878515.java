public static int A , B = Integer . parseInt ( input . nextLine ( ) ) {
  int a = ( A - 2 ) % 13 ;
  int b = ( B - 2 ) % 13 ;
  return a > b ? "Alice" : a < b ? "Bob" : "Draw" ;
}
