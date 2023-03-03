[ ] a = {
  1 , 3 , 5 , 7 , 8 , 10 , 12 }
  ;
  List < Integer > b = Arrays . asList ( 4 , 6 , 9 , 11 ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) , y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( x == 2 ) {
    System . out . println ( "No" ) ;
  }
  else if ( a . contains ( x ) && a . contains ( y ) ) {
    System . out . println ( "Yes" ) ;
  }
  else if ( b . contains ( x ) && b . contains ( y ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
