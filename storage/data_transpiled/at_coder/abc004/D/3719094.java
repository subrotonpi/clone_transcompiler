public static int R = Integer . parseInt ( input ) {
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int G = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  {
    int x = - 100 - i ;
    int y = - 100 - j ;
    if ( x * y > 0 ) return ( Math . abs ( x ) + Math . abs ( y ) ) * ( Math . abs ( x - y ) + 1 ) / 2 ;
    else return Math . abs ( x ) * ( Math . abs ( x ) + 1 ) / 2 + Math . abs ( y ) * ( Math . abs ( y ) + 1 ) / 2 ;
  }
  {
    int x = i ;
    int y = j ;
    if ( x * y > 0 ) return ( Math . abs ( x ) + Math . abs ( y ) ) * ( Math . abs ( x - y ) + 1 ) / 2 ;
    else return Math . abs ( x ) * ( Math . abs ( x ) + 1 ) / 2 + Math . abs ( y ) * ( Math . abs ( y ) + 1 ) / 2 ;
  }
  {
    int x = 100 - i ;
    int y = 100 - j ;
    if ( x * y > 0 ) return ( Math . abs ( x ) + Math . abs ( y ) ) * ( Math . abs ( x - y ) + 1 ) / 2 ;
    else return Math . abs ( x ) * ( Math . abs ( x ) + 1 ) / 2 + Math . abs ( y ) * ( Math . abs ( y ) + 1 ) / 2 ;
  }
  int ANS = 10 * 10 ;
  for ( int j = - 300 ;
  j < 51 ;
  j ++ ) {
    int k = Math . max ( 100 - ( B - 1 ) / 2 , j + G ) ;
    int i = Math . min ( j - 1 , - 100 + ( R - 1 ) / 2 ) ;
    if ( ANS > rt ( i + 1 - R , i ) + gt ( j , j + G - 1 ) + bt ( k , k + B - 1 ) ) ANS = rt ( i + 1 - R , i ) + gt ( j , j + G - 1 ) + bt ( k , k + B - 1 ) ;
  }
  System . out . println ( ANS ) ;
  return 0 ;
}
