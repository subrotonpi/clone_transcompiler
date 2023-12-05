@ VisibleForTesting static int min ( int MOD ) {
  int lol = 1000 ;
  int [ ] [ ] ncr = new int [ lol ] [ lol ] ;
  for ( int i = 0 ;
  i < lol ;
  i ++ ) {
    ncr [ i ] [ 0 ] = 0 ;
    ncr [ i ] [ i ] = 1 ;
  }
  int probability = 1 ;
  for ( int i = 0 ;
  i < lol ;
  i ++ ) {
    ncr [ i ] [ 0 ] = 1 ;
    ncr [ i ] [ i ] = 1 ;
  }
  for ( int i = 2 ;
  i < lol ;
  i ++ ) {
    for ( int j = 1 ;
    j < i ;
    j ++ ) {
      ncr [ i ] [ j ] = ncr [ i - 1 ] [ j ] + ncr [ i - 1 ] [ j - 1 ] ;
    }
  }
  int probability = 1 ;
  for ( int i = 0 ;
  i < lol ;
  i ++ ) {
    int [ ] answers = new int [ n ] ;
    for ( int l = 0 ;
    l < n ;
    l ++ ) {
      answers [ l ] = ncr [ n ] [ l ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        answers [ l ] *= ncr [ n - l ] [ i ] ;
        answers [ l ] %= MOD ;
      }
    }
  }
  int min = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int testcase = 0 ;
  testcase < T ;
  testcase ++ ) {
    Map < String , Integer > parent = new HashMap < String , Integer > ( ) ;
    Map < String , Integer > children = new HashMap < String , Integer > ( ) ;
    Map < Integer , Integer > servers = new HashMap < Integer , Integer > ( ) ;
    Map < Integer , Integer > childrenservers = new HashMap < Integer , Integer > ( ) ;
    int M = Integer . parseInt ( scanner . nextLine ( ) ) ;
    Set < Integer > original = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      String string = scanner . nextLine ( ) ;
      original . add ( string ) ;
      while ( string . length ( ) > 0 ) {
        int next = string . substring ( 0 , string . length ( ) - 1 ) ;
        parent . put ( string , next ) ;
        children . put ( next , string ) ;
        string = next ;
      }
    }
    Queue < Integer > bfs = new LinkedList <