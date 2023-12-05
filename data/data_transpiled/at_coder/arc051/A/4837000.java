public static void solve ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a <= x - r && x + r <= c && b <= y - r && y + r <= d ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  if ( ( c - x ) * ( c - x ) + ( d - y ) * ( c - x ) * ( c - x ) + ( b - y ) * ( b - y ) * ( a - x ) + ( d - y ) * ( d - y ) * ( a - x ) + ( b - y ) * ( b - y ) * ( a - x ) ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
}
