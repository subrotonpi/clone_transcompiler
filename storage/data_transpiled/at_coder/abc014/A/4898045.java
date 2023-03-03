public static int input ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = a % b ;
  if ( x == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( b - x ) ;
  }
  return x ;
}
