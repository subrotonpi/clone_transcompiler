@ SafeVarargs public static void main ( String ... args ) throws IOException {
  String input = new Scanner ( System . in ) . nextLine ( ) ;
  int n = Integer . parseInt ( input ) ;
  List < List < Integer >> e = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    e . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    e . get ( a - 1 ) . add ( new Integer ( b - 1 ) ) ;
    e . get ( b - 1 ) . add ( new ArrayList < > ( ) ) ;
  }
  int q = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int [ ] d = new int [ n ] ;
  int [ ] f = new int [ n ] ;
  f [ k - 1 ] = 1 ;
  Deque < Integer > s = new ArrayDeque < > ( ) ;
  s . add ( new Integer ( k - 1 ) ) ;
  while ( s . size ( ) > 0 ) {
    int t = s . pop ( ) ;
    int c = s . pop ( ) ;
    f [ t ] = 1 ;
    d [ t ] = c ;
    for ( int i = 0 ;
    i < e . get ( t ) . size ( ) ;
    i ++ ) {
      if ( ! f [ i ] ) {
        s . add ( new Integer ( i ) ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    System . out . println ( d [ x - 1 ] + d [ y - 1 ] ) ;
  }
}
