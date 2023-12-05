public static void main ( String input ) {
  int n = Integer . parseInt ( input . substring ( 0 , input . length ( ) ) ) , m = Integer . parseInt ( input . substring ( input . length ( ) , input . length ( ) ) ) ;
  int [ ] v = new int [ n ] ;
  for ( ;
  ;
  ) exec ( "v[" + input . replace ( ' ' , '-1' ) + "]=1<<~-" ) ;
  int [ ] d = new int [ 1 << n ] ;
  for ( int i = 0 ;
  i < 1 << n ;
  i ++ ) d [ i ] = 1 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) if ( ( i & 1 << j ) + ( i & v [ j ] ) < 1 ) d [ i | 1 << j ] += d [ i ] ;
  System . out . println ( d [ d . length - 2 ] ) ;
}
