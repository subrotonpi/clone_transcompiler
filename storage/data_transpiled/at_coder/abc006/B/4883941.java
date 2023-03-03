public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] list1 = {
    0 , 0 , 1 }
    ;
    if ( n == 1 || n == 2 ) {
      System . out . println ( 0 ) ;
    }
    else if ( n == 3 ) {
      System . out . println ( 1 ) ;
    }
    else {
      for ( int i = 0 ;
      i < n - 3 ;
      i ++ ) {
        int newn = ( list1 [ i ] + list1 [ i + 1 ] + list1 [ i + 2 ] ) % 10007 ;
        list1 [ i ] = newn ;
      }
      System . out . println ( list1 [ list1 . length - 1 ] ) ;
    }
  }
  