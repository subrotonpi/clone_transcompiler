static final int gcd ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = a / ( fractions . gcd ( a , b ) ) ;
  int y = b / ( fractions . gcd ( a , b ) ) ;
  return x + y ;
}
