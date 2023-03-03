static final String getString ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  StringBuilder card = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    card . append ( i + 1 ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    buf = card . charAt ( i ) ;
  }
  return buf . toString ( ) ;
}
