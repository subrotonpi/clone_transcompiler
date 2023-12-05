public static int N = Integer . parseInt ( input ) {
  N = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
  int [ ] A = new int [ N ] ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) for ( int j = 1 ;
  j <= 10 ;
  j ++ ) A [ j ] = Integer . parseInt ( String . valueOf ( i ) * j ) ;
  Arrays . sort ( A ) ;
  return A [ N ] ;
}
