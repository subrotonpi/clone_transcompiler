public static int R = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Point > points = new ArrayList < Point > ( ) ;
  /* Distance between 0 and R */
  if ( N == 0 ) {
    return R * 2 + C + ( C - N ) ;
  }
  if ( N == R ) {
    return R + N ;
  }
  if ( N == 0 ) {
    return N ;
  }
  if ( N == C ) {
    return R + C + ( R - N ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
    int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ( ( x1 == 0 || x1 == R ) || ( y1 == 0 || y1 == C ) ) && ( ( x2 == 0 || x2 == R ) || ( y2 == 0 || y2 == C ) ) ) {
      points . add ( new Point ( i + 1 , dist ( x1 , y1 ) ) ) ;
      points . add ( new Point ( i + 1 , dist ( x2 , y2 ) ) ) ;
    }
  }
  Collections . sort ( points , new Comparator < Point > ( ) {
    public int compare ( Point p , Point o1 ) {
      return p . y - p . y ;
    }
  }
  ) ;
  ArrayList < Point > l = new ArrayList < Point > ( ) ;
  for ( Point point : points ) {
    if ( l . size ( ) == 0 ) {
      l . add ( point . x ) ;
      continue ;
    }
    if ( point . x == l . get ( l . size ( ) - 1 ) ) {
      l . remove ( l . size ( ) - 1 ) ;
    }
    else {
      l . add ( point . x ) ;
    }
  }
  if ( l . size ( ) == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return N ;
}
