@ VisibleForTesting static void fractions ( Scanner input ) {
  int X = input . nextInt ( ) ;
  int Y = input . nextInt ( ) ;
  int g = gcd ( X , Y ) ;
  X /= g ;
  Y /= g ;
  int ok = 10 * 18 ;
  int ng = 0 ;
  while ( ok - ng > 1 ) {
    int mid = ( ok + ng + 1 ) / 2 ;
    int n = mid * Y ;
    int m = n * ( n + 1 ) / 2 - X * mid ;
    if ( m > 0 ) {
      ok = mid ;
    }
    else {
      ng = mid ;
    }
  }
  List < String > ans = new ArrayList < String > ( ) ;
  int k = ok ;
  do {
    int n = k * Y ;
    int m = n * ( n + 1 ) / 2 - X * k ;
    if ( 1 <= m && m <= n ) {
      ans . add ( String . valueOf ( n ) + " " + String . valueOf ( m ) ) ;
    }
    else if ( m > n ) {
      break ;
    }
    k ++ ;
  }
  while ( k < n ) ;
  if ( ans . size ( ) > 0 ) {
    System . out . println ( ( String ) ans . get ( 0 ) ) ;
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
}
