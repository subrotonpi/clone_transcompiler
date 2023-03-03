static final String print ( ) {
  int x1 = Integer . parseInt ( input . readLine ( ) ) ;
  int y1 = Integer . parseInt ( input . readLine ( ) ) ;
  int x2 = Integer . parseInt ( input . readLine ( ) ) ;
  int y2 = Integer . parseInt ( input . readLine ( ) ) ;
  int x3 = y1 - y2 + x2 ;
  int y3 = x2 - x1 + y2 ;
  int x4 = y1 - y2 + x1 ;
  int y4 = y2 - x1 ;
  return x3 ;
}
