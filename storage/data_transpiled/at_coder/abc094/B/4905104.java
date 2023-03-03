public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int X = Integer . parseInt ( input ) ;
  int cnt = 0 ;
  int min = 0 ;
  int cnt_2 = 0 ;
  LinkedList < Integer > lists = new LinkedList < Integer > ( ) ;
  for ( int i = X ;
  i <= N ;
  i ++ ) {
    for ( int j = 0 ;
    j < A . length ;
    j ++ ) {
      if ( i == 0 || i == N || i == X ) continue ;
      else if ( i == A . get ( j ) ) cnt ++ ;
    }
  }
  for ( int m = X ;
  m >= 0 ;
  m -- ) {
    for ( int n = 0 ;
    n < A . length ;
    n ++ ) {
      if ( m == 0 || m == N || m == X ) continue ;
      else if ( m == A . get ( n ) ) cnt_2 ++ ;
    }
  }
  if ( cnt > cnt_2 ) min = cnt_2 ;
  else if ( cnt_2 > cnt ) min = cnt ;
  System . out . println ( min ) ;
}
