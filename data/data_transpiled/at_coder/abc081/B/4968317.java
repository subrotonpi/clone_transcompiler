public static void input ( ) {
  int N = input . nextInt ( ) ;
  List < Integer > list = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    list . add ( i ) ;
  }
  int counter = 0 ;
  while ( Arrays . binarySearch ( list , list ) > 0 ) {
    counter ++ ;
    for ( int k = 0 ;
    k < Integer . MAX_VALUE ;
    k ++ ) {
      int a = list . get ( k ) / 2 ;
      list . set ( k , a ) ;
    }
  }
  System . out . println ( counter ) ;
}
