public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < String > words = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) words . add ( input . substring ( i , i + 1 ) ) ;
  boolean flag = false ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( words . get ( i ) . charAt ( words . get ( i ) . length ( ) - 1 ) != words . get ( i + 1 ) . charAt ( 0 ) ) flag = true ;
    else continue ;
  }
  if ( words . size ( ) != new HashSet < String > ( words ) . size ( ) ) System . out . println ( "No" ) ;
  else if ( flag == true ) System . out . println ( "No" ) ;
  else System . out . println ( "Yes" ) ;
}
