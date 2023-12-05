public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a > b ) {
    System . out . println ( 0 ) ;
  }
  else if ( n == 1 && a < b ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( ( b - a ) * ( n - 2 ) + 1 ) ;
  }
  return a ;
}
