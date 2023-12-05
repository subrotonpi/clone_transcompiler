public static int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] a ;
int n = Integer . parseInt ( input [ 0 ] [ 0 ] ) , c = Integer . parseInt ( input [ 1 ] [ 0 ] ) ;
int [ ] [ ] [ ] [ ] d = new int [ c ] [ c ] [ c ] ;
for ( int i = 0 ;
i < c ;
i ++ ) d [ i ] = new int [ c ] [ c ] [ c ] ;
int [ ] [ ] [ ] [ ] [ ] mat = new int [ n ] [ 3 ] [ 3 ] [ 3 ] ;
int [ ] [ ] [ ] [ ] cl = new int [ 3 ] [ 3 ] [ 3 ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  mat [ i ] = new int [ n ] [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    int k ;
    if ( ( i + j ) % 3 == 0 ) k = 0 ;
    else if ( ( i + j ) % 3 == 1 ) k = 1 ;
    else k = 2 ;
    else cl [ k ] [ 0 ] = mat [ i ] [ j ] ;
  }
}
int [ ] [ ] [ ] q = new int [ c ] [ c ] [ 3 ] ;
for ( int i = 0 ;
i < c ;
i ++ ) for ( int j = 0 ;
j < 3 ;
j ++ ) for ( int k = 0 ;
k < cl [ j ] [ 0 ] ;
k ++ ) q [ j ] [ i ] += d [ k - 1 ] [ i ] ;
int mi = 10 * 9 ;
for ( int i = 0 ;
i < c ;
i ++ ) {
  for ( int j = 0 ;
  j < c ;
  j ++ ) for ( int k = 0 ;
  k < c ;
  k ++ ) {
    if ( i != j && j != k && k != i ) {
      int s = q [ 0 ] [ i ] + q [ 1 ] [ j ] + q [ 2 ] [ k ] ;
      if ( s < mi ) mi = s ;
    }
  }
}
System . out . println ( mi ) ;
return q ;
}
