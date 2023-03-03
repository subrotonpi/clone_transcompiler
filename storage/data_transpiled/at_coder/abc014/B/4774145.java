public static void main ( String n , String x ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  String x_bin = Integer . toBinaryString ( x ) ;
  int sum_price = 0 ;
  for ( int i = 0 ;
  i < x_bin . length ( ) ;
  i ++ ) {
    if ( x_bin . charAt ( i ) == '1' ) sum_price += a [ i ] ;
  }
  System . out . println ( sum_price ) ;
}
