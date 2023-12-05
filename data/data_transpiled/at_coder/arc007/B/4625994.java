public static void main ( String input ) {
  int n = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int m = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  LinkedList < Integer > l = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    l . add ( i ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = l . indexOf ( Integer . parseInt ( input . substring ( 0 , a ) ) ) ;
    l . set ( 0 , l . get ( a ) ) ;
  }
  l . remove ( 0 ) ;
  for ( int i = 0 ;
  i < l . size ( ) ;
  i ++ ) {
    System . out . println ( l . get ( i ) ) ;
  }
}
