static int [ ] N = new int [ N ] , A = new int [ N ] , B = new int [ N ] ;
for ( int t = 0 ;
t < N ;
t ++ ) {
  int v = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < 2 * n ;
  i ++ ) {
    v ^= ( v >> 1 ) ;
  }
}
{
  int [ ] code = new int [ N ] ;
  int l = code . length ;
  int p = code . length ;
  assert p % 2 == 1 ;
  int q = 0 ;
  while ( q != p ) {
    code [ q ++ ] = code [ p ++ ] ;
  }
}
return code ;
}
