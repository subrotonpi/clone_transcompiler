public static void main ( String input ) {
  int n = Integer . parseInt ( input . split ( " " ) [ 0 ] ) , t = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  }
  int ans = t ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    ans += Math . min ( a [ i + 1 ] - a [ i ] , t ) ;
  }
  System . out . println ( ans ) ;
}
