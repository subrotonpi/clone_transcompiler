static final double INF = 1e17 ;
int tests = Integer . parseInt ( input ) ;
final double INF = INF ;
{
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int q = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] horses = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    horses [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] [ ] g = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    horses [ i ] [ 0 ] = Integer . parseInt ( input . readLine ( ) ) ;
    horses [ i ] [ 1 ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  g [ g == - 1 ] [ 0 ] = INF ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        g [ i ] [ j ] = Math . min ( g [ i ] [ j ] , g [ i ] [ k ] + g [ k ] [ j ] ) ;
      }
    }
  }
  int [ ] [ ] t = new int [ n ] [ n ] + INF ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    t [ i ] [ 0 ] = g [ i ] [ 1 ] / horses [ i ] [ 1 ] ;
    t [ i ] [ 1 ] = g [ i ] [ 0 ] > horses [ i ] [ 0 ] ? INF : 0 ;
  }
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        t [ i ] [ j ] = Math . min ( t [ i ] [ j ] , t [ i ] [ k ] + t [ k ] [ j ] ) ;
      }
    }
  }
  for ( int [ ] query : Arrays . copyOfRange ( Arrays . copyOf ( t , q ) , t . length ) ) {
    System . out . print ( t [ query [ 0 ] - 1 ] [ query [ 1 ] - 1 ] ) ;
  }
  System . out . println ( ) ;
  for (