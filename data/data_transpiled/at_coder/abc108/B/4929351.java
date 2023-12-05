public static void main ( String [ ] args ) {
  int x1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int dx = x2 - x1 ;
  int dy = y2 - y1 ;
  int x3 = x2 - dy ;
  int y3 = y2 + dx ;
  int x4 = x3 - dx ;
  int y4 = y3 - dy ;
  String ans = Integer . toString ( x3 ) + " " + Integer . toString ( y3 ) + " " + Integer . toString ( x4 ) + " " + Integer . toString ( y4 ) ;
  System . out . println ( ans ) ;
}
