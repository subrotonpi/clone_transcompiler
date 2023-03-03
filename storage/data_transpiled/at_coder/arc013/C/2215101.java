public static int N = Integer . parseInt ( input ) {
  int [ ] Touhu = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int X = Integer . parseInt ( input . readLine ( ) ) ;
    int Y = Integer . parseInt ( input . readLine ( ) ) ;
    int Z = Integer . parseInt ( input . readLine ( ) ) ;
    int M = Integer . parseInt ( input . readLine ( ) ) ;
    int [ ] x = new int [ M ] ;
    int [ ] y = new int [ M ] ;
    int [ ] z = new int [ M ] ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      x [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
      y [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
      z [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
    Touhu [ i ] += min ( x ) ;
    Touhu [ i ] += min ( y ) ;
    Touhu [ i ] += min ( z ) ;
  }
  return 0 ;
}
