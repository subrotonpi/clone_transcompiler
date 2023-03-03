public static void print ( int n ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < String > lists1 = new LinkedList < String > ( ) ;
  lists1 . add ( String . valueOf ( input . nextLine ( ) ) ) ;
  int ans = 1 ;
  lists1 . add ( "!" ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    switch ( i ) {
      case 0 : ans *= 3 ;
      break ;
      case 1 : ans *= 2 ;
      break ;
      default : if ( lists1 . get ( i ) == lists1 . get ( i - 1 ) ) {
        ans *= 3 ;
      }
      else {
        ans *= 3 ;
      }
    }
  }
  System . out . println ( ans % ( 10 * 9 + 7 ) ) ;
}
