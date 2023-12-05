public static int x1 ( ) {
  int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x3 = x2 - ( y2 - y1 ) ;
  int y3 = y2 + ( x2 - x1 ) ;
  int x4 = x3 - ( x2 - x1 ) ;
  int y4 = y3 - ( y2 - y1 ) ;
  return x3 ;
}
