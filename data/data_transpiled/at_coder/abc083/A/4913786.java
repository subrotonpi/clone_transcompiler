public static LinkedList < Integer > W = new LinkedList < Integer > ( ) {
  {
    for ( int i = 0 ;
    i < input . length ( ) ;
    i ++ ) {
      if ( ( Integer . parseInt ( input . substring ( 0 , i ) ) > Integer . parseInt ( input . substring ( i + 1 , i + 2 ) ) ) ) {
        System . out . println ( "Left" ) ;
      }
      else if ( ( Integer . parseInt ( input . substring ( 0 , i ) ) < Integer . parseInt ( input . substring ( i + 1 , i + 2 ) ) ) ) {
        System . out . println ( "Right" ) ;
      }
      else {
        System . out . println ( "Balanced" ) ;
      }
    }
  }
}
