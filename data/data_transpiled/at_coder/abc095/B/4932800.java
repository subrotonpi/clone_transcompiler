, N = N , X = X ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  m [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
System . out . println ( ( X - sum ( m ) ) / min ( m ) + N ) ;
}
