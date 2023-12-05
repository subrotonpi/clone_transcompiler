public static void print ( int n ) {
  int [ ] x = new int [ 1000002 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    x [ l ] = x [ r ] + 1 ;
    x [ r ] = x [ r ] - 1 ;
  }
  for ( int i = 1 ;
  i < x . length ;
  i ++ ) {
    x [ i ] += x [ i - 1 ] ;
  }
  System . out . println ( max ( x ) ) ;
}
