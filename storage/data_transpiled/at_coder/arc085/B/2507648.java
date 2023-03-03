static int N = Integer . parseInt ( input ) {
  int Z = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int [ ] src = new int [ N ] ;
  src [ 0 ] = Z ;
  int s1 = Math . abs ( src [ src . length - 1 ] - W ) ;
  int s2 = N == 1 ? 0 : Math . abs ( src [ src . length - 2 ] - src [ src . length - 1 ] ) ;
  System . out . println ( max ( s1 , s2 ) ) ;
  return s1 ;
}
