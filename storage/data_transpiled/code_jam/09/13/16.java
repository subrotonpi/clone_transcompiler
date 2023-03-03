static final String getLines ( ) throws IOException {
  String getline = new String ( ) ;
  String gettoken = new String ( getline ) ;
  int getInt = new int ( getline ) ;
  int getInt = new int ( getline ) ;
  int getInt = new int ( getInt ) ;
  int [ ] ints = new int [ getInt ] ;
  gettoken = new String ( getline ) ;
  int product = l -> Math . pow ( l , 1 ) ? Integer . parseInt ( getline ) : 1 ;
  Function < Integer , Integer > factorial = n -> product ( xrange ( n , 1 , - 1 ) ) ;
  Function < Integer , Integer > nPr = n -> product ( xrange ( n , n - r , - 1 ) ) ;
  Function < Integer , Integer > nCr = n -> nPr . apply ( n , r ) / factorial . apply ( r ) ;
  Function < Integer , Integer > nMr = l -> factorial . apply ( Ints . fromByteArray ( l ) ) / product . apply ( Ints . fromByteArray ( factorial ( l ) ) ) ;
  Function < Integer , Integer > gcd = y -> gcd ( y , x -> x % y ) != 0 ? x : x ;
  Function < Integer , Integer > lcm = gcd ( x -> x * y / gcd ( x , y ) ) ;
  {
    int a = gcd ( y , x ) ;
    int b = gcd ( y , x -> x % y ) ;
    if ( b == 0 ) return new Tuple2 ( a , 1 , 0 ) ;
    final int d = lcm . apply ( b , a -> x - a / b * y ) ;
    return new Tuple2 ( d , y , x - a / b * y ) ;
  }
}
