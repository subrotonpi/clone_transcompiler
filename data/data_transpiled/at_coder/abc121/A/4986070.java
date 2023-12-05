public static void HHH ( int HHH , int WWW ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int fullCells = HHH * WWW ;
  fullCells -= h * WWW ;
  fullCells -= ( ( w * HHH ) - ( h * w ) ) ;
  System . out . println ( fullCells ) ;
}
