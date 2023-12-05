public static void input ( ) {
  String S = input . nextLine ( ) ;
  String T = input . nextLine ( ) ;
  String N = "" ;
  boolean flg = false ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    N = S . substring ( i ) + S . substring ( 0 , i ) ;
    if ( N . equals ( T ) ) {
      flg = true ;
    }
  }
  if ( flg ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
