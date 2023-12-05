public static int f ( int n ) {
  if ( n % 2 == 0 ) {
    return n / 2 ;
  }
  else {
    return ( n * 3 ) + 1 ;
  }
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > l = new ArrayList < > ( ) ;
  l . add ( s ) ;
  int m = 1 ;
  while ( true ) {
    int num = f ( l . get ( m - 1 ) ) ;
    if ( ! l . contains ( num ) ) {
      l . add ( num ) ;
      m ++ ;
    }
    else {
      System . out . println ( m + 1 ) ;
      break ;
    }
  }
}
