static final String os = "sys, re, math" ;
final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
class Circle {
  double x , y , r ;
  public Circle ( int x , int y , int r ) {
    this . x = x ;
    this . y = y ;
    this . r = r ;
  }
  public double solve ( Circle [ ] circles ) {
    if ( circles . length == 1 ) return circles [ 0 ] . r ;
    if ( circles . length == 2 ) return Math . max ( c . r , c . r ) ;
    assert circles . length <= 3 ;
    double best = 1e20 ;
    for ( int a = 0 ;
    a < 3 ;
    a ++ ) {
      double R = circles [ a ] . r ;
      Circle [ ] B = new Circle [ 3 ] ;
      for ( int i = 0 ;
      i < 3 ;
      i ++ ) B [ i ] = circles [ i ] ;
      assert B . length == 2 ;
      R = Math . max ( R , ( Math . sqrt ( ( B [ 0 ] . x - B [ 1 ] . x ) * ( B [ 0 ] . x - B [ 1 ] . x ) ) + ( B [ 0 ] . y - B [ 1 ] . y ) * ( B [ 0 ] . y - B [ 1 ] . y ) ) + B [ 0 ] . r + B [ 1 ] . r ) / 2.0 ;
      best = Math . min ( best , R ) ;
    }
    return best ;
  }
  public static void main ( String [ ] args ) {
    int T = Integer . parseInt ( stdin . readLine ( ) ) ;
    for ( int cs = 1 ;
    cs <= T ;
    cs ++ ) {
      int N = Integer . parseInt ( stdin . readLine ( ) ) ;
      Circle [ ] circles = new Circle [ N ] ;
      for ( int each = 0 ;
      each < N ;
      each ++ ) {
        double x = Double . parseDouble ( stdin . readLine ( ) ) ;
        double y = Double . parseDouble ( stdin . readLine ( ) ) ;
        double r = Double . parseDouble ( stdin . readLine ( ) ) ;
        circles [ each ] = new Circle ( x , y , r ) ;
      }
      System . out . printf ( "Case #%d: %.15g" , cs , solve ( circles ) ) ;
    }
  }
}
