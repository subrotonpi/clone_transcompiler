public static List < Integer > num ( ) {
  for ( String _ : input . nextLine ( ) . split ( " " ) ) {
  }
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < 4 ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < 5 ;
      k ++ ) {
        ans . add ( num . get ( i ) + num . get ( j ) + num . get ( k ) ) ;
      }
    }
  }
  return ans ;
}
