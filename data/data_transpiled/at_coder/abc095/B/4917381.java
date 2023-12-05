, n = Integer . MAX_VALUE , x = Integer . MIN_VALUE ) ;
int [ ] m = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) m [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
int ans = n ;
x -= sum ( m ) ;
ans += ( x / min ( m ) ) ;
System . out . println ( ans ) ;
}
