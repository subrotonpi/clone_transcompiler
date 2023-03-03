public static int N ( ) {
  List < Integer > list = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) list . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int maxval = Collections . max ( list ) ;
  list . remove ( maxval ) ;
  int total = Collections . sum ( list ) ;
  if ( total > maxval ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return total ;
}
