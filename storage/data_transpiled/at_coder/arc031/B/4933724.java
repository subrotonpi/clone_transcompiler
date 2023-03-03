static final char [ ] [ ] [ ] field = new char [ 10 ] [ 10 ] ;
for ( int i = 0 ;
i < 10 ;
i ++ ) field [ i ] = new char [ 10 ] [ 10 ] ;
for ( int i = 0 ;
i < 10 ;
i ++ ) field [ i ] [ 0 ] = input . charAt ( i ) ;
char [ ] [ ] [ ] field2 = new char [ 4 ] [ 10 ] ;
Arrays . fill ( field2 , 'x' ) ;
Arrays . fill ( field2 , 'y' ) ;
/*dfs[0][0] = 'x' */
for ( int i = 0 ;
i < 4 ;
i ++ ) {
  for ( int j = 0 ;
  j < 10 ;
  j ++ ) {
    field2 [ i ] [ j ] = 'o' ;
  }
}
System . out . println ( "NO" ) ;
}
