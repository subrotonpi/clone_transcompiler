public static int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] a ;
int n = Integer . parseInt ( input [ 0 ] [ 0 ] ) ;
int [ ] [ ] [ ] [ ] [ ] [ ] t = new int [ 111111 ] [ 3 ] [ 2 ] [ 3 ] [ 3 ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  r [ i ] = Integer . parseInt ( input [ 0 ] [ 0 ] ) ;
  h [ i ] = Integer . parseInt ( input [ 1 ] [ 0 ] ) ;
  h [ i ] -- ;
  t [ h [ i ] ] [ r [ i ] ] ++ ;
}
for ( int i = 0 ;
i < 100000 ;
i ++ ) {
  for ( int j = 0 ;
  j < 3 ;
  j ++ ) {
    t [ j ] [ i + 1 ] += t [ j ] [ i ] ;
  }
}
for ( int i = 0 ;
i < n ;
i ++ ) {
  int w = ( h [ i ] + 1 ) % 3 , l = ( h [ i ] + 2 ) % 3 ;
  int x = t [ 0 ] [ r [ i ] - 1 ] + t [ 1 ] [ r [ i ] - 1 ] + t [ 2 ] [ r [ i ] - 1 ] ;
  int y = n - ( t [ 0 ] [ r [ i ] ] + t [ 1 ] [ r [ i ] ] + t [ 2 ] [ r [ i ] ] ) ;
  x += t [ w ] [ r [ i ] ] - t [ w ] [ r [ i ] - 1 ] ;
  y += t [ l ] [ r [ i ] ] - t [ l ] [ r [ i ] - 1 ] ;
  System . out . println ( x + " " + y + " " + ( n - x - y - 1 ) ) ;
}
return t ;
}
