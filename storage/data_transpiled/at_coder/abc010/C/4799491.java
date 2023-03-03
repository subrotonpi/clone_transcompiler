public static String input ( ) {
  int x1 = Integer . parseInt ( input . readLine ( ) ) ;
  int y1 = Integer . parseInt ( input . readLine ( ) ) ;
  int x2 = Integer . parseInt ( input . readLine ( ) ) ;
  int y2 = Integer . parseInt ( input . readLine ( ) ) ;
  int t = Integer . parseInt ( input . readLine ( ) ) ;
  int v = Integer . parseInt ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  String ans = "NO" ;
  for ( ;
  ;
  ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    if ( ( ( x - x1 ) * x + ( y - y1 ) * y ) * y <= .5 + ( ( x - x2 ) * y + ( y - y2 ) * y ) * y <= .5 ) {
      ans = "YES" ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
