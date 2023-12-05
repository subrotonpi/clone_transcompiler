public static int H ( ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  return ( int ) ( ( H * W ) - ( h * W + w * H - h * w ) ) ;
}
