static String nextperm ( List < String > L ) {
  int l = L . size ( ) ;
  int max = 0 ;
  for ( int i : xrange ( 2 , l + 1 ) ) {
    if ( L . get ( L . size ( ) - i ) < L . get ( L . size ( ) - i + 1 ) ) {
      max = i ;
      break ;
    }
  }
  if ( max == 0 ) {
    return nextperm ( new StringBuilder ( "0" ) . append ( L ) . toString ( ) ) ;
  }
  for ( int j : xrange ( 1 , l + 1 ) ) {
    if ( L . get ( L . size ( ) - j ) > L . get ( L . size ( ) - max ) ) {
      break ;
    }
  }
  L . set ( L . size ( ) - max , L . get ( L . size ( ) - j ) ) ;
  max -- ;
  String a = L . get ( 0 ) , b = L . get ( L . size ( ) - max ) ;
  Collections . reverse ( b ) ;
  return a + b ;
}
int N = Integer . parseInt ( readLine ( ) ) ;
for ( int i : xrange ( 1 , N + 1 ) ) {
  List < String > list = new LinkedList < String > ( ) ;
  list . add ( readLine ( ) ) ;
  System . out . println ( "Case #" + i + ": " + nextperm ( list ) ) ;
}
