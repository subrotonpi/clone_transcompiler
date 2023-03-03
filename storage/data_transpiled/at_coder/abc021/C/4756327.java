static final int MOD = 10 * 9 + 7 ;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int a = Integer . parseInt ( input . nextLine ( ) ) ;
int b = Integer . parseInt ( input . nextLine ( ) ) ;
int M = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] [ ] adj = new int [ N ] [ N ] ;
for ( int i = 0 ;
i < M ;
i ++ ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  adj [ x ] [ y ] = adj [ y ] [ x ] = 1 ;
}
int [ ] adjIni = adj . length ;
while ( adj [ a ] [ b ] == 0 ) adj = new int [ ] {
}
;
System . out . println ( ( int ) ( adj [ a ] [ b ] ) % MOD ) ;
return 0 ;
}
