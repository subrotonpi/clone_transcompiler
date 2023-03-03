public static int N = Integer . parseInt ( input ) {
  double g = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    g += a * b ;
  }
  return ( int ) ( g * 1.05 ) ;
}
