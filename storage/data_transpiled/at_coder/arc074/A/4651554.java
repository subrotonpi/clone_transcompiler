public static int makeHarf ( int H , int W ) {
  int h = H / 2 ;
  int small = W * h ;
  int large = W * ( H - h ) ;
  int w = W / 2 ;
  int small2 = w * H ;
  int large2 = ( W - w ) * H ;
  if ( large - small <= large2 - small2 ) {
    return large + small ;
  }
  else {
    return large2 + small2 ;
  }
}
int i = Integer . parseInt ( input . nextLine ( ) ) ;
int ans = Integer . MIN_VALUE ;
for ( i = 1 ;
i < H ;
i ++ ) {
  int [ ] tmp = new int [ i ] ;
  tmp [ 0 ] = h * W ;
  for ( int j = 0 ;
  j < i ;
  j ++ ) {
    tmp [ j ] = j ;
  }
  ans = Math . min ( max ( tmp ) - min ( tmp ) , ans ) ;
}
for ( i = 1 ;
i < W ;
i ++ ) {
  int [ ] tmp = new int [ i ] ;
  tmp [ i ] = H * w ;
  for ( int j = 0 ;
  j < i ;
  j ++ ) {
    tmp [ j ] = j ;
  }
  ans = Math . min ( max ( tmp ) - min ( tmp ) , ans ) ;
}
return ans ;
}
