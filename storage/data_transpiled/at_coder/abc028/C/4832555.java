public static List < Integer > ABCDE = Lists . newArrayList ( ) ;
for ( int i = 0 ;
i < ABCDE . length ;
i ++ ) {
  for ( int j = 0 ;
  j < ABCDE . length ;
  j ++ ) {
    if ( i == j ) {
      continue ;
    }
    for ( int k = 0 ;
    k < ABCDE . length ;
    k ++ ) {
      if ( j == k || i == k ) {
        continue ;
      }
    }
  }
}
