@ MoreIO . Method public static void main ( String [ ] args ) {
  int sx = ( Integer ) input . split ( " " ) [ 0 ] ;
  int sy = ( Integer ) input . split ( " " ) [ 1 ] ;
  int tx = ( Integer ) input . split ( " " ) [ 0 ] ;
  int ty = ( Integer ) input . split ( " " ) [ 1 ] ;
  tx = tx - sx ;
  ty = ty - sy ;
  System . out . println ( "R" + tx + "U" + ty + "L" + "D" + ty + "L" + "U" + "R" + "D" + "R" + "D" + "L" + "U" ) ;
}
