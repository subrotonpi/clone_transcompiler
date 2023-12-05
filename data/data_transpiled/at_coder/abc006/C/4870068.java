public static int [ ] [ ] getPoints ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( m < n * 2 || n * 4 < m ) {
    System . out . println ( - 1 , - 1 , - 1 ) ;
  }
  else {
    int y , z ;
    if ( m >= n * 3 ) {
      z = m - n * 3 ;
      y = n - z ;
      x = 0 ;
    }
    else {
      z = 0 ;
      y = m - n * 2 ;
      x = n - y ;
    }
    System . out . println ( x + " " + y + " " + z ) ;
  }
  return new int [ ] [ ] {
    {
      x , y , z }
    }
    ;
  }
  