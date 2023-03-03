public static int x , int y , W [ ] [ ] in = new int [ 9 ] [ ] ;
for ( int i = 0 ;
i < in . length ;
i ++ ) {
  in [ i ] = in [ i ] [ i ] ;
}
char [ ] [ ] c = new char [ 9 ] [ ] ;
for ( int i = 0 ;
i < 9 ;
i ++ ) {
  c [ i ] [ j ] = in [ i ] [ i ] ;
}
{
  int k = in [ 0 ] . length ;
  int i = in [ 0 ] . length ;
  int j = in [ 0 ] . length ;
  int di = in [ 0 ] . length ;
  int dj = in [ 0 ] . length ;
  c [ i ] [ j ] = ( k == 4 ) ? "" : c [ i ] [ j ] + in [ i + di ] [ j + dj ] ;
}
int ans = in [ 0 ] [ y - 1 ] ;
return ans ;
}
