, n = Integer . parseInt ( readLine ( ) ) , * a = map ( Integer :: parseInt , ( readLine ( ) ) ) ;
int [ ] dp = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) dp [ i ] = 0 ;
dp [ 1 ] = Math . abs ( a [ 0 ] - a [ 1 ] ) ;
for ( int i = 2 ;
i < n ;
i ++ ) {
  int x = Math . abs ( a [ i ] - a [ i - 2 ] ) + dp [ i - 2 ] ;
  int y = Math . abs ( a [ i ] - a [ i - 1 ] ) + dp [ i - 1 ] ;
  dp [ i ] = Math . min ( x , y ) ;
}
System . out . println ( dp [ dp . length - 1 ] ) ;
}
