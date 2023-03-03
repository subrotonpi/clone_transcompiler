public static void print ( int n ) {
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l [ i ] = Integer . parseInt ( input ( ) ) ;
  int a = sum ( l ) ;
  System . out . println ( a ) ;
  System . out . println ( max ( max ( l ) * 2 - sum ( l ) , 0 ) ) ;
}
