public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a % 2 == 1 && b % 2 == 1 && c % 2 == 1 ) {
    System . out . println ( Math . min ( a * b , b * c , c * a ) ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
  return a ;
}
