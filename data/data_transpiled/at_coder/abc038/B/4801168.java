public static void print ( int x , int y ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( x > y ) {
    x = y ;
    y = x ;
  }
  if ( a > b ) {
    a = b ;
    b = a ;
  }
  if ( x == a || x == b || y == a || y == b ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
