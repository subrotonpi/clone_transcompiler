public static int x = Integer . parseInt ( input ) {
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int kyori = Math . abs ( Math . abs ( x ) - Math . abs ( y ) ) ;
  int hanten = 0 ;
  if ( ( x > 0 && y > 0 || x < 0 && y < 0 ) ) hanten = 2 ;
  return kyori + hanten ;
}
