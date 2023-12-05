public static int gcd ( int a , int b ) {
  a = Math . max ( a , b ) ;
  b = Math . min ( a , b ) ;
  while ( 0 < b ) {
    a = b ;
    b = a % b ;
  }
  return a ;
  /*solve the n and m numbers */
  Map < Integer , Integer > r = new HashMap < Integer , Integer > ( ) ;
  Map < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
  for ( int ai = 0 ;
  ai < a ;
  ai ++ ) {
    Map < Integer , Integer > nd = new HashMap < Integer , Integer > ( ) ;
    nd . put ( ai , 1 ) ;
    for ( int g = 0 ;
    g < map . size ( ) ;
    g ++ ) {
      int c = map . get ( g ) ;
      int ng = gcd ( g , ai ) ;
      if ( nd . containsKey ( ng ) ) {
        nd . put ( ng , c ) ;
      }
      else {
        nd . put ( ng , c ) ;
      }
    }
    map . clear ( ) ;
    for ( int g = 0 ;
    g < map . size ( ) ;
    g ++ ) {
      if ( r . containsKey ( g ) ) {
        r . put ( g , map . get ( g ) ) ;
      }
      else {
        r . put ( g , map . get ( g ) ) ;
      }
    }
  }
  for ( int xj : x ) {
    if ( r . containsKey ( xj ) ) {
      System . out . println ( r . get ( xj ) ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  /*main program*/
  int n = input . nextInt ( ) ;
  int m = input . nextInt ( ) ;
  n = Integer . parseInt ( n ) ;
  m = Integer . parseInt ( m ) ;
  a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ai = input . nextInt ( ) ;
    ai = Integer . parseInt ( ai ) ;
    a [ i ] = ai ;
  }
  int x [ ] = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int xj = input . nextInt ( ) ;
    xj = Integer . parseInt ( xj ) ;
    x [ i ] = xj ;
  }
  solve ( n , m , a , x ) ;
  if ( getClass ( ) . equals ( "java.util.Scanner" )