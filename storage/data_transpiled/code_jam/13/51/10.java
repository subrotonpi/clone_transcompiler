public static int WRONG = false ;
int c , m ;
int b = 0 ;
int gain = 0 ;
int ret ;
for ( int i = 0 ;
i < c ;
i ++ ) b += m - Xs [ i ] ;
gain = b ;
for ( int i = c ;
i < Xs . length ;
i ++ ) if ( Xs [ i ] <= m ) b += m + 1 - Xs [ i ] ;
if ( b > B ) return WRONG ;
return 36 * gain / c - b ;
/* solve */
B = Integer . parseInt ( input ( ) ) ;
N = Integer . parseInt ( input ( ) ) ;
Arrays . sort ( Xs ) ;
Arrays . sort ( Xs ) ;
int ans = 0 ;
for ( int i = 1 ;
i < 38 ;
i ++ ) {
  int l = Math . max ( 1 , Xs [ i - 1 ] ) - 1 ;
  int r = B + Xs [ 36 ] + 1 ;
  while ( l + 1 < r ) {
    m = ( l + r ) / 2 ;
    ret = comp ( i , m ) ;
    if ( ret == WRONG ) r = m ;
    else {
      ans = Math . max ( ans , ret ) ;
      if ( m + 1 == r ) break ;
      int ret2 = comp ( i , m + 1 ) ;
      if ( ret2 == WRONG ) r = m ;
      else if ( ret < ret2 ) l = m ;
      else r = m ;
    }
  }
}
int T = Integer . parseInt ( input ( ) ) ;
for ( int tn = 0 ;
tn < T ;
tn ++ ) {
  System . out . println ( "Case #" + ( tn + 1 ) + ": " + solve ( ) ) ;
}
return ans ;
}
