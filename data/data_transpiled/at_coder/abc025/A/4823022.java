public static void input ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > l = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < S . length ;
    j ++ ) {
      l . add ( i + j ) ;
    }
  }
  System . out . println ( l . get ( N - 1 ) ) ;
}
