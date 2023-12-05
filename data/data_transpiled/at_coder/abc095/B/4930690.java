public static void main ( String input ) {
  int n = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int x = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int m [ ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) m [ i ] = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int ans = m . length + ( x - Math . min ( m [ 0 ] , m [ 1 ] ) ) / Math . min ( m [ 1 ] , m [ 2 ] ) ;
  System . out . println ( ans ) ;
}
