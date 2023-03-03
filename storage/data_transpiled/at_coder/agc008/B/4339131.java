static final int [ ] getSorted ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int sm = Integer . parseInt ( a [ i ] ) ;
  int at = Integer . parseInt ( b [ i ] ) ;
  int ans = Math . max ( sm , 0 ) + at ;
  for ( int i = k ;
  i < n ;
  i ++ ) {
    sm += a [ i ] - a [ i - k ] ;
    at += b [ i - k ] - b [ i ] ;
    ans = Math . max ( Math . max ( 0 , sm ) + at , ans ) ;
  }
  System . out . println ( ans ) ;
}
