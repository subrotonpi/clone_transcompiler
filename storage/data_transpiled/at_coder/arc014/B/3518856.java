public static void print ( String s ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  HashSet < String > l = new HashSet < String > ( ) ;
  String b = "" ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s = input . nextLine ( ) ;
    if ( l . contains ( s ) || ( i > 0 && b . compareTo ( s . charAt ( 0 ) ) != 0 ) ) {
      System . out . println ( i % 2 != 0 ? "WIN" : "LOSE" ) ;
      break ;
    }
    b = s . charAt ( s . length ( ) - 1 ) ;
    l . add ( s ) ;
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
}
