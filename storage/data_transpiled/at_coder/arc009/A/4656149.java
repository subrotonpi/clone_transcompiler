public static int N = Integer . parseInt ( input ) {
  double sum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    sum += a * b ;
  }
  return ( int ) ( sum * 1.05 ) ;
}
