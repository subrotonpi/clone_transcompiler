public static List < Integer > asList ( ) {
  return Lists . newArrayList ( ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = asList ( ) ;
  Arrays . sort ( a ) ;
  int x = a [ n - 1 ] ;
  int xx = x / 2 ;
  int y = 0 ;
  double s = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( Math . abs ( xx - a [ i ] ) < s ) {
      s = Math . abs ( xx - a [ i ] ) ;
      y = a [ i ] ;
    }
  }
  return Arrays . asList ( ) ;
}
