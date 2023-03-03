public static int [ ] d ( ) {
  int [ ] d = new int [ 6 ] ;
  for ( int i = 0 ;
  i < d . length ;
  i ++ ) {
    double n = Double . parseDouble ( input . nextLine ( ) ) ;
    double m = Double . parseDouble ( input . nextLine ( ) ) ;
    if ( n >= 35 ) d [ i ] ++ ;
  }
  return d ;
}
