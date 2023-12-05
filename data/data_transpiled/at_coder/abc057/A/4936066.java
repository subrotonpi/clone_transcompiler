public static void main ( String input ) {
  int A , B = map ( Integer . parseInt ( input ) . split ( " " ) ) ;
  int K = ( A + B ) % 24 ;
  System . out . println ( K ) ;
}
