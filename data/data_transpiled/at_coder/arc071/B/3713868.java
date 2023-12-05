public static int countMethod ( int m , int k ) {
  return k * ( m - k + 1 ) ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int M = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] x = new int [ N ] ;
int [ ] y = new int [ M ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  x [ i ] = i ;
}
Arrays . sort ( x ) ;
Arrays . sort ( y ) ;
int xLineSum = 0 ;
int yLineSum = 0 ;
for ( int i = 0 ;
i < M - 1 ;
i ++ ) {
  xLineSum += ( countMethod ( N - 1 , Math . min ( i + 1 , N - 1 - i ) ) * ( x [ i + 1 ] - x [ i ] ) ) % ( 10 * 9 + 7 ) ;
}
return 0 ;
}
