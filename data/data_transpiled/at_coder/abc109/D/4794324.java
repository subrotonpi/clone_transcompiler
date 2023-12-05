public static int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] a = new int [ H ] [ W ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] ;
for ( int i = 0 ;
i < H ;
i ++ ) {
  a [ i ] = new int [ H ] [ ] [ ] [ ] [ ] ;
  for ( int j = 0 ;
  j < W ;
  j ++ ) {
    a [ i ] [ j ] = new int [ W ] [ ] [ ] ;
    for ( int k = 0 ;
    k < H ;
    k ++ ) {
      a [ i ] [ j ] [ k ] = Integer . parseInt ( input [ i ] [ k ] ) ;
    }
  }
}
int [ ] [ ] [ ] oneStroke = new int [ H ] [ W ] [ ] ;
for ( int i = 0 ;
i < H ;
i ++ ) {
  for ( int j = 0 ;
  j < W ;
  j ++ ) {
    if ( i % 2 == 0 ) {
      oneStroke [ i ] [ j ] = i ;
    }
    else {
      oneStroke [ i ] [ j ] = i ;
      oneStroke [ i ] [ j ] = W - j - 1 ;
    }
  }
}
int [ ] [ ] [ ] list = new int [ N ] [ ] [ ] [ ] ;
int N = 0 ;
for ( int i = 0 ;
i < H * W - 1 ;
i ++ ) {
  if ( a [ oneStroke [ i ] [ 0 ] ] [ oneStroke [ i ] [ 1 ] ] % 2 != 0 ) {
    list [ N ] [ i ] = oneStroke [ i ] [ 0 ] + 1 ;
    N ++ ;
    a [ oneStroke [ i ] [ 0 ] ] [ oneStroke [ i ] [ 1 ] ] ++ ;
  }
}
System . out . println ( N ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  System . out . println ( list [ i ] [ 0 ] [ 0 ] + " " + list [ i ] [ 1 ] + " " + list [ i ] [ 2 ] + " " + list [ i ] [ 3 ] ) ;
}
return list ;
}
