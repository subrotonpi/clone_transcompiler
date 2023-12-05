public static int [ ] [ ] c = new int [ 4 ] [ 4 ] ;
for ( int i = 0 ;
i < 4 ;
i ++ ) {
  String [ ] s = input . split ( " " ) ;
  for ( int j = 0 ;
  j < 4 ;
  j ++ ) c [ 3 - i ] [ 3 - j ] = s [ j ] ;
}
for ( int x [ ] : c ) {
  System . out . println ( Arrays . toString ( s ) ) ;
}
return c ;
}
