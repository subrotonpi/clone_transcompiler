static final int solve ( int x ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> d = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d . add ( new ArrayList < > ( ) ) ;
  }
  for ( int a = 1 ;
  a < n ;
  a ++ ) {
    int b = Integer . parseInt ( input ( ) ) - 1 ;
    d . get ( b ) . add ( a ) ;
  }
  @ SuppressWarnings ( "unused" ) int result = 0 ;
  return result ;
}
