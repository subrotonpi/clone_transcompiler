static final Map < Integer , Boolean > [ ] memo = new Map [ 11 ] ;
for ( int i = 0 ;
i <= 11 ;
i ++ ) {
  memo [ i ] = new HashMap < > ( ) ;
}
{
  if ( i == 1 ) {
    return true ;
  }
  if ( memo [ i ] . containsKey ( n ) ) {
    return memo [ i ] . get ( n ) ;
  }
  int s = 0 ;
  int i = i ;
  while ( i > 0 ) {
    s += ( i % b ) * ( i % b ) ;
    i /= b ;
  }
  memo [ i ] . put ( n , false ) ;
  Boolean v = isHappy ( s , b ) ;
  memo [ i ] . put ( n , v ) ;
  return v ;
}
private static void happyGen ( int [ ] B , int i ) {
  if ( i == B . length ) {
    int n = 2 ;
    do {
      happyGen ( B , i + 1 ) ;
    }
    while ( isHappy ( n , B [ i ] ) ) ;
  }
  else {
    for ( int n = 0 ;
    n < B . length ;
    n ++ ) {
      if ( isHappy ( n , B [ i ] ) ) {
        happyGen ( B , i + 1 ) ;
      }
    }
  }
}
int CN = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int C = 1 ;
C <= CN ;
C ++ ) {
  System . out . println ( "Case #" + C + ":" ) ;
  int B = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int n = 0 ;
  n < B . length ;
  n ++ ) {
    System . out . println ( n ) ;
    break ;
  }
}
return memo ;
}
