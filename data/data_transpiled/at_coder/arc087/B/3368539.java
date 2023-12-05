public static void input ( Scanner in ) {
  int x = in . nextInt ( ) , y = in . nextInt ( ) ;
  int [ ] m = in . nextInt ( ) . split ( "T" ) ;
  Set < Integer > dpX = new THashSet < Integer > ( m [ 0 ] ) ;
  for ( int i = 2 ;
  i < m . length ;
  i += 2 ) {
    Set < Integer > newDP = new HashSet < Integer > ( ) ;
    for ( int v : dpX ) {
      newDP . add ( v + i ) ;
    }
    dp . add ( m [ i ] - i ) ;
  }
  dpX = newDP ;
  in . close ( ) ;
  System . out . println ( x >= 0 && y >= 0 ? "Yes" : "No" ) ;
}
