public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  if ( n % 2 == 0 ) {
    m = 0 ;
    ArrayList < Pair > ans = new ArrayList < Pair > ( ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      for ( int j = i + 1 ;
      j <= n ;
      j ++ ) {
        if ( j != n - i + 1 ) {
          m ++ ;
          ans . add ( new Pair ( i , j ) ) ;
        }
      }
    }
  }
  else {
    m = 0 ;
    ArrayList < Pair > ans = new ArrayList < Pair > ( ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      for ( int j = i + 1 ;
      j <= n ;
      j ++ ) {
        if ( j != n - i ) {
          m ++ ;
          ans . add ( new Pair ( i , j ) ) ;
        }
      }
    }
  }
  System . out . println ( m ) ;
  Iterator < Pair > it = ans . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    Pair a = it . next ( ) ;
    Pair b = a . getSecond ( ) ;
    System . out . println ( a + " " + b ) ;
  }
}
