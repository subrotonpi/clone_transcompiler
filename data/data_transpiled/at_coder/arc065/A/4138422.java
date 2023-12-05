public static void input ( Scanner s ) {
  String [ ] search = new String [ 5 ] ;
  search [ 0 ] = s . nextLine ( ) ;
  boolean found = false ;
  while ( search . length > 0 ) {
    String se = search [ 0 ] ;
    search = Arrays . copyOf ( search , search . length ) ;
    if ( se . equals ( "dream" ) || se . equals ( "dreamer" ) || se . equals ( "erase" ) || se . equals ( "eraser" ) ) {
      System . out . println ( "YES" ) ;
      found = true ;
      break ;
    }
    if ( se . length ( ) < 5 ) continue ;
    if ( se . substring ( 0 , 5 ) . equals ( "dream" ) || se . equals ( "erase" ) ) search [ 1 ] = se . substring ( 5 ) ;
    if ( se . substring ( 0 , 6 ) . equals ( "eraser" ) ) search [ 2 ] = se . substring ( 6 ) ;
    if ( se . substring ( 0 , 7 ) . equals ( "dreamer" ) ) search [ 3 ] = se . substring ( 7 ) ;
  }
  if ( ! found ) System . out . println ( "NO" ) ;
}
