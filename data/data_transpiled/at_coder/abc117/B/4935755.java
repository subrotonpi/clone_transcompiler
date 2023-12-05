public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > l = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  boolean flag = true ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( Integer . parseInt ( l . get ( i ) ) - l . get ( i ) > l . get ( i ) ) {
    }
    else {
      flag = false ;
    }
  }
  if ( flag ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
