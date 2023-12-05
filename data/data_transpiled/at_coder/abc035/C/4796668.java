public static void input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int Q = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] lr = new int [ Q ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < lr . length ;
  i ++ ) {
    lr [ i ] [ 0 ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] imos = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < lr . length ;
  i ++ ) {
    imos [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    imos [ i ] = 0 ;
  }
  Cnum [ i ] = 0 ;
  int tmp = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    tmp += imos [ i ] ;
    Cnum [ i ] = tmp ;
  }
}
