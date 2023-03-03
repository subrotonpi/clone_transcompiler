, N = N , X = X ;
m = [ ] ;
for ( int i = 0 ;
i < N ;
i ++ ) m . append ( Integer . parseInt ( input . nextLine ( ) ) ) ;
System . out . println ( ( X - sum ( m ) ) / min ( m ) + N ) ;
}
