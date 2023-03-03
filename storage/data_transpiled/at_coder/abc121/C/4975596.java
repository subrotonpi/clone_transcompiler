public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < List < Integer >> ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ab . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  Collections . sort ( ab , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  int total = 0 ;
  int i = 0 ;
  do {
    total += ab . get ( i ) . get ( 1 ) ;
  }
  while ( total < m ) ;
  if ( total < m ) {
    i ++ ;
  }
  else {
    break ;
  }
  int ans = 0 ;
  for ( int j = 0 ;
  j < i ;
  j ++ ) {
    ans += ab . get ( j ) . get ( 1 ) * ab . get ( j ) . get ( 0 ) ;
  }
  ans += ( m - sum ( ab . get ( p ) . get ( 1 ) ) ) * ab . get ( i ) . get ( 0 ) ;
  System . out . println ( ans ) ;
}
