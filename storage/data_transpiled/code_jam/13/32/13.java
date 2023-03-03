static final Scanner in = new Scanner ( System . in ) {
  int T = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int cas : xrange ( 1 , T + 1 ) ) {
    System . out . println ( "Case #" + cas + ":" ) ;
    int X = Integer . parseInt ( in . nextLine ( ) ) ;
    int Y = Integer . parseInt ( in . nextLine ( ) ) ;
    StringBuffer ans = new StringBuffer ( ) ;
    if ( X < 0 ) ans . append ( "EW" ) ;
    else if ( X > 0 ) ans . append ( "WE" ) ;
    if ( Y < 0 ) ans . append ( "NS" ) ;
    else if ( Y > 0 ) ans . append ( "SN" ) ;
    System . out . println ( ans ) ;
  }
}
