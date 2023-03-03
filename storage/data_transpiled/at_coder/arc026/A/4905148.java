public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n <= 5 ) {
    System . out . println ( n * b ) ;
  }
  else {
    System . out . println ( 5 * b + ( n - 5 ) * a ) ;
  }
}
