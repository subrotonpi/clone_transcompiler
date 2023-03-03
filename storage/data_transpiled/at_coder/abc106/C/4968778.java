public static void print ( String s ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean iti = true ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    if ( s . charAt ( i ) != '1' ) {
      System . out . println ( s . charAt ( i ) ) ;
      iti = false ;
      break ;
    }
  }
  if ( iti ) {
    System . out . println ( 1 ) ;
  }
}
