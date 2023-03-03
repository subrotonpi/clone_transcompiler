@ Sys public static int [ ] [ ] cal ( ) {
  setRecursionLimit ( 10000000 ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > [ ] C = new ArrayList [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    C [ Integer . parseInt ( input ( ) ) - 1 ] [ i ] = i ;
  }
  return C ;
}
