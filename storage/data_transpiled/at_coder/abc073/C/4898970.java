, n = n ) ;
c = new HashMap ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( c . containsKey ( a ) ) c . remove ( a ) ;
  else c . put ( a , 1 ) ;
}
System . out . println ( c . size ( ) ) ;
}
