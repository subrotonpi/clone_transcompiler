public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > t = new ArrayList < > ( map . get ( Integer . parseInt ( input ) ) ) ;
  t . sort ( ) ;
  int sm = Integer . parseInt ( input ) ;
  int ans = 0 ;
  for ( int i : t ) {
    sm -= i ;
    ans ++ ;
    if ( i > sm * 2 ) break ;
  }
  System . out . println ( ans ) ;
}
