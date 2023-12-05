public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
    b [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c [ i ] = ( a [ i ] - b [ i ] ) ;
  }
  int [ ] [ ] d = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] [ 2 ] = ( a [ i ] - b [ i ] ) ;
  }
  Arrays . sort ( d , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  Arrays . sort ( d , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  int max = 0 ;
  int temp = 0 ;
  for ( int i = 0 ;
  i < d1 . length ;
  i ++ ) {
    temp += d1 [ i ] [ 0 ] ;
    if ( temp > max ) max = temp ;
    temp -= d1 [ i ] [ 1 ] ;
  }
  for ( int i = 0 ;
  i < d2 . length ;
  i ++ ) {
    temp += d2 [ i ] [ 0 ] ;
    if ( temp > max ) max = temp ;
  }
  System . out . println ( max ) ;
}
