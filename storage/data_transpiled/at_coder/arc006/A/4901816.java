public static void main ( String [ ] args ) {
  Set < Integer > e = new HashSet < Integer > ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > l = new HashSet < Integer > ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int matched = e . stream ( ) . filter ( l :: contains ) . count ( ) ;
  boolean bonus = l . contains ( b ) ;
  switch ( matched ) {
    case 6 : System . out . println ( 1 ) ;
    break ;
    case 5 : if ( bonus ) {
      System . out . println ( 2 ) ;
    }
    else {
      System . out . println ( 3 ) ;
    }
    break ;
    case 4 : System . out . println ( 4 ) ;
    break ;
    case 3 : System . out . println ( 5 ) ;
    break ;
    default : System . out . println ( 0 ) ;
    break ;
  }
}
