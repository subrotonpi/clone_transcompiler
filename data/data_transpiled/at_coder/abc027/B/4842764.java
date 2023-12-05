public static void print ( int N ) {
  int l = Integer . parseInt ( input ( ) ) ;
  if ( Integer . parseInt ( l ) % N != 0 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  int ave = Integer . parseInt ( l ) / N ;
  int c = 0 ;
  int s = 0 ;
  int a = 0 ;
  for ( int x : l ) {
    a ++ ;
    s += x ;
    if ( s / a == ave ) {
      c += a - 1 ;
      a = 0 ;
      s = 0 ;
    }
  }
  System . out . println ( c ) ;
}
