public static void print ( int H , int W ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = H * W - ( h * W + w * ( H - h ) ) ;
  System . out . println ( ans ) ;
}
