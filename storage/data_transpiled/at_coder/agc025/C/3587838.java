public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] L = new int [ n ] , R = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int l = ( Integer ) input . split ( " " ) [ 0 ] ;
    int r = ( Integer ) input . split ( " " ) [ 1 ] ;
    L [ i ] = l ;
    R [ i ] = r ;
  }
  Arrays . sort ( L ) ;
  Arrays . sort ( R ) , ans = 0 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    if ( L [ i ] > R [ i ] ) ans += L [ i ] - R [ i ] ;
    else break ;
  }
  System . out . println ( ans * 2 ) ;
}
