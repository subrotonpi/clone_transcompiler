public static void main ( String input ) {
  int h = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int m = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int res = 0 ;
  if ( m > 0 ) res = 60 - m + ( 17 - h ) * 60 ;
  else res = ( 18 - h ) * 60 ;
  System . out . println ( res ) ;
}
