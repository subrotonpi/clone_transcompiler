public static int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] a ;
int N = Integer . parseInt ( input [ 0 ] [ 0 ] ) , C = Integer . parseInt ( input [ 1 ] [ 0 ] ) ;
List < List < Integer >> D = Arrays . asList ( Lists . newArrayList ( ) ) ;
for ( int i = 0 ;
i < C ;
i ++ ) D . add ( Lists . newArrayList ( ) ) ;
List < List < Integer >> grid = Lists . newArrayList ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) grid . add ( Lists . newArrayList ( ) ) ;
int [ ] [ ] [ ] [ ] a = new int [ C ] [ N ] [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) for ( int j = 0 ;
j < N ;
j ++ ) a [ ( i + j ) % 3 ] [ grid . get ( i ) . get ( j ) - 1 ] ++ ;
int [ ] [ ] [ ] [ ] b = new int [ C ] [ C ] [ N ] ;
for ( int i = 0 ;
i < C ;
i ++ ) for ( int j = 0 ;
j < C ;
j ++ ) b [ i ] [ j ] = Arrays . stream ( D ) . reduce ( a [ i ] [ j ] , ( i , j ) -> i * j ) ;
Arrays . sort ( b [ i ] ) ;
int ans = 10 * 10 ;
for ( int i = 0 ;
i < 3 ;
i ++ ) for ( int j = 0 ;
j < 3 ;
j ++ ) for ( int k = 0 ;
k < 3 ;
k ++ ) if ( b [ 0 ] [ i ] [ 1 ] != b [ 1 ] [ j ] [ 1 ] && b [ 1 ] [ j ] [ 1 ] != b [ 2 ] [ k ] [ 1 ] && b [ 2 ] [ k ] [ 1 ] != b [ 0 ] [ i ] [ 1 ] ) ans = Math . min ( ans , b [ 0 ] [ i ] [ 0 ] + b [ 1 ] [ j ] [ 0 ] + b [ 2 ] [ k ] [ 0 ] ) ;
return ans ;
}
