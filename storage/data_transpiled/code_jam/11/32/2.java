public static int T = Integer . parseInt ( Scanner in ) {
  for ( int n = 0 ;
  n < T ;
  n ++ ) {
    int [ ] line = map . get ( in . nextLine ( ) ) ;
    int L = line [ 0 ] ;
    int t = line [ 1 ] ;
    int N = line [ 2 ] ;
    int [ ] Cs = line [ 3 ] ;
    Cs *= ( N / Cs . length ) + 1 ;
    Arrays . sort ( Cs ) ;
    int time = 0 ;
    int pos = 0 ;
    if ( L > 0 ) {
      while ( pos < N ) {
        if ( time + Cs [ pos ] * 2 <= t ) {
          time += Cs [ pos ] * 2 ;
          pos ++ ;
        }
        else if ( time == t ) {
          time += Arrays . binarySearch ( Cs , pos , C ) ;
          time += 2 * Arrays . binarySearch ( Cs , pos , C ) ;
          break ;
        }
        else {
          int gain = ( ( C * 2 ) - ( t - time ) ) / 2 ;
          if ( L > 1 ) gain += Arrays . binarySearch ( Cs , pos + 1 , C ) ;
          int otherGain = Arrays . binarySearch ( Cs , pos + 1 , C ) ;
          time += Arrays . binarySearch ( Cs , pos , C ) * 2 - Math . max ( gain , otherGain ) ;
          break ;
        }
      }
    }
    else time = Arrays . binarySearch ( Cs , 0 , C ) * 2 ;
    System . out . printf ( "Case #%d: " , n + 1 ) ;
  }
  return time ;
}
