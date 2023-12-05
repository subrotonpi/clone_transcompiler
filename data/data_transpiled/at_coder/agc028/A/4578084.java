public static int gcm ( int a , int b ) {
  while ( ( b = a ) != 0 ) {
    a = b ;
    b = a % b ;
  }
  /* lcm */
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  String s = new LinkedList < String > ( ) ;
  String t = new LinkedList < String > ( ) ;
  String [ ] sOut = new String [ n ] ;
  String [ ] tOut = new String [ m ] ;
  for ( int i = 0 ;
  i < ( int ) gcm ( n , m ) ;
  i ++ ) {
    sOut [ i ] = s . substring ( i * ( int ) ( n / gcm ( n , m ) ) ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    tOut [ i ] = t . substring ( i * ( int ) ( m / gcm ( n , m ) ) ) ;
  }
  if ( ( sOut == tOut ) ) System . out . println ( lcm ( n , m ) ) ;
  else System . out . println ( - 1 ) ;
}
