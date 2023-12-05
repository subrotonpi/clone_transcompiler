@ GwtIncompatible ( "java.util.Scanner" ) public static double [ ] [ ] solve ( ) {
  int n = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int q = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  double [ ] v = new double [ 2 * ( 10 * 4 ) + 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int r = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int h = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    double num = ( r / h ) * ( r / h ) ;
    for ( int j = x + h ;
    j > x ;
    j -- ) v [ j ] += num * ( ( x + h - j + 1 ) * ( x + h - j ) * ( x + h - i ) * ( x + h - j ) * ( x + h - j ) ) ;
  }
  for ( int i = 0 ;
  i < 2 * ( 10 * 4 ) + 2 ;
  i ++ ) v [ i ] += v [ i - 1 ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int a = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int b = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    System . out . println ( ( v [ b ] - v [ a ] ) * Math . PI / 3 ) ;
  }
  return v ;
}
