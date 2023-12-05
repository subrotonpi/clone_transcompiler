public static void input ( int n ) {
  int [ ] X = new int [ n ] , Y = new int [ n ] , C = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    X [ i ] = x ;
    Y [ i ] = y ;
    C [ i ] = c ;
  }
  {
    int le = - 10 * 5 , ri = 10 * 5 ;
    for ( int x = 0 ;
    x < X . length ;
    x ++ ) {
      int c = X [ x ] ;
      le = Math . max ( le , x - cost / c ) ;
      ri = Math . min ( ri , x + cost / c ) ;
    }
    if ( le > ri ) return ;
  }
}
