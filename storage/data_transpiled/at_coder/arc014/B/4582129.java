public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] w = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w [ i ] = input . nextLine ( ) ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( w [ i - 1 ] . charAt ( w [ i ] . length ( ) - 1 ) != w [ i ] . charAt ( 0 ) || w [ i ] . contains ( w [ i ] ) ) {
      b = i ;
      break ;
    }
  }
  else {
    System . out . println ( "DRAW" ) ;
    exit ( ) ;
  }
  if ( b % 2 ) {
    System . out . println ( "WIN" ) ;
  }
  else {
    System . out . println ( "LOSE" ) ;
  }
}
