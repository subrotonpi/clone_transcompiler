public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( Integer . parseInt ( input ) ) ;
  }
  int c = 1001 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( l . get ( i ) . intValue ( ) > m ) ) {
      continue ;
    }
    else if ( ( l . get ( i ) . intValue ( ) < c ) ) {
      c = l . get ( i ) . intValue ( ) ;
    }
    else {
      continue ;
    }
  }
  if ( ( c == 1001 ) && ( l . get ( i ) . intValue ( ) > m ) ) {
    System . out . println ( "TLE" ) ;
  }
  else {
    System . out . println ( c ) ;
  }
}
