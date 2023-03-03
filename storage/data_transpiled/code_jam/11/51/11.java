static final int [ ] getCuts ( int [ ] [ ] lower , int [ ] [ ] upper , int npieces ) {
  int li = 0 ;
  int ui = 0 ;
  ArrayList < Cut > areas = new ArrayList < Cut > ( ) ;
  int totalArea = 0 ;
  int x = 0 ;
  int h1 = upper [ 0 ] [ 1 ] - lower [ 0 ] [ 1 ] ;
  int W = lower [ L ] [ 0 ] ;
  while ( x < W ) {
    int [ ] lnext = lower [ li + 1 ] ;
    int [ ] unext = upper [ ui + 1 ] ;
    int xnext ;
    int yupper ;
    int h2 ;
    int da ;
    int qc ;
    int i ;
    for ( i = 0 ;
    i < H ;
    i ++ ) {
      W = upper [ i ] [ 1 ] - lower [ i ] [ 0 ] ;
      L = upper [ i ] [ 0 ] - lower [ i ] [ 1 ] ;
      G = upper [ i ] [ 1 ] - lower [ i ] [ 1 ] ;
      L = lower [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      U = upper [ i ] [ 0 ] - lower [ i ] [ 1 ] ;
      L = lower [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      G = upper [ i ] [ 0 ] - lower [ i ] [ 1 ] ;
      L = lower [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      U = upper [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      L = lower [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      G = upper [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      L = lower [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      G = upper [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      L = lower [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      L = lower [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      L = lower [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      L = lower [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      U = lower [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      W = lower [ i ] [ 0 ] - lower [ i ] [ 0 ] ;
      L = lower [ i ] [ 0