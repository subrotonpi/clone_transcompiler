public static int N = Integer . parseInt ( input ) {
  int Z = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( N == 1 ) {
    System . out . println ( Math . abs ( a [ 0 ] - W ) ) ;
  }
  else {
    int x = Math . abs ( a [ a . length - 2 ] - a [ a . length - 1 ] ) ;
    int y = Math . abs ( a [ a . length - 1 ] - W ) ;
    int ans = Math . max ( x , y ) ;
    System . out . println ( ans ) ;
  }
  return Z ;
}
