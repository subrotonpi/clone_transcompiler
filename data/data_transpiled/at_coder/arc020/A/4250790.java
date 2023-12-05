public static int [ ] [ ] [ ] [ ] A = new int [ 3 ] [ 3 ] [ 3 ] , B = new int [ 3 ] [ 3 ] [ 3 ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  A [ i ] [ 0 ] = i ;
  B [ i ] [ 0 ] = i ;
}
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  A [ i ] [ 0 ] = i ;
  B [ i ] [ 1 ] = i ;
}
if ( abs ( A ) == abs ( B ) ) {
  System . out . println ( "Draw" ) ;
}
else if ( abs ( A ) < abs ( B ) ) {
  System . out . println ( "Ant" ) ;
}
else if ( abs ( B ) < abs ( A ) ) {
  System . out . println ( "Bug" ) ;
}
else {
  System . out . println ( "Bug" ) ;
}
return A ;
}
