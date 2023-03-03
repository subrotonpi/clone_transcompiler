public static void main ( String input ) {
  int a , b = map ( Integer . parseInt , input . split ( " " ) ) ;
  int d = b - a ;
  System . out . println ( ( 1 + d ) * d / 2 - b ) ;
}
