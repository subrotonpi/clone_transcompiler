public static int B = Integer . parseInt ( input ) {
  int T = Integer . parseInt ( input . readLine ( ) ) ;
  int A = Integer . parseInt ( input . readLine ( ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int i = 9999 ;
  int j = 1 ;
  for ( int ids = 0 ;
  ids < N ;
  ids ++ ) {
    int k = N ;
    if ( Math . abs ( A - ( T - k * 0.006 ) ) < i ) {
      i = Math . abs ( A - ( T - k * 0.006 ) ) ;
      j = ids ;
    }
  }
  System . out . println ( j + 1 ) ;
  return j ;
}
