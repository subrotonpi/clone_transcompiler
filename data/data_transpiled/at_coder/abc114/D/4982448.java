@ VisibleForTesting static int [ ] [ ] primes ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  BigInteger F = BigInteger . ONE ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    F = F . multiply ( i ) ;
  }
  final List < BigInteger > pns = new ArrayList < > ( ) ;
  for ( int n = 2 ;
  n <= N ;
  n ++ ) {
    for ( BigInteger pn : pns ) {
      if ( n % pn . equals ( BigInteger . ZERO ) ) {
        break ;
      }
    }
    else {
      pns . add ( n ) ;
    }
  }
  int c = 0 ;
  for ( BigInteger [ ] nums : pns ) {
    final BigInteger y1 = nums [ 0 ] . pow ( 14 ) . multiply ( nums [ 1 ] . pow ( 4 ) ) ;
    final BigInteger y2 = nums [ 1 ] . pow ( 14 ) . multiply ( nums [ 0 ] . pow ( 4 ) ) ;
    final BigInteger z1 = nums [ 0 ] . pow ( 24 ) . multiply ( nums [ 1 ] . pow ( 2 ) ) ;
    final BigInteger z2 = nums [ 1 ] . pow ( 24 ) . multiply ( nums [ 0 ] . pow ( 2 ) ) ;
    if ( F . modPow ( y1 , y2 ) . modPow ( z1 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2 ) . modPow ( z2 , z2