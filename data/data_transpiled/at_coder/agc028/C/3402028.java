public static int [ ] getStdDev ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    A [ i ] = a ;
    B [ i ] = b ;
  }
  int s1 = Arrays . stream ( A ) . sum ( ) ;
  int s2 = Arrays . stream ( B ) . sum ( ) ;
  int [ ] C = A . clone ( ) ;
  Arrays . sort ( C ) ;
  int s3 = Arrays . stream ( C , 0 , N ) . sum ( ) ;
  int s4 = Arrays . stream ( C , N , N ) . sum ( ) ;
  int check = 1 ;
  int m1 = C [ N - 1 ] ;
  int m2 = C [ N - 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Math . min ( A [ i ] , B [ i ] ) ;
    int b = Math . max ( A [ i ] , B [ i ] ) ;
    if ( b < m1 ) {
      check = 0 ;
      break ;
    }
    else if ( b == m1 && a != b ) {
      check = 0 ;
      break ;
    }
    else if ( a < m1 ) {
      s4 = Math . min ( s4 , s3 - m1 + b ) ;
    }
    else if ( a == m1 ) {
      s4 = Math . min ( s4 , s3 - m2 + b ) ;
    }
  }
  if ( check == 0 ) {
    System . out . println ( Math . min ( s1 , s2 , s3 ) ) ;
  }
  else {
    System . out . println ( Math . min ( s1 , s2 , s4 ) ) ;
  }
  return A ;
}
