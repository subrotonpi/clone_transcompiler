public static void print ( int n ) {
  int [ ] lis = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lis [ i ] = new TreeSet ( ) ;
  for ( int i = 0 ;
  i < lis . length ;
  i ++ ) lis [ i ] = lis [ i ] ;
}
