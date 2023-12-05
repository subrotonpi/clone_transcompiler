public static int x ( int a , int b ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( b - a > x ) {
    System . out . println ( "dangerous" ) ;
  }
  else if ( b > a ) {
    System . out . println ( "safe" ) ;
  }
  else {
    System . out . println ( "delicious" ) ;
  }
  return x ;
}
