public static int w = Integer . parseInt ( input ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > xy = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) xy . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  List < List < Integer >> field = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int k = 0 ;
  k < n ;
  k ++ ) for ( int l = 0 ;
  l < n ;
  l ++ ) for ( int j = 0 ;
  j < n ;
  j ++ ) field . add ( new ArrayList < > ( ) ) ;
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  /* dp */
  if ( ( map . containsKey ( ( Integer ) field . get ( ( Integer ) field . get ( ( Integer ) field . get ( ( Integer ) field . get ( 0 ) ) ) ) ) ) ) {
    return 0 ;
  }
  int bf = 0 ;
  for ( int x = 0 ;
  x < xy . size ( ) ;
  x ++ ) {
    int y = xy . get ( x ) ;
    if ( xle <= y && ydo <= y && ydo <= y ) bf = Math . max ( bf , xri - yup ) ;
  }
  map . put ( ( Integer ) field . get ( ( Integer ) field . get ( 0 ) ) , bf ) ;
  return bf ;
}
