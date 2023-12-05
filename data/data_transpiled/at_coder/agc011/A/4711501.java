public static int N = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > l = new ArrayList < > ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Collections . sort ( l ) ;
  l . add ( Double . parseDouble ( "INF" ) ) ;
  int len = l . size ( ) ;
  while ( len > 1 ) {
    int h = l . get ( len - 1 ) ;
    int i = h ;
    int j = 1 ;
    while ( len > 1 && j < C && h + K >= l . get ( len - 1 ) ) {
      i = l . get ( len - 1 ) ;
      j ++ ;
    }
    ans ++ ;
  }
  return ans ;
}
