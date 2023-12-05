@ VisibleForTesting static void input ( ) {
  LinkedHashMap < Integer , Integer > G = new LinkedHashMap < > ( ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] color = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    G . put ( a , b ) ;
    G . put ( b , a ) ;
  }
  int Q = Integer . parseInt ( input . readLine ( ) ) ;
  List < Integer > list = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    list . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
  }
  Collections . reverse ( list ) ;
  int [ ] colorD = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < list . size ( ) ;
  i ++ ) {
    int v = list . get ( i ) ;
    int d = list . get ( i ) ;
    int c = list . get ( i ) ;
    if ( colorD [ v ] >= d ) {
    }
    Deque < Integer > deq = new LinkedList < > ( ) ;
    deq . add ( v ) ;
    if ( color [ v ] == 0 ) {
      color [ v ] = c ;
    }
    colorD [ v ] = d ;
    while ( deq . size ( ) > 0 ) {
      int s = deq . poll ( ) ;
      for ( int t : G . get ( s ) ) {
        if ( colorD [ t ] >= colorD [ s ] - 1 ) {
        }
        else {
          colorD [ t ] = colorD [ s ] - 1 ;
          if ( color [ t ] == 0 ) {
            color [ t ] = c ;
          }
          if ( colorD [ t ] > 0 ) {
            deq . add ( t ) ;
          }
        }
      }
    }
  }
  for ( int n = 1 ;
  n <= N ;
  n ++ ) {
    System . out . println ( color [ n ] ) ;
  }
}
