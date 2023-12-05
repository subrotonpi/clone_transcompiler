public static void n ( ) {
  String [ ] words = input . nextLine ( ) . split ( " " ) ;
  List < String > ans = new ArrayList < String > ( ) ;
  for ( String word : words ) {
    List < String > w = new LinkedList < String > ( word . toLowerCase ( ) ) ;
    StringBuffer temp = new StringBuffer ( ) ;
    for ( int j = 0 ;
    j < w . size ( ) ;
    j ++ ) {
      switch ( w . get ( j ) ) {
        case 'b' : case 'c' : temp . append ( '1' ) ;
        break ;
        case 'd' : case 'w' : temp . append ( '2' ) ;
        break ;
        case 't' : case 'j' : temp . append ( '3' ) ;
        break ;
        case 'f' : case 'q' : temp . append ( '4' ) ;
        break ;
        case 'l' : case 'v' : temp . append ( '5' ) ;
        break ;
        case 's' : case 'x' : temp . append ( '6' ) ;
        break ;
        case 'p' : case 'm' : temp . append ( '7' ) ;
        break ;
        case 'h' : case 'k' : temp . append ( '8' ) ;
        break ;
        case 'n' : case 'g' : temp . append ( '9' ) ;
        break ;
        case 'z' : case 'r' : temp . append ( '0' ) ;
        break ;
      }
    }
    if ( ! temp . equals ( "" ) ) {
      ans . add ( temp . toString ( ) ) ;
    }
  }
  System . out . println ( ans . toString ( ) ) ;
}
