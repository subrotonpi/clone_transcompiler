public static int R = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Point > consider = new ArrayList < Point > ( ) ;
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
      consider . add ( new Point ( i , dist ( x1 , y1 ) ) ) ;
      consider . add ( new Point ( i , dist ( x2 , y2 ) ) ) ;
    }
  }
  ArrayList < Point > l = new ArrayList < Point > ( ) ;
  Collections . sort ( consider , new Comparator < Point > ( ) {
    public int compare ( Point p , Point p ) {
      if ( p . y == p . y ) {
        return p . x ;
      }
      else if ( p . x == l . get ( l . size ( ) - 1 ) ) {
        l . remove ( l . size ( ) - 1 ) ;
      }
      else {
        l . add ( p . x ) ;
      }
      return p . y ;
    }
  }
  ) ;
  for ( Point c : consider ) {
    if ( l . size ( ) == 0 ) {
      l . add ( c . x ) ;
      continue ;
    }
    else if ( c . x == l . get ( l . size ( ) - 1 ) ) {
      l . remove ( l . size ( ) - 1 ) ;
    }
    else {
      l . add ( c . x ) ;
    }
  }
  if ( l . size ( ) == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "