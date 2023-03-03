public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] words = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    words [ i ] = input . nextLine ( ) ;
  }
  int en = endAtOneBased ( words ) ;
  if ( en == 0 ) {
    System . out . println ( "DRAW" ) ;
  }
  else if ( en % 2 == 0 ) {
    System . out . println ( "WIN" ) ;
  }
  else {
    System . out . println ( "LOSE" ) ;
  }
}
