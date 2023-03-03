@ SafeVarargs public static void main ( List < Integer > ... args ) throws IOException {
  String input = new Scanner ( System . in ) . nextLine ( ) ;
  int n = Integer . parseInt ( input ) ;
  int [ ] [ ] e = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    e [ a - 1 ] [ b ] = b - 1 ;
    e [ b - 1 ] [ a ] = a - 1 ;
  }
  int [ ] f = new int [ n ] ;
  int [ ] v = new int [ 1 ] ;
  v [ 0 ] = 1 ;
  v [ 0 ] = ~ - n ;
  Deque < Integer > q = new ArrayDeque < > ( ) ;
  q . add ( new Integer ( 0 ) ) ;
  while ( q . size ( ) > 0 ) {
    int t = q . pop ( ) ;
    int c = q . pop ( ) ;
    v [ t ] = 1 ;
    f [ t ] = c ;
    for ( int i : e [ t ] ) {
      if ( ! v [ i ] ) q . add ( new Integer ( i ) ) ;
    }
  }
  int [ ] s = new int [ n ] ;
  v = new int [ ~ - n + 1 ] ;
  q = new ArrayDeque < > ( ) ;
  q . add ( new Integer ( n - 1 ) ) ;
  while ( q . size ( ) > 0 ) {
    int t = q . pop ( ) ;
    int c = q . pop ( ) ;
    v [ t ] = 1 ;
    s [ t ] = c ;
    for ( int i : e [ t ] ) {
      if ( ! v [ i ] ) q . add ( new Integer ( i ) ) ;
    }
  }
  int a = 0 ;
  int b = 0 ;
  for ( int i = 0 , j = 0 ;
  i < f . length ;
  i ++ ) {
    if ( f [ i ] <= s [ j ] ) a ++ ;
    else b ++ ;
  }
  if ( a > b ) System . out . println ( "Fennec" ) ;
  else System . out . println ( "Snuke" ) ;
}
