public static int a ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a % 2 == 0 ) {
    System . out . println ( a * a / 4 ) ;
  }
  else {
    System . out . println ( ( a / 2 + 1 ) * ( a / 2 ) ) ;
  }
  return a ;
}
