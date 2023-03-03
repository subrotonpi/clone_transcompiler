public static void solve ( int N , int [ ] A ) throws IOException {
  List < Pair > B = new ArrayList < Pair > ( ) ;
  for ( int d = 0 ;
  d < A . length ;
  d ++ ) {
    int h = A [ d ] ;
    int m = A [ h ] ;
    for ( int i : xrange ( h ) ) {
      B . add ( new Pair ( d , m + i ) ) ;
    }
  }
  if ( B . size ( ) <= 1 ) return ;
  Collections . sort ( B ) ;
  int a = B . get ( 0 ) . first ;
  int x = B . get ( 1 ) . first ;
  int b = B . get ( 2 ) . first ;
  int y = B . get ( 3 ) . second ;
  if ( x == y ) return ;
  if ( x > y ) {
    if ( ( 720 - b ) * y <= ( 360 - a ) * x ) return ;
    else return ;
  }
  else {
    if ( ( 720 - a ) * x <= ( 360 - b ) * y ) return ;
    return ;
  }
  FileWriter fo = new FileWriter ( "out.txt" ) ;
  Scanner fi = new Scanner ( fi ) ;
  Function < Integer , Integer > rr = new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( Integer integer ) {
      return Integer . parseInt ( integer ) ;
    }
  }
  ;
  Function < Integer , Integer > rrI = new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( Integer integer ) {
      return Integer . parseInt ( integer ) ;
    }
  }
  ;
  IntFunction < Integer > rrM = new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( Integer integer ) {
      return Integer . parseInt ( integer ) ;
    }
  }
  ;
}
