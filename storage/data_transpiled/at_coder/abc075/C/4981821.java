public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < List < Integer >> ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    ab . add ( Collections . singletonList ( input ) ) ;
  }
  int [ ] [ ] ad = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ad [ i ] [ 0 ] = 0 ;
  }
  for ( List < Integer > x : ab ) {
    ad [ x . get ( 0 ) - 1 ] [ x . get ( 1 ) - 1 ] = 1 ;
    ad [ x . get ( 1 ) - 1 ] [ x . get ( 0 ) - 1 ] = 1 ;
  }
  int [ ] nodes = new int [ n ] ;
  int ans = 0 ;
  boolean flag = true ;
  while ( flag ) {
    flag = false ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( nodes [ i ] == 0 && Integer . bitCount ( ad [ i ] ) == 1 ) {
        ans ++ ;
        nodes [ i ] = 1 ;
        flag = true ;
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( ad [ i ] [ j ] == 1 ) ad [ j ] [ i ] = 0 ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
}
