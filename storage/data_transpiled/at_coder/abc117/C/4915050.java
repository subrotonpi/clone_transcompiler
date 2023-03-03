public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < Integer > A = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  Collections . sort ( A ) ;
  if ( N >= M ) {
    System . out . println ( 0 ) ;
  }
  else {
    List < Integer > tmp = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < M - 1 ;
    i ++ ) {
      tmp . add ( A . get ( i + 1 ) - A . get ( i ) ) ;
    }
    Collections . sort ( tmp , Collections . reverseOrder ( ) ) ;
    int interval = 0 ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      if ( i + 1 == M - 1 ) {
        break ;
      }
      interval += tmp . get ( i ) ;
    }
    System . out . println ( sum ( tmp ) - interval ) ;
  }
}
