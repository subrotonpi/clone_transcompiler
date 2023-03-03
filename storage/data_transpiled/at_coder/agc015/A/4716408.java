public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n == 1 && a != b ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( Math . max ( 0 , ( n - 2 ) * ( b - a ) + 1 ) ) ;
  }
  return a ;
}
