public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input ) ) ;
  }
  L = new ArrayList < > ( L ) ;
  Collections . sort ( L ) ;
  int Sum = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    Sum += L . get ( i ) ;
  }
  if ( L . get ( N - 1 ) < Sum ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
