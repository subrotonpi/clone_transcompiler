[ ] a = new int [ 4 ] ;
for ( int i = 0 ;
i < 4 ;
i ++ ) {
  a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
int ans = 0 ;
for ( int i = 0 ;
i < a [ 0 ] + 1 ;
i ++ ) {
  for ( int j = 0 ;
  j < a [ 1 ] + 1 ;
  j ++ ) {
    for ( int k = 0 ;
    k < a [ 2 ] + 1 ;
    k ++ ) {
      if ( 500 * i + 100 * j + 50 * k == a [ 3 ] ) {
        ans ++ ;
      }
    }
  }
}
System . out . println ( ans ) ;
}
