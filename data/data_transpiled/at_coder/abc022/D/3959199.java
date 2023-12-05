public static final Scanner stdin = new Scanner ( System . in ) {
  @ Override public int nextInt ( ) {
    return Integer . parseInt ( stdin . nextLine ( ) ) ;
  }
  @ Override public int [ ] li ( ) {
    return map ( Integer . parseInt ( stdin . nextLine ( ) ) ) ;
  }
  @ Override public int [ ] li ( ) {
    return map ( Integer . parseInt ( stdin . nextLine ( ) ) - 1 ) ;
  }
  @ Override public float [ ] li ( ) {
    return map ( Integer . parseInt ( stdin . nextLine ( ) ) ) ;
  }
  @ Override public float [ ] li ( ) {
    return map ( Integer . parseInt ( stdin . nextLine ( ) ) ) ;
  }
  @ Override public float [ ] li ( ) {
    return map ( Integer . parseInt ( stdin . nextLine ( ) ) - 1 ) ;
  }
  @ Override public float [ ] lf ( ) {
    return map ( Float . parseFloat ( stdin . nextLine ( ) ) ) ;
  }
  @ Override public String [ ] ls ( ) {
    return stdin . nextLine ( ) . split ( " " ) ;
  }
  @ Override public String [ ] ns ( ) {
    return stdin . nextLine ( ) . split ( " " ) ;
  }
  @ Override public LinkedList < String > lc ( ) {
    return new LinkedList < String > ( ns ) ;
  }
  @ Override public int ni ( ) {
    return Integer . parseInt ( stdin . nextLine ( ) ) ;
  }
  @ Override public float nf ( ) {
    return Float . parseFloat ( stdin . nextLine ( ) ) ;
  }
  @ Override public double ccw ( Point2D p1 , Point2D p2 , Point2D p3 ) {
    return ( p2 . getX ( ) - p1 . getX ( ) ) * ( p3 . getY ( ) - p1 . getY ( ) ) - ( p2 . getY ( ) - p1 . getY ( ) ) * ( p3 . getX ( ) - p1 . getX ( ) ) ;
  }
  private LinkedList < Point2D > [ ] points ( ) {
    LinkedList < Point2D > u = new LinkedList < Point2D > ( ) ;
    LinkedList < Point2D > l = new LinkedList < Point2D > ( ) ;
    Collections . sort ( points ) ;
    for ( Point2D p : points ) {
      while ( u . size ( ) > 1 && ccw ( u . get ( u . size ( ) - 2 ) , u . get ( u . size ( ) - 1 ) , p ) >= 0 ) {
        u . remove ( u . size ( ) - 1 ) ;
      }
      while ( l . size ( ) > 1 && ccw (