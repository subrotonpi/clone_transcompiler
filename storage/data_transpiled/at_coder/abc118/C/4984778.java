public static int gcd ( int a , int b ) {
  while ( b > 0 ) {
    a = b ;
    b = a % b ;
  }
  return a ;
  /* Compute the gcd of a and b */
  int gcd = a * b / gcd ( a , b ) ;
  /* List the numbers */
  int lcmNumber = 1 ;
  for ( int j = 0 ;
  j < numberList . size ( ) ;
  j ++ ) {
    lcmNumber = lcm ( lcmNumber , numberList . get ( j ) ) ;
  }
  /* Compute the gcd of a and b */
  int gcdNumber = numberList . get ( 0 ) ;
  for ( int i = 0 ;
  i < numberList . size ( ) ;
  i ++ ) {
    gcdNumber = gcd ( gcdNumber , numberList . get ( i ) ) ;
  }
  /* Print out the numbers */
  if ( getClass ( ) . equals ( String . class ) ) {
    int n = input . nextInt ( ) ;
    List < Integer > numberList = Lists . newArrayList ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      numberList . add ( Integer . parseInt ( input . next ( ) ) ) ;
    }
    System . out . println ( listGgcd ( numberList ) ) ;
  }
  return gcd ;
}
