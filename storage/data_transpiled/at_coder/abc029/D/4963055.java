input ;
int keta = n . length ( ) ;
int [ ] [ ] dp = new int [ 2 ] [ keta + 1 ] ;
for ( int i = 0 ;
i < dp . length ;
i ++ ) {
  dp [ i ] [ i ] = new int [ 2 ] ;
}
/* Record the number of numbers */
if ( k == keta ) return sum ;
if ( dp [ k ] [ tight ] [ sum ] != - 1 ) return dp [ k ] [ tight ] [ sum ] ;
int max_j = tight > 0 ? Integer . parseInt ( n . substring ( k , k + 1 ) ) : 9 ;
int res = 0 ;
for ( int j = 0 ;
j < max_j + 1 ;
j ++ ) {
  res += rec ( k + 1 , tight > 0 && j == max_j , sum + ( int ) ( j == 1 ? 1 : 0 ) ) ;
}
dp [ k ] [ tight ] [ sum ] = res ;
return dp [ k ] [ tight ] [ sum ] ;
}
