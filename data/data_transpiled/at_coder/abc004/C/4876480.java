public static String print ( int n ) {
  String [ ] s = {
    "1" , "2" , "3" , "4" , "5" , "6" }
    ;
    n = n % 30 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String x = s [ i % 5 ] ;
      s [ i % 5 ] = s [ i % 5 + 1 ] ;
      s [ i % 5 + 1 ] = x ;
    }
    String ans = "" ;
    for ( String x : s ) {
      ans += x ;
    }
    return ans ;
  }
  