public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ng = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    ng . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  if ( ng . contains ( n ) ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  int cnt = 0 ;
  while ( n != 0 ) {
    if ( ! ng . contains ( n - 3 ) && n - 3 >= 0 ) n -= 3 ;
    else if ( ! ng . contains ( n - 2 ) && n - 2 >= 0 ) n -= 2 ;
    else if ( ! ng . contains ( n - 1 ) && n - 1 >= 0 ) n -= 1 ;
    else {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
    cnt ++ ;
  }
  if ( cnt > 100 ) System . out . println ( "NO" ) ;
  else System . out . println ( "YES" ) ;
}
