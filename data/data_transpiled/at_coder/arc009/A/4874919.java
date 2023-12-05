public static int N = Integer . parseInt ( input ) {
  double num = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    num += a * b ;
  }
  return ( int ) ( num * 1.05 ) ;
}
