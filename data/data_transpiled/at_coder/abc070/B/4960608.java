public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( b <= c || d <= a ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( Math . min ( b , d ) - Math . max ( a , c ) ) ;
  }
  return b ;
}
