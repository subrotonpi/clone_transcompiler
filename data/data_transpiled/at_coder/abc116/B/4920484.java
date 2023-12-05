public static int f ( int n ) {
  if ( n % 2 == 0 ) {
    return n / 2 ;
  }
  else {
    return 3 * n + 1 ;
  }
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] hist = {
    s , }
    ;
    int m = 1 ;
    while ( true ) {
      int elem = f ( hist [ m - 1 ] ) ;
      if ( ! hist [ m ] == 0 ) {
        hist [ m ] = elem ;
        m ++ ;
      }
      else {
        System . out . println ( m + 1 ) ;
        break ;
      }
    }
  }
  