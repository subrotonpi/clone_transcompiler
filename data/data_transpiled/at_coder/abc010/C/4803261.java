public static final double [ ] getDistance ( ) {
  final int [ ] ren = Arrays . stream ( String . valueOf ( input . nextLine ( ) ) . split ( "\\s+" ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  final double cango = Integer . parseInt ( ren [ 4 ] ) * Integer . parseInt ( ren [ 5 ] ) ;
  String ou = "NO" ;
  for ( int i = 0 ;
  i < Integer . parseInt ( input . nextLine ( ) ) ;
  i ++ ) {
    final String [ ] tmp = String . valueOf ( input . nextLine ( ) ) . split ( "\\s+" ) ;
    final int x = Integer . parseInt ( tmp [ 0 ] ) ;
    final int y = Integer . parseInt ( tmp [ 1 ] ) ;
    final double tofrom = Math . sqrt ( ( x - ren [ 0 ] ) * ( x - ren [ 0 ] ) + ( y - ren [ 1 ] ) * ( y - ren [ 1 ] ) ) ;
    final double fromto = Math . sqrt ( ( ren [ 2 ] - x ) * ( ren [ 2 ] - x ) + ( ren [ 3 ] - y ) * ( ren [ 3 ] - y ) ) ;
    if ( ( tofrom + fromto ) <= cango ) {
      ou = "YES" ;
      break ;
    }
  }
  System . out . println ( ou ) ;
  return null ;
}
