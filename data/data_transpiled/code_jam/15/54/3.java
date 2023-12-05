public static int tc = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
for ( int t = 0 ;
t < tc ;
t ++ ) {
  int n = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int [ ] v = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) v [ i ] = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) c [ i ] = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int cnt = Integer . valueOf ( c [ 0 ] ) ;
  c [ 0 ] -- ;
  int midx = 0 ;
  int [ ] res = new int [ n ] ;
  while ( cnt > 2 ) {
    while ( c [ midx ] == 0 ) midx ++ ;
    int d = v [ midx ] - v [ 0 ] ;
    res [ midx ] = d ;
    if ( d == 0 ) {
      for ( int i = 0 ;
      i < n ;
      i ++ ) c [ i ] = c [ i ] / 2 ;
    }
    else {
      HashMap < Integer , Integer > tosub = new HashMap < Integer , Integer > ( ) ;
      tosub . put ( d , c [ 0 ] + 1 ) ;
      for ( int i = 1 ;
      i < n ;
      i ++ ) {
        c [ i ] -= tosub . getOrDefault ( v [ i ] , 0 ) ;
        tosub . put ( v [ i ] + d , c [ i ] ) ;
      }
    }
    cnt /= 2 ;
  }
  while ( c [ midx ] == 0 ) midx ++ ;
  if ( v [ 0 ] == 0 ) res [ midx ] = v [ midx ] ;
  else res [ midx ] = v [ 0 ] ;
  System . out . println ( "Case #" + ( t + 1 ) + ": " + Arrays . toString ( res ) ) ;
}
return tc ;
}
