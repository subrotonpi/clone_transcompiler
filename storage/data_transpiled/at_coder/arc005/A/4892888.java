@ Implementation public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  String [ ] w = input . split ( " " ) ;
  w [ w . length - 1 ] = w [ w . length - 1 ] . substring ( 0 , w . length - 1 ) ;
  Arrays . sort ( w ) ;
  C = new Counter ( w ) ;
  System . out . println ( C . get ( "takahashikun" ) ) ;
}
