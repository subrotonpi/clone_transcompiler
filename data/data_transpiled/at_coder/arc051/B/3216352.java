public static int N = 40 ;
int K = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] F = new int [ N + 1 ] ;
for ( int i = 0 ;
i < F . length ;
i ++ ) {
  F [ i ] = F [ i - 1 ] + F [ i - 2 ] ;
}
return F [ K - 1 ] ;
}
