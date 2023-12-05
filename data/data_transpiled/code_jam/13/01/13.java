public static int ntest = Integer . parseInt ( Scanner in ) {
  for ( int itc = 0 ;
  itc < ntest ;
  itc ++ ) {
    System . out . format ( "Case #%d:" , itc + 1 ) ;
    String [ ] peta = new String [ 4 ] ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) peta [ i ] = in . next ( ) ;
    in . nextLine ( ) ;
    String [ ] tochecks = {
      "O" , "X" }
      ;
      boolean done = false ;
      for ( String tocheck : tochecks ) {
        String [ ] newpeta = Arrays . copyOf ( peta , peta . length ) ;
        boolean iswin = false ;
        iswin |= newpeta [ 0 ] . contains ( tocheck ) * 4 ;
        iswin |= Arrays . equals ( tocheck , newpeta [ 0 ] ) * 4 ;
        iswin |= tocheck * 4 == newpeta [ 0 ] . charAt ( 0 ) + newpeta [ 1 ] . charAt ( 1 ) + newpeta [ 2 ] . charAt ( 2 ) + newpeta [ 3 ] . charAt ( 3 ) ;
        iswin |= tocheck * 4 == newpeta [ 3 ] . charAt ( 0 ) + newpeta [ 2 ] . charAt ( 1 ) + newpeta [ 1 ] . charAt ( 2 ) + newpeta [ 0 ] . charAt ( 3 ) ;
        if ( iswin ) {
          done = true ;
          System . out . println ( tocheck + " won" ) ;
        }
      }
      if ( ! done ) {
        if ( ! peta [ 0 ] . contains ( "." ) ) System . out . println ( "Draw" ) ;
        else System . out . println ( "Game has not completed" ) ;
      }
    }
    return ntest ;
  }
  