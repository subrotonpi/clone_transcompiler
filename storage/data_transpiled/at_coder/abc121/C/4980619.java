public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < List < Integer >> AB = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) AB . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  Collections . sort ( AB , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
      return o1 . get ( 0 ) . compareTo ( o2 . get ( 0 ) ) ;
    }
  }
  ) ;
  int total = 0 ;
  int i = 0 ;
  do {
    total += AB . get ( i ) . get ( 1 ) ;
    if ( total < M ) i ++ ;
    else break ;
  }
  while ( total < M ) ;
  int ans = 0 ;
  for ( int j = 0 ;
  j < i ;
  j ++ ) ans += AB . get ( j ) . get ( 0 ) * AB . get ( j ) . get ( 1 ) ;
  System . out . println ( ans ) ;
}
