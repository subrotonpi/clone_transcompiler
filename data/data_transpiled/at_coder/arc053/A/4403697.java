public static void main ( String input ) {
  int W , H = map ( Integer . parseInt , input . split ( " " ) ) ;
  int res = ( W - 1 ) * H + ( H - 1 ) * W ;
  System . out . println ( res ) ;
}
