public static int ans = 0 ;
int A = Integer . parseInt ( input . nextLine ( ) ) , B = Integer . parseInt ( input . nextLine ( ) ) ;
for ( int i = A ;
i <= B ;
i ++ ) {
  if ( String . valueOf ( i ) . charAt ( 0 ) == String . valueOf ( i ) . charAt ( i - 1 ) && String . valueOf ( i ) . charAt ( 1 ) == String . valueOf ( i ) . charAt ( i - 2 ) ) {
    ans ++ ;
  }
}
return ans ;
}
