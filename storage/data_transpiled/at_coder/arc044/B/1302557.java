, N = N , * A = map ( Integer . parseInt , open ( 0 ) . read ( ) ) ;
C = new int [ N ] ;
M = 10 * * 9 + 7 ;
r = 1 ;
for ( int e : A ) C [ e ] ++ ;
for ( int i = 1 ;
i < N ;
i ++ ) r = r * pow ( pow ( 2 , C [ i - 1 ] , M ) - 1 , C [ i ] , M ) * pow ( 2 , C [ i ] * ~ - C [ i ] / 2 , M ) % M ;
System . out . println ( A [ 0 ] > 0 || A . count ( 0 ) > 1 ? r : r ) ;
}
