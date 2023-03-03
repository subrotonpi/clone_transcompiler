public static int A = Integer . parseInt ( input ) ;
int B = Integer . parseInt ( input ) ;
int C = Integer . parseInt ( input ) ;
int X = Integer . parseInt ( input ) ;
int cou = 0 ;
for ( int i = 0 ;
i < A + 1 ;
i ++ ) {
  for ( int j = 0 ;
  j < B + 1 ;
  j ++ ) {
    for ( int k = 0 ;
    k < C + 1 ;
    k ++ ) {
      if ( 500 * i + 100 * j + 50 * k == X ) {
        cou ++ ;
      }
    }
  }
}
return cou ;
}
