static final int [ ] getprime ( ) {
  final int n = 10000 ;
  int output = 1 ;
  for ( int i = 2 ;
  i < ( int ) ( Math . log ( n ) * 3 ) ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ": " + testCase ( i ) ) ;
  }
  /* Try to get the longest root of the prime */
  int t = ( int ) ( m * ( 1.0 / ( 0.0 + n ) ) ) ;
  while ( ( t + 1 ) * n <= m ) {
    t ++ ;
  }
  int [ ] countprime = new int [ 1000072 ] ;
  /* Initialize the prime array */
  int [ ] prime = new int [ 1072 ] ;
  for ( int i = 0 ;
  i < 1072 ;
  i ++ ) {
    prime [ i ] = 1 ;
  }
  prime [ 0 ] = 0 ;
  prime [ 1 ] = 0 ;
  for ( int i = 0 ;
  i < 1072 ;
  i ++ ) {
    if ( prime [ i ] == 0 ) {
      continue ;
    }
    for ( int j = i * i ;
    j < 1000072 ;
    j += i ) {
      prime [ j ] = 0 ;
    }
  }
  countprime [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < 1000072 ;
  i ++ ) {
    countprime [ i ] = countprime [ -- i ] + prime [ i ] ;
  }
  /* Case #"n" */
  int n = Integer . parseInt ( getline ( ) ) ;
  if ( n == 1 ) {
    return 0 ;
  }
  output = 1 ;
  for ( int i = 2 ;
  i < ( int ) ( Math . log ( n ) * 3 ) ;
  i ++ ) {
    int t = exactroot ( n , i ) ;
    if ( t == 1 ) {
      break ;
    }
    output += countprime [ t ] ;
  }
  /* Case #"n" */
  System . out . println ( "Case #" + ( i + 1 ) + ": " + testCase ( i ) ) ;
  return output ;
}
