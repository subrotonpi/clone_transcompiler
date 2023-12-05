, n = Integer . MAX_VALUE ) ;
x = Integer . MAX_VALUE ;
m = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) m [ i ] = Integer . parseInt ( input ( ) ) ;
System . out . println ( n + ( x - sum ( m ) ) / min ( m ) ) ;
}
