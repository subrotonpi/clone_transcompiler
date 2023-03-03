, N = N , X = X [ N ] ;
X = X [ N ] ;
m = [ ] ;
for ( int i = 0 ;
i < N ;
i ++ ) m . append ( Integer . parseInt ( input . nextLine ( ) ) ) ;
System . out . println ( ( int ) ( ( X - sum ( m ) ) / min ( m ) ) + N ) ;
}
