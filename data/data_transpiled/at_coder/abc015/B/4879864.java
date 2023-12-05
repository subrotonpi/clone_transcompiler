static final int [ ] getSums ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = sum ( a ) ;
  int num = n - a . length ;
  System . out . println ( Math . ceil ( s / num ) ) ;
}
