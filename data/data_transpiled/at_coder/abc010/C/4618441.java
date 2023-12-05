public static String input ( ) {
  int sx = Integer . parseInt ( input . readLine ( ) ) ;
  int sy = Integer . parseInt ( input . readLine ( ) ) ;
  int ex = Integer . parseInt ( input . readLine ( ) ) ;
  int ey = Integer . parseInt ( input . readLine ( ) ) ;
  int T = Integer . parseInt ( input . readLine ( ) ) ;
  int V = Integer . parseInt ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < Integer >> girls = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    girls . add ( Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  String ans = "NO" ;
  for ( List < Integer > girl : girls ) {
    int x = girl . get ( 0 ) ;
    int y = girl . get ( 1 ) ;
    double d = ( ( sx - x ) * ( sx - x ) + ( sy - y ) * ( sy - y ) ) * 0.5 ;
    d += ( ( ex - x ) * ( ey - x ) + ( ey - y ) * ( ey - y ) ) * 0.5 ;
    if ( d <= V * T ) {
      ans = "YES" ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
