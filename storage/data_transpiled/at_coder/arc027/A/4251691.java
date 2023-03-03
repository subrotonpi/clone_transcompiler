public static void main ( String input ) {
  int h , m = map ( Integer . parseInt ( input ) , 0 ) ;
  DIF = 60 * ( 18 - h - 1 ) + 60 - m ;
  System . out . println ( DIF ) ;
}
