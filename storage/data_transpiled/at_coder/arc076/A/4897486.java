static final int N = Integer . parseInt ( input ) ;
int M = Integer . parseInt ( input . nextLine ( ) ) ;
if ( Math . abs ( N - M ) != 0 && Math . abs ( M - N ) != 1 ) {
  System . out . println ( 0 ) ;
}
else {
  int x = Math . factorial ( N ) % ( 10 * * 9 + 7 ) ;
  int y = Math . factorial ( M ) % ( 10 * * 9 + 7 ) ;
  System . out . println ( ( ( 2 - Math . abs ( N - M ) ) * x * y ) % ( 10 * * 9 + 7 ) ) ;
}
return ( ( 2 - Math . abs ( N - M ) ) * x * y ) % ( 10 * * 9 + 7 ) ;
}
