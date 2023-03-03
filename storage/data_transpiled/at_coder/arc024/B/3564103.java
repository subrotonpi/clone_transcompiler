public static int N = Integer . parseInt ( input ) {
  int [ ] cl = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cl [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 1 ;
  int renzoku1 = 1 ;
  int score = 1 ;
  int renzoku = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( i == 0 ) && ( ( cl [ i ] == cl [ 1 ] ) || ( cl [ i ] == cl [ 0 ] ) ) ) {
      renzoku1 = 2 ;
      renzoku = 1 ;
    }
  }
  else if ( ( renzoku == 1 ) && ( ( i == N - 1 ) || ( ( cl [ i ] == cl [ 0 ] ) || ( cl [ i ] == cl [ 0 ] ) ) ) ) {
    if ( ( cl [ i ] == cl [ 0 ] ) && ( ( cl [ i ] == cl [ 1 ] ) || ( cl [ i ] == cl [ 0 ] ) ) ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( N / 2 ) ;
    }
    quit ( ) ;
  }
  if ( ( cl [ i ] == cl [ i + 1 ] ) && ( renzoku1 == 1 ) ) {
    renzoku1 ++ ;
  }
  else {
    renzoku = 0 ;
  }
  else if ( ( renzoku == 0 ) && ( ( cl [ i ] == cl [ 0 ] ) || ( cl [ i ] == cl [ 0 ] ) ) ) {
    score += renzoku1 ;
    ans = Math . max ( ans , score ) ;
  }
  else {
    ans = Math . max ( score , Math . max ( ans , renzoku1 ) ) ;
  }
  else if ( ( cl [ i ] == cl [ i + 1 ] ) && ( cl [ i + 1 ] == cl [ 0 ] ) ) {
    score ++ ;
  }
  else {
    ans = Math . max ( ans , score ) ;
    score = 1 ;
  }
  if ( ( ans == 2 ) && ( ans == 1 ) ) {
    System . out . println ( 1 ) ;
  }
  else {
    System . out . println ( ( ans + 1 ) / 2 ) ;
  }
  return ans ;
}
