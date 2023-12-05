public static int x ( int a , int b ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( a >= b ) && ( a <= x ) ) {
    System . out . println ( "delicious" ) ;
  }
  else if ( ( b - a <= x ) && ( b - x <= x ) ) {
    System . out . println ( "safe" ) ;
  }
  else {
    System . out . println ( "dangerous" ) ;
  }
  return x ;
}
