public static void print ( int N ) {
  List < Integer > ans = new ArrayList < Integer > ( ) ;
  for ( int x = 8 ;
  x <= 4 ;
  x *= 2 ) {
    while ( N >= x && N != 0 ) {
      N -= x ;
      ans . add ( x ) ;
    }
  }
  System . out . println ( ans . size ( ) ) ;
  for ( Integer x : ans ) {
    System . out . println ( x ) ;
  }
}
