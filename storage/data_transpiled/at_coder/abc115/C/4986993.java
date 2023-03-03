public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] trees = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    trees [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( trees ) ;
  int ans = 10 * 9 ;
  for ( int i = 0 ;
  i < n - k + 1 ;
  i ++ ) {
    int diff = trees [ i + k - 1 ] - trees [ i ] ;
    if ( diff < ans ) {
      ans = diff ;
    }
  }
  System . out . println ( ans ) ;
}
