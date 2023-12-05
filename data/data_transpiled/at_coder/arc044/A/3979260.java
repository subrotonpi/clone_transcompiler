public static int a ( ) {
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a != 1 && a % 2 != 0 && a % 3 != 0 && a % 5 != 0 ) {
    System . out . println ( "Prime" ) ;
  }
  else {
    System . out . println ( "Not Prime" ) ;
  }
}
