public static int N = Integer . parseInt ( input ) {
  int N = input . nextInt ( ) ;
  int a , b ;
  while ( ( b = input . nextInt ( ) ) > 0 ) {
    a = b ;
    b = a % b ;
  }
  return a ;
}
