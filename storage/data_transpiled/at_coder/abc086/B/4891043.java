static final String input ( ) {
  String a , b ;
  a = Arrays . asList ( input . split ( " " ) ) . toString ( ) ;
  b = Arrays . asList ( input . split ( " " ) ) . toString ( ) ;
  n = ( int ) ( a + b ) ;
  m = ( int ) ( Math . sqrt ( n ) ) ;
  return m * m == n ? "Yes" : "No" ;
}
