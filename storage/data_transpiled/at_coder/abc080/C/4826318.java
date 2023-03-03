public static String base10to ( long n , int b ) {
  if ( ( ( int ) ( n / b ) ) != 0 ) {
    return base10to ( ( int ) ( n / b ) , b ) + String . valueOf ( n % b ) ;
  }
  return String . valueOf ( n % b ) ;
}
int N = Integer . parseInt ( input ( ) ) ;
int [ ] [ ] f = new int [ N ] [ ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  f [ i ] = new int [ N ] ;
}
int [ ] [ ] p = new int [ N ] [ ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  p [ i ] = new int [ N ] ;
}
int [ ] ans = new int [ 1024 ] ;
for ( int i = 1 ;
i < 1024 ;
i ++ ) {
  String [ ] lis = new String ( base10to ( i , 4 ) . toCharArray ( ) ) ;
  long temp = 0 ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    int count = 0 ;
    for ( int j = 0 ;
    j < lis . length ;
    j ++ ) {
      if ( lis [ j ] . equals ( "0" ) ) {
        count += f [ k ] [ 2 * j ] * 0 + f [ k ] [ 2 * j + 1 ] * 0 ;
      }
      else if ( lis [ j ] . equals ( "1" ) ) {
        count += f [ k ] [ 2 * j ] * 1 + f [ k ] [ 2 * j + 1 ] * 0 ;
      }
      else if ( lis [ j ] . equals ( "2" ) ) {
        count += f [ k ] [ 2 * j ] * 0 + f [ k ] [ 2 * j + 1 ] * 1 ;
      }
      else if ( lis [ j ] . equals ( "3" ) ) {
        count += f [ k ] [ 2 * j ] * 1 + f [ k ] [ 2 * j + 1 ] * 1 ;
      }
    }
    temp += p [ k ] [ count ] ;
  }
  ans [ i ] = temp ;
}
System . out . println ( max ( ans ) ) ;
return ans [ i ] ;
}
