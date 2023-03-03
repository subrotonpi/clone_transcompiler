static final int n = Integer . parseInt ( input ) ;
int [ ] num = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  num [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
/* f */
int cou = 0 ;
for ( int j = 0 ;
j < n ;
j ++ ) {
  if ( num [ i ] % num [ j ] == 0 ) {
    cou ++ ;
  }
}
/* g */
int c = ( n / 2 + 1 ) * Math . factorial ( n ) / ( n + 1 ) ;
/* c */
char [ ] memo = new char [ n ] ;
for ( int i = 0 ;
i <= n ;
i ++ ) {
  int number = num [ i ] ;
  int yakusu = f ( number , num ) ;
  if ( memo [ yakusu ] != '#' ) {
    count += memo [ yakusu ] ;
  }
  else {
    char comb = g ( yakusu , n ) ;
    count += comb ;
    memo [ yakusu ] = comb ;
  }
}
int ans = count / ( Math . factorial ( n ) ) ;
System . out . println ( ans ) ;
return ans ;
}
