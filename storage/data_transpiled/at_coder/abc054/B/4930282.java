public static String print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  String [ ] A = new String [ n ] ;
  String [ ] B = new String [ m ] ;
  for ( int i = 0 ;
  i < n - m + 1 ;
  i ++ ) {
    A [ i ] = input . substring ( i , i + m ) ;
    B [ i ] = input . substring ( j , j + m ) ;
  }
  String ans = "No" ;
  boolean flag = false ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n - m + 1 ;
    j ++ ) {
      C [ j ] = A [ i + j ] ;
      if ( B . equals ( C ) ) {
        ans = "Yes" ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
