public static int [ ] [ ] A = new int [ 4 ] [ 4 ] ;
for ( int i = 0 ;
i < 4 ;
i ++ ) {
  for ( int j = 0 ;
  j < 4 ;
  j ++ ) {
    if ( A [ i ] [ j ] == A [ i + 1 ] [ j ] ) {
      flag = 1 ;
    }
  }
}
for ( int i = 0 ;
i < 4 ;
i ++ ) {
  for ( int j = 0 ;
  j < 3 ;
  j ++ ) {
    if ( A [ i ] [ j ] == A [ i ] [ j + 1 ] ) {
      flag = 1 ;
    }
  }
}
if ( flag ) {
  System . out . println ( "CONTINUE" ) ;
}
else {
  System . out . println ( "GAMEOVER" ) ;
}
return A ;
}
