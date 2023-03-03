public static int [ ] ints ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( b % a == 0 ) {
    System . out . println ( a + b ) ;
  }
  else {
    System . out . println ( b - a ) ;
  }
  return ints ( a , b ) ;
}
