public static int run ( int n , String s ) {
  String sl = s . substring ( 0 , n ) ;
  String sr = s . substring ( n , 2 * n ) . substring ( 0 , 2 * n ) ;
  HashMap < String , Integer > dic = new HashMap < String , Integer > ( ) ;
  List < String > keys = new ArrayList < String > ( ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < 2 * n ;
  i ++ ) {
    String red = "" , blue = "" , red2 = "" , blue2 = "" ;
    String bits = Integer . toBinaryString ( 2 * n + i ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( bits . charAt ( j ) == '0' ) {
        red += sl . charAt ( j ) ;
        red2 += sr . charAt ( j ) ;
      }
      else {
        blue += sl . charAt ( j ) ;
        blue2 += sr . charAt ( j ) ;
      }
    }
    keys . add ( red2 + "-" + blue2 ) ;
    String key = red + "-" + blue ;
    if ( ! dic . keySet ( ) . contains ( key ) ) {
      dic . put ( key , 1 ) ;
    }
    else {
      dic . put ( key , 1 ) ;
    }
  }
  for ( String key : keys ) {
    cnt += dic . getOrDefault ( key , 0 ) ;
  }
  return cnt ;
}
