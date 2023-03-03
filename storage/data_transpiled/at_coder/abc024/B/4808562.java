public static int N ( int T ) {
  int s = 0 ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( b - a < T ) s += b - a ;
    else s += T ;
    a = b ;
  }
  s += T ;
  return s ;
}
