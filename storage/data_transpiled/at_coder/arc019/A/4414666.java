static int [ ] k ( ) {
  StringBuilder sb = new StringBuilder ( ) ;
  String p = new String ( input ) ;
  for ( int i = 0 ;
  i < p . length ( ) ;
  i ++ ) {
    if ( p . charAt ( i ) == 'O' || p . charAt ( i ) == 'D' ) sb . append ( '0' ) ;
    else if ( p . charAt ( i ) == 'I' ) sb . append ( '1' ) ;
  }
  return sb . toString ( ) ;
}
