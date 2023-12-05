static final void setSegmentTree ( int m , double init ) {
  final Scanner input = new Scanner ( System . in ) ;
  input . useDelimiter ( "\n" ) ;
  final Class < ? extends SegmentTree > clazz = SegmentTree . class ;
  final int n = 1 ;
  while ( ( n < m ) && ( clazz . equals ( ( int ) init ) ) ) {
    n *= 2 ;
  }
  final int [ ] data = new int [ 2 * n - 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    data [ i ] = init ;
  }
  public void update ( int k , double a ) {
    k += n - 1 ;
    data [ k ] = a ;
    while ( k -- > 0 ) {
      k = ( k - 1 ) / 2 ;
      data [ k ] = merge ( k ) ;
    }
  }
  public Point2D merge ( int k ) {
    final Point2D l = data [ 2 * k + 1 ] , r = data [ 2 * k + 2 ] ;
    return new Point2D ( l . x * r . x , r . x * l . y + r . y ) ;
  }
  public Point2D getTop ( ) {
    return data [ 0 ] ;
  }
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  m = input . nextInt ( ) ;
  final int [ ] P = new int [ m ] , A = new double [ m ] , B = new double [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    final String p = input . nextLine ( ) ;
    final String a = input . nextLine ( ) ;
    final String b = input . nextLine ( ) ;
    P [ i ] = Integer . parseInt ( p ) ;
    A [ i ] = Double . parseDouble ( a ) ;
    B [ i ] = Double . parseDouble ( b ) ;
  }
  final HashMap < Integer , Point2D > D = new HashMap < Integer , Point2D > ( ) ;
  final Set < Integer > q = new TreeSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    final String s = input . nextLine ( ) ;
    D . put ( s , new Point2D ( s , A [ i ] , B [ i ] ) ) ;
  }
  SegmentTree seg = clazz . newInstance ( ) ;
  seg . setTop ( m , new Point2D ( 1 , 0 ) ) ;
  int minT = 1 ;
  int maxT = 1 ;
  for ( int i = 0 ;
  i <