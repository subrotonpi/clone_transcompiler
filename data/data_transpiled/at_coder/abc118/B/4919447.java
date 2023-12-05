public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    for ( int j = 0 ;
    j < A . size ( ) ;
    j ++ ) {
      res += A . get ( i ) ;
    }
  }
  return res ;
}
