public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  List < List < Integer >> WH = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    WH . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  WH = new ArrayList < > ( WH ) ;
  WH . sort ( Comparator . comparing ( List :: get ) ) ;
  class FenwickTree {
    int size ;
    int [ ] tree = new int [ size ] ;
    public void update ( int index , int value ) {
      int x = index ;
      while ( x < size ) {
        if ( tree [ x ] < value ) {
          tree [ x ] = value ;
        }
        else {
          return ;
        }
        x |= x + 1 ;
      }
    }
  }
  FenwickTree ft = new FenwickTree ( 10 * 5 + 1 ) ;
  for ( List < Integer > p : WH ) {
    int ftv = ft . maximum ( p . get ( 1 ) ) + 1 ;
    ft . update ( p . get ( 1 ) , ftv ) ;
  }
  System . out . println ( ft . maximum ( 10 * 5 + 1 ) ) ;
}
