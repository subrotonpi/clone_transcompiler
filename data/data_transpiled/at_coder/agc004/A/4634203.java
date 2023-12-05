public static void main ( String [ ] args ) {
  int A = Integer . parseInt ( args [ 0 ] ) ;
  int B = Integer . parseInt ( args [ 1 ] ) ;
  int C = Integer . parseInt ( args [ 2 ] ) ;
  val = [ ( A % 2 ) * B * C , ( B % 2 ) * C * A , ( C % 2 ) * A * B ] ;
  System . out . println ( Integer . toString ( min ( val ) ) ) ;
}
