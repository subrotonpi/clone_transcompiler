public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Point > xs = new ArrayList < Point > ( ) ;
  List < Point > ys = new ArrayList < Point > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    xs . add ( new Point ( x , i ) ) ;
    ys . add ( new Point ( y , i ) ) ;
  }
  Collections . sort ( xs ) ;
  Collections . sort ( ys ) ;
  List < Point > es = new ArrayList < Point > ( ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    es . add ( new Point ( xs . get ( i + 1 ) . x - xs . get ( i ) . x , xs . get ( i ) . y , xs . get ( i + 1 ) . y ) ) ;
    es . add ( new Point ( ys . get ( i + 1 ) . x - ys . get ( i ) . x , ys . get ( i ) . y , ys . get ( i + 1 ) . y ) ) ;
  }
  Collections . sort ( es ) ;
  class UF {
    private final Map < String , Integer > p ;
    {
      super ( ) ;
      p = new HashMap < String , Integer > ( ) ;
    }
    public Integer find ( String x ) {
      if ( ! p . containsKey ( x ) ) p . put ( x , x ) ;
      if ( x . equals ( p . get ( x ) ) ) return x ;
      p . put ( x , find ( p . get ( x ) ) ) ;
      return p . get ( x ) ;
    }
    public void merge ( String x , String y ) {
      int x = p . get ( x ) ;
      int y = p . get ( y ) ;
      if ( x != y ) p . put ( x , y ) ;
    }
  }
  UF uf = new UF ( ) ;
  int ans = 0 ;
  try {
    for ( int d = 0 ;
    d < es . size ( ) ;
    d ++ ) {
      Point i0 = es . get ( d ) ;
      Point i1 = es . get ( d ) ;
      int c0 = uf . find ( i0 ) ;
      int c1 = uf . find ( i1 ) ;
      if ( c0 == c1 ) continue ;
      ans += d ;
      uf . merge ( i0 , i1 ) ;
    }
    System .