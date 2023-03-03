public static String toBinaryString ( int N ) {
  int base = 1 ;
  StringBuilder bin = new StringBuilder ( ) ;
  int mai = - 1 ;
  while ( ( n != 0 ) && ( mai < base ) ) {
    if ( n % 2 == 0 ) {
      bin . append ( '0' ) ;
    }
    else {
      bin . append ( '1' ) ;
      n = n + mai ;
    }
    mai *= - 1 ;
  }
  return bin . toString ( ) ;
}
