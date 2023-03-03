public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] [ ] r = new int [ N ] [ 2 ] ;
  int [ ] [ ] b = new int [ N ] [ 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    r [ i ] [ 0 ] = Integer . parseInt ( input ) ;
    r [ i ] [ 1 ] = Integer . parseInt ( input ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    b [ i ] [ 0 ] = Integer . parseInt ( input ) ;
    b [ i ] [ 1 ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( r , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      return ( o2 . compareTo ( o1 ) ) ;
    }
  }
  ) ;
  Arrays . sort ( b , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      return ( o2 . compareTo ( o1 ) ) ;
    }
  }
  ) ;
  boolean [ ] rFlag = new boolean [ N ] ;
  boolean [ ] bFlag = new boolean [ N ] ;
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( r [ j ] [ 0 ] < b [ i ] [ 0 ] && r [ j ] [ 1 ] < b [ i ] [ 1 ] && ! rFlag [ j ] ) {
        rFlag [ j ] = true ;
        count ++ ;
        break ;
      }
    }
  }
  System . out . println ( count ) ;
}
