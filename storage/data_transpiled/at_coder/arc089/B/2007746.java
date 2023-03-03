@ Function public static void apply ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] numA = new int [ K ] [ K ] ;
  int [ ] [ ] numB = new int [ K ] [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x , y , c ;
    x = Integer . parseInt ( input . nextLine ( ) ) % ( 2 * K ) ;
    y = Integer . parseInt ( input . nextLine ( ) ) % ( 2 * K ) ;
    if ( c == 'B' ) {
      if ( ( x / K == 0 && y / K == 0 ) || ( x / K == 1 && y / K == 1 ) ) {
        numA [ x % K ] [ y % K ] ++ ;
      }
      else {
        numB [ x % K ] [ y % K ] ++ ;
      }
    }
    else {
      if ( ( x / K == 1 && y / K == 0 ) || ( x / K == 0 && y / K == 1 ) ) {
        numA [ x % K ] [ y % K ] ++ ;
      }
      else {
        numB [ x % K ] [ y % K ] ++ ;
      }
    }
  }
  int [ ] sumXA = new int [ N ] ;
  int [ ] sumYA = new int [ N ] ;
  int [ ] sumXB = new int [ N ] ;
  int [ ] sumYB = new int [ N ] ;
  int sumA = sumXA [ 0 ] ;
  int sumB = sumXB [ 0 ] ;
  int [ ] [ ] Arr = new int [ K ] [ K ] ;
  int numOKA = sumA ;
  int numOKB = sumB ;
  for ( int x = 0 ;
  x < K ;
  x ++ ) {
    int tempOKA = numOKA ;
    int tempOKB = numOKB ;
    for ( int y = 0 ;
    y < K ;
    y ++ ) {
      Arr [ x ] [ y ] = Math . max ( tempOKA + sumB - tempOKB , sumA - tempOKA + tempOKB ) ;
      tempOKA -= sumYA [ y ] ;
      tempOKB -= sumYB [ y ] ;
    }
    sumYA = sumYA [ x ] ;
    sumYA = sumYB [ x ] ;
  }
  System . out . println (