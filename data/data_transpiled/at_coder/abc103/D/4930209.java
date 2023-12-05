static final void heapSort ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] data = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    heapSort ( data , b , a ) ;
  }
  int cut = 0 ;
  int answer = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( cut <= a ) {
      answer ++ ;
      cut = b ;
    }
  }
  System . out . println ( answer ) ;
}
