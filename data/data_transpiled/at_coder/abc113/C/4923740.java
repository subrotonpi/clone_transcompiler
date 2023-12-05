public static int [ ] [ ] getM ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > [ ] p = new LinkedList [ n ] ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    Integer a = new Integer ( input . nextLine ( ) ) ;
    a . add ( i ) ;
    p [ i ] = a ;
  }
  Arrays . sort ( p ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int cnt ;
    if ( i == 0 || p [ i ] . getFirst ( ) != p [ i - 1 ] . getFirst ( ) ) cnt = 1 ;
    else cnt ++ ;
    p [ i ] [ 2 ] = cnt ;
  }
  Arrays . sort ( p , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    System . out . println ( p [ i ] [ 0 ] + " " + p [ i ] [ 3 ] ) ;
  }
  return p ;
}
