public static int [ ] getm ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  m = new int [ 1000001 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    m [ a ] ++ ;
    if ( b < 1000000 ) m [ b + 1 ] -- ;
  }
  for ( int i = 1 ;
  i < 1000001 ;
  i ++ ) m [ i ] += m [ i - 1 ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < 1000001 ;
  i ++ ) ans = Math . max ( ans , m [ i ] ) ;
  return m ;
}
