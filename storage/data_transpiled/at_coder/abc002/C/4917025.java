;
a = list ( map . get ( ) ) ;
for ( int i = 0 ;
i < 2 ;
i ++ ) {
  a [ 2 + 2 * i ] -= a [ 0 ] ;
  a [ 2 + 2 * i + 1 ] -= a [ 1 ] ;
}
System . out . println ( abs ( a [ 2 ] * a [ 5 ] - a [ 3 ] * a [ 4 ] ) / 2 ) ;
}
