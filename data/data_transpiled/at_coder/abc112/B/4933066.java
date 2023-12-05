public static void main ( String input , int n , int tLimit ) {
  int [ ] cts = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cts [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  int min_c = 10000 ;
  for ( int c = 0 ;
  c < cts . length ;
  c ++ ) {
    int t = cts [ c ] ;
    if ( t <= tLimit && c < min_c ) {
      min_c = c ;
    }
  }
  if ( min_c == 10000 ) {
    System . out . println ( "TLE" ) ;
  }
  else {
    System . out . println ( min_c ) ;
  }
}
