public static double diff ( int H , int W ) {
  double sa , nh , sa , sb , sc ;
  int nw , nh ;
  int nw ;
  int nw ;
  int nw ;
  int nw ;
  int nw ;
  int nw ;
  int nw ;
  int nw ;
  int nw ;
  int nw ;
  int nw ;
  int nw ;
  int nw ;
  nw = H ;
  nw = W ;
  nw = nw ;
  nw = nw ;
  nw = nw ;
  sb = ( H - h ) * nw ;
  sc = ( H - h ) * ( W - nw ) ;
  diff = Math . min ( diff , Math . max ( sa , sb , sc ) - Math . min ( sa , sb , sc ) ) ;
  nh = ( H - h ) / 2 ;
  nw = nh ;
  sb = nh * W ;
  sc = ( H - h - nh ) * W ;
  diff = Math . min ( diff , Math . max ( sa , sb , sc ) - Math . min ( sa , sb , sc ) ) ;
  nw = nw ;
  nw = ( W - w ) / 2 ;
  sb = nw * H ;
  sc = ( W - w - nw ) * H ;
  diff = Math . min ( diff , Math . max ( sa , sb , sc ) - Math . min ( sa , sb , sc ) ) ;
  return diff ;
}