public static long gcd ( long a , long b ) throws Exception {
  if ( b == 0 ) {
    return a ;
  }
  return gcd ( b , a % b ) ;
}
/* Compute the gcd of the two integers. */
final long gcd = a * b / gcd ( a , b ) ;
final Scanner input = new Scanner ( System . in ) ;
final int N = input . nextInt ( ) ;
if ( N == 1 ) {
  System . out . println ( input . nextLine ( ) ) ;
}
else {
  final long [ ] T = new long [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T [ i ] = Long . parseLong ( input . nextLine ( ) ) ;
  }
  long ans = gcd ( T [ 0 ] , T [ 1 ] ) ;
  for ( int i = 2 ;
  i < N ;
  i ++ ) {
    ans = gcd ( ans , T [ i ] ) ;
  }
  System . out . println ( ans ) ;
}
