public static int [ ] [ ] C = new int [ 3 ] [ 3 ] ;
boolean flg = true ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  C [ i ] = new int [ 3 ] ;
  for ( int j = 0 ;
  j < 2 ;
  j ++ ) {
    if ( ( C [ i ] [ j ] - C [ i ] [ j + 1 ] ) != C [ i + 1 ] [ j ] - C [ i + 1 ] [ j + 1 ] ) {
      flg = false ;
    }
  }
}
for ( int i = 0 ;
i < 2 ;
i ++ ) {
  for ( int j = 0 ;
  j < 2 ;
  j ++ ) {
    if ( ( C [ i ] [ j ] - C [ i + 1 ] [ j ] ) != C [ i ] [ j + 1 ] - C [ i + 1 ] [ j + 1 ] ) {
      flg = false ;
    }
  }
}
System . out . println ( flg ? "Yes" : "No" ) ;
return C ;
}
