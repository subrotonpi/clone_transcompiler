public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int ab = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  int m = Math . min ( x , y ) ;
  if ( a + b >= 2 * ab ) {
    if ( x <= y ) {
      if ( ab * 2 > b ) {
        System . out . println ( ab * 2 * m + ( y - x ) * b ) ;
      }
      else {
        System . out . println ( y * ab * 2 ) ;
      }
    }
    else {
      if ( ab * 2 > a ) {
        System . out . println ( ab * 2 * m + ( x - y ) * a ) ;
      }
      else {
        System . out . println ( ab * 2 * x ) ;
      }
    }
  }
  else {
    System . out . println ( a * x + b * y ) ;
  }
}
