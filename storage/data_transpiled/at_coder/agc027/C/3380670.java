static final String input = "Enter the edge list of integers in the graph. " ;
int N = Integer . parseInt ( input ) ;
int M = Integer . parseInt ( input ) ;
String s = input . substring ( 0 , N ) ;
int [ ] [ ] table = new int [ M ] [ 2 ] ;
for ( int i = 0 ;
i < M ;
i ++ ) {
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  table [ i ] = new int [ x - 1 ] ;
  table [ i ] [ x ] = new int [ y - 1 ] ;
}
int [ ] edge = new int [ 2 * N ] ;
int [ ] visit = new int [ 2 * N ] ;
for ( int i = 0 ;
i < 2 * N ;
i ++ ) {
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  if ( x == y ) {
    edge [ 2 * x ] [ x ] = 2 * x + 1 ;
    visit [ 2 * x + 1 ] ++ ;
    continue ;
  }
  if ( s . charAt ( x ) == s . charAt ( y ) ) {
    edge [ 2 * x ] [ x ] = 2 * y + 1 ;
    edge [ 2 * y ] [ x ] = 2 * x + 1 ;
    visit [ 2 * x + 1 ] ++ ;
    continue ;
  }
  edge [ 2 * x + 1 ] [ y ] = 2 * y ;
  edge [ 2 * y + 1 ] [ x ] = 2 * x + 1 ;
  visit [ 2 * x ] ++ ;
}
Set < Integer > S = new HashSet < Integer > ( ) ;
Queue < Integer > L = new LinkedList < Integer > ( ) ;
for ( int i = 0 ;
i < 2 * N ;
i ++ ) {
  if ( visit [ i ] == 0 ) {
    L . add ( i ) ;
  }
}
while ( L . size ( ) > 0 ) {
  int x = L . remove ( ) ;
  S . add ( x ) ;
  for ( int y : edge [ x ] ) {
    visit [ y ] -- ;
    if ( visit [ y ] == 0 ) {
      L . add ( y ) ;
    }
  }
}
if ( S . size ( ) != 2 * N ) {
  System . out . println ( "Yes" ) ;
}
else {
  System . out . println ( "No" ) ;
  