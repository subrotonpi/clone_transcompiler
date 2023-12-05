@ Nullable public static String print ( @ NotNull final BigInteger input ) {
  final int n = input . intValue ( ) ;
  final Set < Integer > nums = new HashSet < > ( ) ;
  final Set < Integer > dNums = new HashSet < > ( ) ;
  for ( int i = 1 ;
  i <= ( int ) Math . sqrt ( n ) ;
  i ++ ) {
    if ( n % i == 0 && i != n ) {
      nums . add ( i ) ;
    }
  }
  for ( int num : nums ) {
    final int p = n / num ;
    final int q = n % num ;
    if ( q == 0 && p != n ) {
      dNums . add ( p ) ;
    }
  }
  final Set < Integer > mNums = nums . stream ( ) . filter ( num -> num > 1 ) . collect ( Collectors . toSet ( ) ) ;
  final int t = sum ( mNums ) ;
  if ( t == n ) {
    System . out . println ( "Perfect" ) ;
  }
  else if ( t > n ) {
    System . out . println ( "Abundant" ) ;
  }
  else {
    System . out . println ( "Deficient" ) ;
  }
  return null ;
}
