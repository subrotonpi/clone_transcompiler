public static void main ( String input ) {
  int n = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int k = Integer . parseInt ( input ) ;
  int ans = k ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    ans = ans * ( k - 1 ) ;
  }
  System . out . println ( ans ) ;
}
