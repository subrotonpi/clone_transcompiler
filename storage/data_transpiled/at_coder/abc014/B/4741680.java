, n = Integer . MAX_VALUE ) ;
int [ ] a = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  a [ i ] = i ;
}
int ans = 0 ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  if ( x % 2 == 1 ) ans += a [ i ] ;
  x = x / 2 ;
}
System . out . println ( ans ) ;
}
