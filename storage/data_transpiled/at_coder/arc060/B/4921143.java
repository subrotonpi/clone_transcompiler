static final int [ ] getStdDev ( ) {
  final int n , s ;
  n = Integer . parseInt ( input . readLine ( ) ) ;
  s = Integer . parseInt ( input . readLine ( ) ) ;
  /* The base sum of the numbers is the same as the number of digits in the base */
  if ( ( Math . floor ( n / s ) ) != 0 ) {
    return getStdDev ( Math . floor ( n / s ) , s ) + n % s ;
  }
  else {
    /* The base sum of the digits is the same as the base sum of the digits */
    for ( int p = Math . floor ( Math . sqrt ( n ) ) + 1 ;
    p > 0 ;
    p -- ) {
      int b = ( n - s ) / p + 1 ;
      if ( b > 1 ) {
        int q = n % b ;
        if ( p + q == s && q < b && n == p * b + q && p < b ) {
          return b ;
        }
      }
    }
    return null ;
  }
  int ans = - 1 ;
  boolean flag = false ;
  final int [ ] answers = new int [ 2 ] ;
  if ( s == n ) {
    ans = n + 1 ;
    flag = true ;
    answers [ 0 ] = ans ;
  }
  for ( int b = 2 ;
  b <= Math . ceil ( Math . sqrt ( n ) ) ;
  b ++ ) {
    if ( s == getStdDev ( b ) ) {
      ans = b ;
      flag = true ;
      answers [ 1 ] = ans ;
      break ;
    }
  }
  ans = searchP ( n , s ) ;
  if ( ans != - 1 ) {
    flag = true ;
    answers [ 0 ] = ans ;
  }
  if ( ! flag ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( ( int ) Math . min ( answers ) ) ;
  }
  return answers ;
}
