public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List ans ;
  if ( n == 3 ) {
    ans = new ArrayList ( 2 ) ;
    ans . add ( 5 ) ;
    ans . add ( 63 ) ;
  }
  else if ( n == 4 ) {
    ans = new ArrayList ( 2 ) ;
    ans . add ( 5 ) ;
    ans . add ( 20 ) ;
    ans . add ( 63 ) ;
  }
  else if ( n == 5 ) {
    ans = new ArrayList ( 2 ) ;
    ans . add ( 3 ) ;
    ans . add ( 4 ) ;
    ans . add ( 6 ) ;
    ans . add ( 9 ) ;
  }
  else {
    ans = new ArrayList ( ) ;
    int cnt = 0 , s = 0 ;
    for ( int i = 2 ;
    i < 30001 ;
    i ++ ) {
      if ( i % 2 == 0 || i % 3 == 0 ) {
        ans . add ( i ) ;
        cnt ++ ;
        s += i ;
      }
      if ( cnt == n ) break ;
    }
    switch ( s % 6 ) {
      case 2 : ans . remove ( 8 ) ;
      ans . add ( ( i / 6 ) * 6 + 6 ) ;
      break ;
      case 3 : ans . remove ( 9 ) ;
      ans . add ( ( ( i / 6 ) * 6 + 6 ) * 4 ) ;
      break ;
    }
  }
  System . out . println ( ans . toArray ( ) ) ;
}
