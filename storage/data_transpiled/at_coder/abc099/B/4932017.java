public static void main ( String input ) {
  int a , b = map ( Integer . parseInt , input . split ( " " ) ) ;
  int n = b - a ;
  System . out . println ( n * ( n + 1 ) / 2 - b ) ;
}
