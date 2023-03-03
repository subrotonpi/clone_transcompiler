public static double [ ] [ ] readInput ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < Integer >> l_r_s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l_r_s . add ( Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  int [ ] f = new int [ m + 2 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    f [ i ] += f [ i - 1 ] ;
  }
  return f ;
}
