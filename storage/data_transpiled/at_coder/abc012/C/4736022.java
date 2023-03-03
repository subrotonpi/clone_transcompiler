public static int max = 2025 ;
int kuku = Integer . parseInt ( input . nextLine ( ) ) ;
int diff = max - kuku ;
for ( int i = 1 ;
i <= 10 ;
i ++ ) {
  if ( i * 9 < diff || diff < i ) {
    continue ;
  }
  for ( int j = 1 ;
  j <= 10 ;
  j ++ ) {
    if ( i * j == diff ) {
      System . out . println ( i + " x " + j ) ;
    }
  }
}
