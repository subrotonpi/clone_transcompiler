public static void print ( String s ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  boolean Y = false ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    String w = s . substring ( i , i + 1 ) ;
    if ( w . equals ( "Y" ) ) Y = true ;
  }
  if ( Y == true ) {
    System . out . println ( "Four" ) ;
  }
  else {
    System . out . println ( "Three" ) ;
  }
}
