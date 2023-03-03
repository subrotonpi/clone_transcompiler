public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( a % b == 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  else {
    int c = a / b + 1 ;
    System . out . println ( c * b - a ) ;
  }
}
