public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  long s = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    s += ( 10000 * ( i + 1 ) ) * ( 1 / N ) ;
  }
  return ( int ) s ;
}
