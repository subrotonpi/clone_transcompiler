public static int [ ] [ ] [ ] [ ] [ ] [ ] a = map ( input . nextLine ( ) ) . split ( " " ) ;
int [ ] [ ] [ ] [ ] D = new int [ A ] [ B ] [ ] [ ] [ ] ;
for ( int i = 0 ;
i < A ;
i ++ ) {
  D [ i ] = new int [ A ] [ B ] [ ] [ ] ;
  for ( int j = 0 ;
  j < D [ i ] . length ;
  j ++ ) D [ i ] [ j ] = list ( input . nextLine ( ) ) ;
}
int N = 101 ;
int [ ] [ ] [ ] [ ] F = new int [ N ] [ N ] [ N ] [ ] ;
for ( int a = 0 ;
a < N ;
a ++ ) {
  for ( int b = 0 ;
  b < N ;
  b ++ ) {
    int res = 0 ;
    for ( int x = 0 ;
    x < A ;
    x ++ ) {
      for ( int y = 0 ;
      y < B ;
      y ++ ) {
        res = Math . max ( res , D [ x ] [ y ] - ( x + 1 ) * a - ( y + 1 ) * b ) ;
      }
    }
    F [ a ] [ b ] = res ;
  }
}
for ( int x = 0 ;
x < A ;
x ++ ) {
  for ( int y = 0 ;
  y < B ;
  y ++ ) {
    int v = 101 ;
    for ( int a = 0 ;
    a < N ;
    a ++ ) {
      for ( int b = 0 ;
      b < N ;
      b ++ ) {
        v = Math . min ( v , ( x + 1 ) * a + ( y + 1 ) * b ) ;
      }
    }
    if ( v != D [ x ] [ y ] [ x ] ) {
      System . out . println ( "Impossible" ) ;
      exit ( 0 ) ;
    }
  }
}
System . out . println ( 1 + " " + 102 ) ;
return F ;
}
