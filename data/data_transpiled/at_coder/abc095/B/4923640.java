, n = Integer . MAX_VALUE ) ;
int x = Integer . parseInt ( input . nextLine ( ) ) ;
m = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) m [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
System . out . println ( ( x - sum ( m ) ) / min ( m ) + n ) ;
}
