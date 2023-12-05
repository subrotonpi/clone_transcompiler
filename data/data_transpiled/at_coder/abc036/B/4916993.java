public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < List < Integer >> ma = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ma . add ( Collections . singletonList ( input ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    StringBuilder li = new StringBuilder ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      li . append ( ma . get ( n - j - 1 ) . get ( i ) ) ;
    }
    System . out . println ( li . toString ( ) ) ;
  }
}
