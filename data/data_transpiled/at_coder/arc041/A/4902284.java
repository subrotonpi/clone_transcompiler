public static void main ( String [ ] args ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( k <= y ) {
    System . out . println ( x + k ) ;
  }
  else {
    System . out . println ( y + x - ( k - y ) ) ;
  }
}
