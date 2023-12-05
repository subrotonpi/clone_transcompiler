public static void print ( int n ) {
  int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] a = new int [ n + 1 ] ;
  int [ ] b = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i == 0 ) continue ;
    a [ p [ i ] - 1 ] += i ;
    a [ n ] -= i ;
    b [ 0 ] += i ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ai = i + 1 ;
    int bi = n - i ;
    a [ i ] += ai ;
    b [ i ] += bi ;
  }
  System . out . println ( ( a [ 0 ] + b [ 0 ] ) ) ;
}
