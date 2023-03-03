public static int calc ( int x , int y ) {
  if ( y == 0 ) {
    return x ;
  }
  else if ( x == r ) {
    return r + y ;
  }
  else if ( y == c ) {
    return r * 2 + c - x ;
  }
  else if ( x == 0 ) {
    return r * 2 + c * 2 - y ;
  }
  else {
    return - 1 ;
  }
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > pts = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
    int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
    int u = calc ( x1 , y1 ) ;
    int v = calc ( x2 , y2 ) ;
    if ( u >= 0 && v >= 0 ) {
      pts . add ( new Integer ( u ) ) ;
      pts . add ( new Integer ( v ) ) ;
    }
  }
  ArrayList < Integer > list = new ArrayList < > ( ) ;
  list . sort ( new Comparator < Integer > ( ) {
    public int compare ( Integer a , Integer b ) {
      return a - b ;
    }
  }
  ) ;
  Stack < Integer > stk = new Stack < > ( ) ;
  for ( int a = 0 ;
  a < list . size ( ) ;
  a ++ ) {
    int b = list . get ( a ) ;
    if ( stk . size ( ) == 0 || stk . peek ( ) != b ) {
      stk . push ( b ) ;
    }
    else {
      stk . pop ( ) ;
    }
  }
  if ( stk . size ( ) > 0 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  return 0 ;
}
