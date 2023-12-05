static void print ( int n , int m ) {
  List < Tuple > l = new ArrayList < Tuple > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    l . add ( new Tuple ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Collections . sort ( l , new Comparator < Tuple > ( ) {
  }
  ) ;
  int dec = 0 ;
  int cur = 0 ;
  for ( Tuple i : l ) {
    if ( i . x < cur && cur <= i . y ) {
      continue ;
    }
    else {
      dec ++ ;
      cur = i . x ;
    }
  }
  System . out . println ( dec ) ;
}
