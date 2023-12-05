public static void input ( ) {
  String S = input . nextLine ( ) ;
  String T = input . nextLine ( ) ;
  boolean f = false ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . substring ( S . length ( ) - i ) + S . substring ( 0 , S . length ( ) - i ) . equals ( T ) ) {
      f = true ;
      break ;
    }
  }
  if ( f ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
