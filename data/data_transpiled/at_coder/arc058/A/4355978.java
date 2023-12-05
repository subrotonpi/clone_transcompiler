, n = Integer . parseInt ( input . nextLine ( ) ) , k = Integer . parseInt ( input . nextLine ( ) ) ;
HashSet < Integer > ds = new HashSet < Integer > ( ) ;
for ( int ans = n ;
ans < 100000 ;
ans ++ ) {
  if ( new HashSet < Integer > ( String . valueOf ( ans ) ) . contains ( ds ) ) {
    break ;
  }
}
System . out . println ( ans ) ;
}
