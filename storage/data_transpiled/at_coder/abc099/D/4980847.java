public static int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] a ;
int N = Integer . parseInt ( input [ 0 ] [ 0 ] ) , C = Integer . parseInt ( input [ 1 ] [ 0 ] ) ;
int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] = a ;
int [ ] [ ] [ ] [ ] color = new int [ 3 ] [ 3 ] [ 3 ] [ 3 ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  String [ ] [ ] c = input . split ( " " ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    color [ ( i + j ) % 3 ] [ Integer . parseInt ( c [ j ] ) - 1 ] ++ ;
  }
}
int [ ] [ ] [ ] sumcolor = new int [ 3 ] [ 3 ] [ 3 ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  for ( int j = 0 ;
  j < C ;
  j ++ ) {
    for ( int c = 0 ;
    c < C ;
    c ++ ) {
      sumcolor [ i ] [ j ] += color [ i ] [ c ] * data [ c ] [ j ] ;
    }
  }
}
int answer = 10 * 18 ;
for ( int i = 0 ;
i < C ;
i ++ ) {
  for ( int j = 0 ;
  j < C ;
  j ++ ) {
    for ( int k = 0 ;
    k < C ;
    k ++ ) {
      if ( i != j && i != k && j != k ) {
        answer = Math . min ( answer , sumcolor [ 0 ] [ i ] + sumcolor [ 1 ] [ j ] + sumcolor [ 2 ] [ k ] ) ;
      }
    }
  }
}
System . out . println ( answer ) ;
return color ;
}
