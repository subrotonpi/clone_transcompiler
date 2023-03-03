public static void main ( String input ) {
  int H = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int yoko = ( W - 1 ) * H ;
  int tate = W * ( H - 1 ) ;
  System . out . println ( yoko + tate ) ;
}
