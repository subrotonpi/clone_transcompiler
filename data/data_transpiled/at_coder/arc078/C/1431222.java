public static int binsearch ( int l , int r , Predicate < Integer > pred ) {
  assert l < r ;
  l -- ;
  while ( r - l > 1 ) {
    int m = ( l + r ) / 2 ;
    if ( pred . test ( m ) ) {
      r = m ;
    }
    else {
      l = m ;
    }
  }
  final int n = r ;
  final Predicate < Integer > pred = new Predicate < Integer > ( ) {
    @ Override public boolean apply ( Integer n ) {
      assert 1 <= n && n <= 10 * 18 ;
      System . out . println ( "?" + n ) ;
      System . out . flush ( ) ;
      return input . equals ( "Y" ) ;
    }
  }
  ;
  /* solve */
  String s = "" ;
  s += Integer . toString ( binsearch ( 1 , 9 + 1 , c -> ! pred . test ( Integer . toString ( s + Integer . toString ( c ) ) ) ) - 1 ) ;
  if ( s . equals ( "0" ) ) {
    return 1 ;
  }
  else {
    return 0 ;
  }
}
