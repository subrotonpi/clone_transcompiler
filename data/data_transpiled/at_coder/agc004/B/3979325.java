, N = Integer . MAX_VALUE , x = Integer . MAX_VALUE ) ;
int [ ] A = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  A [ i ] = Integer . MAX_VALUE ;
}
ans = Integer . MAX_VALUE ;
for ( int k = 1 ;
k <= N ;
k ++ ) {
  A = Arrays . copyOf ( A , A . length + 1 ) ;
  ans = Math . min ( ans , x * k + sum ( A ) ) ;
}
System . out . println ( ans ) ;
}
