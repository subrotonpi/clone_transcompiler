public static String solve ( String num ) {
  if ( Integer . parseInt ( num ) == 0 ) {
    return "" ;
  }
  if ( num . length ( ) == 1 ) {
    return num ;
  }
  String candid = solve ( num . substring ( 1 ) ) ;
  if ( candid . isEmpty ( ) ) {
    return ( num . charAt ( 0 ) == '1' ? "0" : Integer . toString ( num . charAt ( 0 ) - 1 ) ) + "9" . substring ( num . length ( ) - 1 ) ;
  }
  else if ( num . charAt ( 0 ) <= candid . charAt ( 0 ) ) {
    return num . charAt ( 0 ) + candid ;
  }
  else {
    return ( num . charAt ( 0 ) == '1' ? "0" : Integer . toString ( num . charAt ( 0 ) - 1 ) ) + "9" . substring ( num . length ( ) - 1 ) ;
  }
}
int testNum = Integer . parseInt ( input . nextLine ( ) ) ;
for ( int i = 1 ;
i <= testNum ;
i ++ ) {
  String ans = solve ( input . nextLine ( ) . trim ( ) ) ;
  while ( ans . charAt ( 0 ) == '0' ) {
    ans = ans . substring ( 1 ) ;
  }
  System . err . println ( "Case #" + i + ": " + ans ) ;
  System . err . println ( i ) ;
}
