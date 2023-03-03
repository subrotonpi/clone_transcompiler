public static void main ( String [ ] args ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int odd = K % 2 == 1 ? ( K / 2 ) + 1 : ( K / 2 ) ;
  int even = K / 2 ;
  System . out . println ( odd * even ) ;
}
