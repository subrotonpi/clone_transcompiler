public static int N = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = N ;
  int a = new TreeSet < > ( X ) , b = new TreeSet < > ( N - X ) ;
  do {
    if ( b % a == 0 ) {
      ans += ( ( int ) ( b / a ) * 2 - 1 ) * a ;
      break ;
    }
    else {
      ans += ( int ) ( b / a ) * a * 2 ;
      a = b % a ;
      b = a ;
    }
  }
  while ( b > 0 ) ;
  return ans ;
}
