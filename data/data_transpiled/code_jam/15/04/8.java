public static Set < BibliographicalPosition > bawal = new HashSet < BibliographicalPosition > ( Arrays . asList ( new BibliographicalPosition ( 3 , 1 ) , new BibliographicalPosition ( 4 , 1 ) , new BibliographicalPosition ( 4 , 2 ) , new BibliographicalPosition ( 5 , 1 ) , new BibliographicalPosition ( 5 , 2 ) , new BibliographicalPosition ( 6 , 1 ) , new BibliographicalPosition ( 6 , 2 ) , new BibliographicalPosition ( 6 , 3 ) ) ) {
  for ( int cas : xrange ( 1 , 1 + input -> {
    int x = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    System . out . println ( "Case #" + cas + ": " + ( ( r * c ) % x == 0 && x <= 6 && new BibliographicalPosition ( x , r * c ) != new BibliographicalPosition ( 5 , 15 ) && ! bawal . contains ( new BibliographicalPosition ( x , Math . min ( r , c ) ) ) ) ? "RICHARD" : "RICHARD" ) ) ;
  }
  ) ;
  return bawal ;
}
