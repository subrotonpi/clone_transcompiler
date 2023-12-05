public static int gcd ( int a , int b ) {
  while ( b > 0 ) {
    a = b ;
    b = a % b ;
  }
  return a ;
  /* Compute the gcd of a and b */
  /* Compute the gcd of a and b */
  /* Compute the gcd of b */
  int [ ] numberArray = new int [ a ] ;
  /* Compute the number of numbers */
  int lcmNumber = 1 ;
  for ( int j = 0 ;
  j < numberArray . length ;
  j ++ ) {
    lcmNumber = lcm ( lcmNumber , numberArray [ j ] ) ;
  }
  /* Compute the number of numbers */
  if ( getClass ( ) . equals ( Integer . class ) ) {
    int numberCount = Integer . parseInt ( input ( ) ) ;
    int [ ] numbers = new int [ numberCount ] ;
    for ( int i = 0 ;
    i < numberCount ;
    i ++ ) {
      numbers [ i ] = Integer . parseInt ( input ( ) ) ;
    }
    System . out . println ( ( int ) listLcm ( numbers ) ) ;
  }
  return 0 ;
}
