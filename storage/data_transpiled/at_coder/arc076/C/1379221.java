private static int ri ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
  /* rli */
  LinkedList < Integer > rls = new LinkedList < Integer > ( ) ;
  /* pli */
  String a = "" ;
  int R = rli . get ( ) ;
  int C = rli . get ( ) ;
  int N = rls . get ( ) ;
  int [ ] [ ] lis = new int [ N ] [ 2 ] ;
  int idx = 0 ;
  int i = 0 ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    int x1 = rli . get ( ) ;
    int y1 = rli . get ( ) ;
    int x2 = rli . get ( ) ;
    int y2 = rli . get ( ) ;
    if ( ( ( x1 % R == 0 || y1 % C == 0 ) && ( x2 % R == 0 || y2 % C == 0 ) ) ) {
      i ++ ;
      for ( ;
      ;
      ) {
        if ( ( y1 == 0 ) && ( x1 == R ) ) lis [ idx ++ ] [ i ] = x1 ;
        else if ( ( x1 == R ) && ( y1 == C ) ) lis [ idx ++ ] [ i ] = R + y1 ;
        else if ( ( y1 == C ) && ( x2 == C ) ) lis [ idx ++ ] [ i ] = 2 * R + C - x1 ;
        else if ( ( x1 == 0 ) && ( x2 == 0 ) ) lis [ idx ++ ] [ i ] = 2 * R + 2 * C - y1 ;
        x1 = x2 ;
        y1 = y2 ;
      }
    }
  }
  Arrays . sort ( lis ) ;
  Stack < Integer > stack = new Stack < Integer > ( ) ;
  boolean [ ] exist = new boolean [ 2 * i ] ;
  boolean ans = true ;
  for ( int k = 0 ;
  k < 2 * i ;
  k ++ ) {
    if ( ( exist [ lis [ k ] [ 1 ] ] ) ) {
      if ( ( lis [ k ] [ 1 ] != stack . pop ( ) ) ) {
        ans = false ;
        break ;
      }
      exist [ lis [ k ] [ 1 ] ] = false ;
    }
    else {
      stack . push ( lis [ k ] [ 1 ] ) ;
      exist [ lis [ k ] [ 1 ] ] = true ;
    }
  }
  if ( ( ans ) && ( i == 2 * i ) ) System . out . println ( "YES" ) ;
  else System . out . println ( "