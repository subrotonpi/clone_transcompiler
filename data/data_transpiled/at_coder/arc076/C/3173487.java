public static void print ( int R , int C , int N ) {
  int [ ] [ ] UP = new int [ N ] [ ] , RIGHT = new int [ N ] , DOWN = new int [ N ] , LEFT = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
    int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( 0 < x1 < R && 0 < y1 < C ) continue ;
    if ( 0 < x2 < R && 0 < y2 < C ) continue ;
    if ( x1 == 0 ) UP [ i ] [ 0 ] = y1 ;
    else if ( x1 == R ) DOWN [ i ] [ 0 ] = y1 ;
    else if ( y1 == 0 ) LEFT [ i ] [ 0 ] = x1 ;
    else if ( y1 == C ) RIGHT [ i ] = x1 ;
    if ( x2 == 0 ) UP [ i ] [ 1 ] = y2 ;
    else if ( x2 == R ) DOWN [ i ] [ 1 ] = y2 ;
    else if ( y2 == 0 ) LEFT [ i ] [ 1 ] = x2 ;
    else if ( y2 == C ) RIGHT [ i ] = y2 ;
  }
  Arrays . sort ( UP , RIGHT , DOWN ) ;
  Arrays . sort ( DOWN , LEFT ) ;
  Arrays . sort ( LEFT , DOWN ) ;
  int [ ] Numbers = UP + RIGHT + DOWN + LEFT ;
  Stack < Integer > stack = new Stack < Integer > ( ) ;
  for ( int n = 0 , z = Numbers . length ;
  z < z ;
  z ++ ) {
    if ( stack . size ( ) > 0 && stack . peek ( ) == n ) stack . pop ( ) ;
    else stack . push ( n ) ;
  }
  System . out . println ( stack . size ( ) > 0 ? "NO" : "YES" ) ;
}
