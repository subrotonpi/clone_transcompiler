public static int [ ] [ ] A = new int [ 4 ] [ 4 ] ;
for ( int i = 0 ;
i < 4 ;
i ++ ) {
  for ( int j = 0 ;
  j < 3 ;
  j ++ ) {
    if ( A [ i ] [ j ] == A [ i ] [ j + 1 ] ) {
      flag = true ;
      break ;
    }
  }
}
return ( flag ? "CONTINUE" : "GAMEOVER" ) ;
}
