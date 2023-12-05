public static void print ( int n ) {
  String [ ] points = new String [ n ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) points [ i ] = input . split ( " " ) ;
  Arrays . sort ( points ) ;
  double maxD = 0 ;
  final double d ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i ;
    j < n ;
    j ++ ) {
      final double deltax = ( int ) points [ i ] . charAt ( 0 ) - ( int ) points [ j ] . charAt ( 0 ) ;
      final double deltay = ( int ) points [ i ] . charAt ( 1 ) - ( int ) points [ j ] . charAt ( 1 ) ;
      d = Math . sqrt ( deltax * deltax + deltay * deltay ) ;
      if ( maxD < d ) maxD = d ;
    }
  }
  System . out . println ( maxD ) ;
}
