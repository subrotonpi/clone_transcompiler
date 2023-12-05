public static void drawLine ( ) {
  int x1 = Integer . parseInt ( input . readLine ( ) ) ;
  int y1 = Integer . parseInt ( input . readLine ( ) ) ;
  int x2 = Integer . parseInt ( input . readLine ( ) ) ;
  int y2 = Integer . parseInt ( input . readLine ( ) ) ;
  d = ( y2 - y2 + y1 ) ;
  d . set ( x1 + d . x , y2 + d . y , x1 + d . x , y1 + d . y ) ;
}
