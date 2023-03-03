@ Sys public static String solve ( ) {
  int x , y ;
  int z = Integer . parseInt ( stdin . readLine ( ) ) ;
  z = Math . abs ( x ) + Math . abs ( y ) ;
  int t = 0 ;
  for ( int i : xrange ( 3000 ) ) {
    t = t + i ;
    if ( t % 2 == z % 2 && t >= z ) break ;
  }
  char [ ] ans = new char [ n ] ;
  IntFunction f = a -> Math . abs ( a . x ) + Math . abs ( a . y ) ;
  String w = "WESN" ;
  int n = 0 ;
  for ( int j : xrange ( i , 0 , - 1 ) ) {
    IntTuple [ ] c = {
      new IntTuple ( x + j , y ) , new IntTuple ( x - j , y ) , new IntTuple ( x , y + j ) , new IntTuple ( x , y - j ) }
      ;
      int k = Math . min ( Integer . MAX_VALUE , c . length ) ;
      for ( n = xrange ( 4 ) ;
      n < n ;
      n ++ ) {
        if ( f . apply ( c [ n ] ) == k ) break ;
      }
      x = c [ n ] . x ;
      y = c [ n ] . y ;
      ans [ n ] = w . charAt ( n ) ;
    }
    return new String ( new StringBuilder ( ans ) ) ;
  }
  