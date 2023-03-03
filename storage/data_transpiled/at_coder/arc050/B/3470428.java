public static int [ ] [ ] getPoints ( ) {
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int L = 0 ;
  int U = R + 1 ;
  while ( U - L > 1 ) {
    int t = ( U + L ) / 2 ;
    if ( R - t < 0 || B - t < 0 || ( R - t ) / ( x - 1 ) + ( B - t ) / ( y - 1 ) < t ) U = t ;
    else L = t ;
  }
  System . out . println ( L ) ;
  return null ;
}
