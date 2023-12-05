public static void input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] meat_time = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) meat_time [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] table1 = new int [ n ] ;
  int [ ] table2 = new int [ n ] ;
  for ( int i = 0 ;
  i < Math . round ( ( 1 << n ) / 2 ) ;
  i ++ ) {
    int one = 0 ;
    int two = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( i >> j ) & 1 ) one += meat_time [ j ] ;
      else two += meat_time [ j ] ;
    }
    table1 [ i ] = one ;
    table2 [ i ] = two ;
  }
  int tmp = 0 ;
  int abs_ = 100 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Math . abs ( table1 [ i ] - table2 [ i ] ) ;
    if ( a < abs_ ) {
      abs_ = a ;
      if ( i < j ) tmp = j ;
      else tmp = i ;
    }
  }
  System . out . println ( tmp ) ;
}
