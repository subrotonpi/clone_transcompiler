public static int [ ] [ ] k = new int [ 100001 ] [ 100001 ] ;
int [ ] t = new int [ 100001 ] ;
int [ ] [ ] p = new int [ 100001 ] [ 100001 ] ;
int n = Integer . parseInt ( input ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  p [ i ] = new int [ r ] ;
  p [ i ] [ 0 ] = h ;
  t [ r ] ++ ;
  if ( h == 1 ) k [ r ] [ 0 ] ++ ;
  else if ( h == 2 ) k [ r ] [ 1 ] ++ ;
  else k [ r ] [ 2 ] ++ ;
}
@ SuppressWarnings ( "unchecked" ) final List < Integer > list = new ArrayList < > ( ) ;
list . add ( t ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  int s = list . get ( i ) ;
  int u = list . get ( i ) ;
  int a = list . get ( s - 1 ) ;
  int c = k [ s ] [ 0 ] ;
  int d = k [ s ] [ 1 ] ;
  int e = k [ s ] [ 2 ] ;
  if ( u == 1 ) {
    System . out . println ( a + d + " " + ( n - a - d - c ) + " " + ( c - 1 ) ) ;
  }
  else if ( u == 2 ) {
    System . out . println ( a + e + " " + ( n - a - e - d ) + " " + ( d - 1 ) ) ;
  }
  else {
    System . out . println ( a + c + " " + ( n - a - c - e ) + " " + ( e - 1 ) ) ;
  }
}
return k ;
}
