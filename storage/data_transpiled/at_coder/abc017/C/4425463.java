public static int [ ] input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] imos = new int [ m + 1 ] ;
  int t = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int l = Integer . parseInt ( input . readLine ( ) ) ;
    int r = Integer . parseInt ( input . readLine ( ) ) ;
    imos [ l - 1 ] += r ;
  }
  return imos ;
}
