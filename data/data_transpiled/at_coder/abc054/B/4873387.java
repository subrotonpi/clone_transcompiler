static final int [ ] [ ] [ ] [ ] A = new int [ N ] [ M ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  A [ i ] = new int [ N ] [ ] [ ] ;
}
for ( int i = 0 ;
i < M ;
i ++ ) {
  B [ i ] = new int [ M ] [ ] ;
}
int [ ] [ ] [ ] B = new int [ N ] [ ] [ ] ;
for ( int i = 0 ;
i < M ;
i ++ ) {
  B [ i ] = new int [ N ] [ ] ;
}
Arrays . fill ( A , B ) ;
boolean flag = false ;
for ( int i = 0 ;
i < N - M + 1 ;
i ++ ) {
  for ( int j = 0 ;
  j < N - M + 1 ;
  j ++ ) {
    if ( Arrays . equals ( A [ i ] [ j ] , B [ j ] [ i ] ) ) {
      flag = true ;
    }
  }
}
if ( flag ) {
  System . out . println ( "Yes" ) ;
}
else {
  System . out . println ( "No" ) ;
}
return A ;
}
