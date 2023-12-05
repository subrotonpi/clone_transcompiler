public static void main ( String input ) {
  int a , b = map ( Integer . parseInt , input . split ( " " ) ) ;
  int x = Integer . toString ( b ) . length ( ) ;
  System . out . println ( ( a * 10 * * x + b ) * 2 ) ;
}
