static final Scanner rl = new Scanner ( System . in ) {
  private final int M = 987654321 ;
  private final int [ ] missed = new int [ M ] ;
  private int [ ] [ ] cache = new int [ M ] [ M ] ;
  {
    int y = 0 , p = 0 ;
    int ret ;
    int [ ] [ ] cache = new int [ M ] [ M ] ;
    {
      int [ ] [ ] [ ] miss = new int [ M ] [ M ] ;
      {
        if ( y == p ) {
          if ( miss [ x ] < missed [ x ] ) return M ;
        }
        return 0 ;
      }
    }
  }
  ;
  final int [ ] key = new int [ M ] [ M ] ;
  if ( cache [ key ] != null ) return cache [ key ] ;
  ret = go ( y + 1 , x * 2 , missed + 1 ) + go ( y + 1 , x * 2 + 1 , missed + 1 ) ;
  ret = min ( ret , price [ y ] [ x ] + go ( y + 1 , x * 2 , missed ) + go ( y + 1 , x * 2 + 1 , missed ) ) ;
  cache [ key ] = ret ;
  return ret ;
}
