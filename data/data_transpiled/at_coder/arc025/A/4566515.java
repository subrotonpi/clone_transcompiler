public static void print ( int c ) {
  l = list ( map ( input , "" ) ) ;
  r = list ( map ( input , "" ) ) ;
  c = 0 ;
  for ( int i = 0 ;
  i < 7 ;
  i ++ ) {
    c += max ( l [ i ] , r [ i ] ) ;
  }
  System . out . println ( c ) ;
}
