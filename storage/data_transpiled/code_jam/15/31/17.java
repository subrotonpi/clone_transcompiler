private static void solve ( int test ) {
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = c % w == 0 ? ( c / w + w - 1 ) : ( c / w + w ) ;
  ans += ( r - 1 ) * c / w ;
  System . out . println ( "Case #" + test + ": " + ans ) ;
}
