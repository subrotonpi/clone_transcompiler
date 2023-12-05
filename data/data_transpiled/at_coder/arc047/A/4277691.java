public static int N = Integer . parseInt ( input ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = String . valueOf ( input . nextLine ( ) ) ;
  int T = 1 ;
  int C = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . charAt ( i ) == '+' ) T ++ ;
    else if ( S . charAt ( i ) == '-' ) T -- ;
    if ( T > L ) {
      C ++ ;
      T = 1 ;
    }
  }
  System . out . println ( C ) ;
  return C ;
}
