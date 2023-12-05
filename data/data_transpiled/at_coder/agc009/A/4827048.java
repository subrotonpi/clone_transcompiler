public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int k = Integer . parseInt ( input . readLine ( ) ) ;
    int l = Integer . parseInt ( input . readLine ( ) ) ;
    a [ i ] = k ;
    b [ i ] = l ;
  }
  long s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int j = n - 1 - i ;
    a [ j ] += s ;
    if ( a [ j ] % b [ j ] == 0 ) continue ;
    s += ( a [ j ] / b [ j ] + 1 ) * b [ j ] - a [ j ] ;
  }
  System . out . println ( s ) ;
}
