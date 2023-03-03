static int getBest ( int P , int Q , int [ ] H , int [ ] G , int [ ] buf , int pos , int free ) {
  if ( buf [ pos ] [ free ] >= 0 ) {
    return buf [ pos ] [ free ] ;
  }
  if ( pos == H . length ) {
    return 0 ;
  }
  int n = ( H [ pos ] + Q - 1 ) / Q ;
  int a = getBest ( P , Q , H , G , buf , pos + 1 , free + n ) ;
  int m = ( H [ pos ] - 1 ) / Q ;
  int remaining = H [ pos ] - m * Q ;
  int b = 0 ;
  if ( ( free + m ) * P >= remaining ) {
    n = ( remaining + P - 1 ) / P ;
    b = G [ pos ] + getBest ( P , Q , H , G , buf , pos + 1 , free + m - n ) ;
  }
  buf [ pos ] [ free ] = Math . max ( a , b ) ;
  return buf [ pos ] [ free ] ;
}
