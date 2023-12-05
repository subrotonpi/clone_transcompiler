static final int [ ] [ ] getEdges ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Edge >> edges = new ArrayList < > ( N + 1 ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    edges . get ( a ) . add ( new Edge ( b , c ) ) ;
    edges . get ( b ) . add ( new Edge ( a , c ) ) ;
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int INF = 10 * 9 * N ;
  int [ ] distance = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    distance [ i ] = INF ;
  }
  distance [ K ] = 0 ;
  Set < Integer > settled = new HashSet < > ( ) ;
  List < Edge > h = new ArrayList < > ( ) ;
  h . add ( new Edge ( 0 , K ) ) ;
  while ( h . size ( ) > 0 ) {
    int d = heapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheap @ @