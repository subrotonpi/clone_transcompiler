public static void print ( int N , int L ) {
  int s = Integer . parseInt ( input ( ) . split ( " " ) ) ;
  s = Arrays . asList ( s ) ;
  Arrays . sort ( s ) ;
  print ( ( s * s ) , "" ) ;
}
