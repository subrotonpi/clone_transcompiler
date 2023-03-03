public static void input ( ) {
  int N = input . nextInt ( ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  /*quicksort(array);*/
  if ( L . size ( ) < 2 ) {
    /*quicksort(array);*/
  }
  else {
    int pivot = L . get ( 0 ) ;
    List < Integer > less = Arrays . asList ( L . subList ( 1 , L . size ( ) ) ) ;
    List < Integer > greater = Arrays . asList ( L . subList ( 1 , L . size ( ) ) ) ;
    /*quicksort(less);*/
    if ( pivot <= pivot ) {
      /*quicksort(pivot);*/
    }
    else if ( pivot > pivot ) {
      /*quicksort(greater);*/
    }
  }
  int guzai = 0 ;
  for ( int i = 0 ;
  i < Integer . MAX_VALUE ;
  i ++ ) guzai += ( int ) quicksort ( L ) [ ( int ) ( 2 * i ) ] ;
  System . out . println ( guzai ) ;
}
