public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > cards = new ArrayList < > ( ) ;
  for ( int num = 2 ;
  num < 14 ;
  num ++ ) {
    cards . add ( num ) ;
  }
  cards . add ( 1 ) ;
  for ( int i = 0 ;
  i < cards . size ( ) ;
  i ++ ) {
    if ( i == A && i == B ) {
      System . out . println ( "Draw" ) ;
    }
    else if ( i == A && i != B ) {
      System . out . println ( "Alice" ) ;
      break ;
    }
    else if ( i == B && i != A ) {
      System . out . println ( "Bob" ) ;
      break ;
    }
  }
  return cards . get ( 0 ) ;
}
