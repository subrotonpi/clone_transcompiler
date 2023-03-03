public static double dis ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] time = Lists . newArrayList ( ) ;
  int [ ] speed = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    time [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( speed ) ;
  Arrays . fill ( time , 0 ) ;
  int [ ] cumtime = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cumtime [ i + 1 ] = cumtime [ i ] + time [ i ] ;
  }
  double dis = 0.0 ;
  int prev = 0 ;
  int l = cumtime [ n ] ;
  int tp = 1 ;
  for ( int t = 1 ;
  t <= l ;
  t ++ ) {
    if ( t > cumtime [ tp ] ) tp ++ ;
    int v = speed [ tp ] ;
    v = Math . min ( v , prev + 1 ) ;
    for ( int i = 0 ;
    i < tp ;
    i ++ ) v = Math . min ( v , t - cumtime [ i ] + speed [ i ] ) ;
    for ( int i = tp + 1 ;
    i < n + 2 ;
    i ++ ) v = Math . min ( v , cumtime [ i - 1 ] - t + speed [ i ] ) ;
    if ( v == prev && v < speed [ tp ] ) dis += v + 1 / 4 ;
    else dis += ( v + prev ) / 2 ;
    prev = v ;
  }
  System . out . println ( dis ) ;
  return dis ;
}
