public static void main ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , input . length ( ) ) ) ;
  int w = Integer . parseInt ( input . substring ( input . length ( ) , input . length ( ) ) ) ;
  int [ ] a = new int [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    a [ i ] = new LinkedList < String > ( ) ;
  }
  int [ ] delete = new int [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    if ( ! ( "#" . equals ( a [ i ] ) ) ) {
      delete [ i ] = i ;
    }
  }
  int diff = 0 ;
  for ( int i = 0 ;
  i < delete . length ;
  i ++ ) {
    System . arraycopy ( delete , 0 , a [ i ] , 0 , a [ i ] . length ( ) ) ;
    diff ++ ;
  }
  int [ ] bucket = new int [ a [ 0 ] . length ( ) ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < a [ 0 ] . length ( ) ;
    j ++ ) {
      if ( a [ i ] [ j ] . equals ( "#" ) ) {
        bucket [ j ] ++ ;
      }
    }
  }
  delete = new int [ bucket . length ] ;
  for ( int i = 0 ;
  i < bucket . length ;
  i ++ ) {
    if ( bucket [ i ] == 0 ) {
      delete [ i ] = i ;
    }
  }
  diff = 0 ;
  for ( int i = 0 ;
  i < delete . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < a . length ;
    j ++ ) {
      System . arraycopy ( delete [ i ] , 0 , a [ j ] , 0 , a [ i ] . length ( ) ) ;
    }
    diff ++ ;
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    String temp = new String ( a [ i ] ) ;
    System . out . println ( temp ) ;
  }
}
