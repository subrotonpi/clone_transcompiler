public static void swap ( int a , int b , int [ ] arr ) {
  int tmp = arr [ a ] ;
  arr [ a ] = arr [ b ] ;
  arr [ b ] = tmp ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] P = new int [ N + 1 ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  P [ i ] = i < N ? i : 0 ;
}
