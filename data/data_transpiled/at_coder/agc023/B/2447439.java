public static void check ( String [ ] [ ] a ) {
  int n = Integer . parseInt ( input ) ;
  String [ ] s = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = input . substring ( i , i + 1 ) ;
  }
  Arrays . sort ( s ) ;
  /* check the array */
  boolean flag = true ;
  int n = a . length ;
  int i = 0 , jStart = 1 ;
  while ( flag ) {
    if ( i == n - 1 ) break ;
    for ( int j = jStart ;
    j < n ;
    j ++ ) {
      if ( a [ i ] [ j ] != a [ j ] [ i ] ) {
        flag = false ;
      }
    }
    i ++ ;
    jStart ++ ;
  }
}
