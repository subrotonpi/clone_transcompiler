public static void main ( String [ ] args ) {
  final String [ ] dateString = input . split ( "/" ) ;
  String y = dateString [ 0 ] ;
  String m = dateString [ 1 ] ;
  String d = dateString [ 2 ] ;
  Calendar date = Calendar . getInstance ( ) ;
  date . set ( Integer . parseInt ( y ) , Integer . parseInt ( m ) , Integer . parseInt ( d ) ) ;
  do {
    if ( ( Integer . parseInt ( date . get ( Calendar . YEAR ) ) % ( Integer . parseInt ( date . get ( Calendar . MONTH ) ) * Integer . parseInt ( date . get ( Calendar . DAY_OF_MONTH ) ) ) == 0 ) ) {
      System . out . println ( date . get ( Calendar . YEAR ) + "/" + date . get ( Calendar . MONTH ) + "/" + date . get ( Calendar . DAY_OF_MONTH ) ) ;
      return ;
    }
    date . add ( Calendar . DATE , 1 ) ;
  }
  while ( date . get ( Calendar . YEAR ) != 0 ) ;
}
