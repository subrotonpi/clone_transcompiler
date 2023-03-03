public static void print ( String s ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = list ( input . nextLine ( ) ) ;
  int cnt = 0 ;
  StringBuffer buf = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == '(' ) {
      cnt ++ ;
    }
    else {
      if ( cnt > 0 ) {
        cnt -- ;
      }
      else {
        buf . append ( '(' ) ' ) ; } } } }