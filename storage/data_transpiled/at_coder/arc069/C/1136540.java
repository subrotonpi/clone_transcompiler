public static int [ ] readln ( ) throws IOException {
  java . util . List < Integer > res = new java . util . ArrayList < Integer > ( ) ;
  for ( String s : input . split ( "\\s+" ) ) {
    res . add ( Integer . parseInt ( s ) ) ;
  }
  return res . toArray ( new Integer [ 0 ] ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = readln ( ) ;
  int [ ] [ ] c = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) c [ i ] = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) c [ i ] [ 0 ] = - a [ i ] ;
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) ans [ i ] = 0 ;
  int front = c [ 0 ] [ 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    ans [ front ] = ans [ front ] + i * ( c [ i ] [ 0 ] - c [ i - 1 ] [ 0 ] ) ;
    if ( front > c [ i ] [ 1 ] ) front = c [ i ] [ 1 ] ;
  }
  ans [ front ] = ans [ front ] + n * ( - c [ n - 1 ] [ 0 ] ) ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  return ans ;
}
