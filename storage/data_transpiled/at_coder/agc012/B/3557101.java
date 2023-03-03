static void f ( int n , int m ) {
  int [ ] [ ] x = new int [ n ] [ m ] , y = new int [ n ] [ m ] , dp = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = ( Integer . parseInt ( input . readLine ( ) ) - 1 ) ;
    int b = ( Integer . parseInt ( input . readLine ( ) ) - 1 ) ;
    x [ a ] [ b ] = b ;
    x [ b ] [ a ] = a ;
  }
  int q = Integer . parseInt ( input . readLine ( ) ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int v = dp [ i ] [ 0 ] ;
  }
}
