@ functools . lru_cache ( maxsize = maxsize ) public static int getBit ( int n , int d ) {
  return ( n >> d ) & 1 ;
}
@ SuppressWarnings ( "unused" ) int N = Integer . parseInt ( input ( ) ) ;
int K = Integer . parseInt ( input ( ) ) ;
int [ ] A = list ( Integer . parseInt ( input ( ) ) ) ;
final int DIGIT = 50 ;
int [ ] bitCounts = new int [ DIGIT ] ;
for ( int a = 0 ;
a < A . length ;
a ++ ) bitCounts [ a ] = bitCounts [ a ] ;
for ( int d = 0 ;
d < DIGIT ;
d ++ ) bitCounts [ d ] = bitCounts [ d ] = Integer . parseInt ( input ( ) ) ;
int [ ] [ ] dp = new int [ 2 ] [ DIGIT + 1 ] ;
for ( int d = 0 ;
d < dp . length ;
d ++ ) {
  int k = getBit ( K , d ) ;
  dp [ d ] [ 0 ] = Math . max ( dp [ d ] [ 0 ] , dp [ d + 1 ] [ 0 ] + xor ( bit ( k , d ) ) ) ;
  if ( k == 1 ) dp [ d ] [ 1 ] = Math . max ( dp [ d ] [ 1 ] , dp [ d + 1 ] [ 0 ] + xor ( bit ( 0 , d ) ) ) ;
  dp [ d ] [ 1 ] = Math . max ( dp [ d ] [ 1 ] , dp [ d + 1 ] [ 1 ] + xor ( bit ( 1 , d ) ) ) ;
}
System . out . println ( max ( dp [ 0 ] ) ) ;
return N ;
}
