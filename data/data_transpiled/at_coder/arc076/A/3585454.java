static final int N = Integer . parseInt ( input ) ;
int M = Integer . parseInt ( input . nextLine ( ) ) ;
if ( Math . abs ( N - M ) > 1 ) {
  System . out . println ( 0 ) ;
}
else if ( N == M ) {
  System . out . println ( ( 2 * ( Math . factorial ( N ) * Math . factorial ( M ) ) ) % 1000000007 ) ;
}
else {
  System . out . println ( ( ( Math . factorial ( N ) * Math . factorial ( M ) ) ) % 1000000007 ) ;
}
return N ;
}
