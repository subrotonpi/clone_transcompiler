public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > W = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    W . add ( input . nextLine ( ) ) ;
  }
  String last = W . remove ( 0 ) ;
  Set < String > words = new HashSet < String > ( ) ;
  words . add ( last ) ;
  String [ ] win = {
    "WIN" , "LOSE" }
    ;
    int iWin = 0 ;
    for ( String w : W ) {
      if ( words . contains ( w ) || last . charAt ( last . length ( ) - 1 ) != w . charAt ( 0 ) ) {
        System . out . println ( win [ iWin ] ) ;
        exit ( ) ;
      }
      else {
        words . add ( w ) ;
        last = w ;
        iWin = 1 - iWin ;
      }
    }
    System . out . println ( "DRAW" ) ;
  }
  