public static int getMin ( int X , int Y ) {
  int left = 0 ;
  int right = 10 * 50 ;
  int resN = - 1 ;
  while ( ( right - left > 1 ) && ( right - left > 1 ) ) {
    int med = ( right + left ) / 2 ;
    if ( ( med == 0 ) || ( right == 1 ) ) {
      break ;
    }
    int y = med * Y ;
    int x = med * X ;
    int res = y * ( y + 1 ) / 2 ;
    int l = res - y ;
    int r = res - 1 ;
    if ( l <= x && x <= r ) {
      right = med ;
      resN = med ;
      continue ;
    }
    if ( x < l ) {
      right = med ;
      continue ;
    }
    if ( x > r ) {
      left = med ;
      continue ;
    }
  }
  return resN ;
}
if ( Class . isEnum ( "java.util.BigInteger" ) ) {
  X = input . nextInt ( ) ;
  Y = input . nextInt ( ) ;
  X = Integer . parseInt ( X ) ;
  Y = Integer . parseInt ( Y ) ;
  BigInteger g = BigInteger . valueOf ( X . gcd ( Y ) ) ;
  X = X . divide ( g ) ;
  Y = Y . divide ( g ) ;
  int minN = getMin ( X , Y ) ;
  if ( minN == - 1 ) {
    System . out . println ( "Impossible" ) ;
  }
  else {
    int t = minN ;
    while ( ( t = minN ) != - 1 ) {
      int N = t * Y ;
      int wrong = t * X ;
      int res = N * ( N + 1 ) / 2 ;
      int l = res - N ;
      int r = res - 1 ;
      if ( wrong < l ) {
        break ;
      }
      if ( wrong > r ) {
        break ;
      }
      System . out . println ( N + " " + ( res - wrong ) ) ;
      t ++ ;
    }
  }
  return 0 ;
}
