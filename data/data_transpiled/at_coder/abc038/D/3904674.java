static final String input ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int [ ] inpl = new int [ input . nextInt ( ) ] ;
  for ( int i = 0 ;
  i < inpl . length ;
  i ++ ) {
    inpl [ i ] = input . nextInt ( ) ;
  }
  return new Inpl ( ) {
    @ Override public int lis ( List < Integer > L ) {
      List < Integer > list = new ArrayList < > ( ) ;
      list . add ( L . get ( 0 ) ) ;
      for ( int i = 1 ;
      i < L . size ( ) ;
      i ++ ) {
        if ( list . get ( i ) < inpl [ i ] ) {
          list . add ( i ) ;
        }
        else {
          list . add ( i ) ;
        }
      }
    }
    return list . size ( ) ;
  }
  ;
}
