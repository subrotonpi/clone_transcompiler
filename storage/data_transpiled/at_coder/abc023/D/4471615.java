public static int n = Integer . parseInt ( input ) {
  List < List < Integer >> baloon = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    baloon . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int [ ] height = new int [ n ] ;
  for ( List < Integer > b : baloon ) {
    height [ b . size ( ) ] = b . get ( 0 ) + b . get ( 1 ) ;
  }
  int ans = 0 ;
  /* C */
  int [ ] limit = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    limit [ i ] = ( i - b . size ( ) ) / b . get ( 1 ) ;
  }
  Arrays . sort ( limit ) ;
  if ( Arrays . binarySearch ( limit , height ) >= 0 ) {
    return ans ;
  }
  return ans ;
}
