public static void print ( int N ) {
  List < Point > points = new ArrayList < Point > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    points . add ( new Point ( x , y ) ) ;
  }
  Point [ ] rotated = new Point [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    rotated [ i ] = new Point ( x + y , x - y ) ;
  }
  List < Integer > xs = new ArrayList < Integer > ( ) ;
  List < Integer > ys = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    xs . add ( i ) ;
    ys . add ( i ) ;
  }
  int dx = Math . max ( xs . size ( ) , Math . min ( xs . size ( ) , ys . size ( ) ) ) ;
  int p1 = ( Math . min ( xs . size ( ) , ys . size ( ) ) ) ;
  int p2 = ( Math . min ( xs . size ( ) , ys . size ( ) ) ) ;
  int p3 = ( Math . max ( xs . size ( ) , ys . size ( ) ) ) ;
  int p4 = ( Math . max ( xs . size ( ) , ys . size ( ) ) ) ;
  StringBuilder res = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    res . append ( points . get ( i ) ) ;
  }
}
