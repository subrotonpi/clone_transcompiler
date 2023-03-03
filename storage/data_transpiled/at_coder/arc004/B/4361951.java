public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  System . out . println ( sum ( a ) ) ;
  System . out . println ( max ( 0 , a [ a . length - 1 ] - sum ( a , 0 , a . length - 1 ) ) ) ;
}
