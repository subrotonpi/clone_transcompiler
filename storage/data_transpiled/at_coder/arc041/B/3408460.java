public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] [ ] list1 = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String b = input . nextLine ( ) ;
    int [ ] [ ] list2 = new int [ M ] [ M ] ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      list2 [ j ] = new int [ ] {
        Integer . parseInt ( b . substring ( j , j + 1 ) ) , 0 }
        ;
      }
      list1 [ i ] = list2 ;
    }
    for ( int a = 0 ;
    a < N - 2 ;
    a ++ ) {
      for ( int b = 1 ;
      b < M - 1 ;
      b ++ ) {
        if ( list1 [ a ] [ b ] [ 0 ] >= 1 ) {
          list1 [ a + 1 ] [ b ] [ 1 ] += list1 [ a ] [ b ] [ 0 ] ;
          list1 [ a + 1 ] [ b - 1 ] [ 0 ] -= list1 [ a ] [ b ] [ 0 ] ;
          list1 [ a + 1 ] [ b + 1 ] [ 0 ] -= list1 [ a ] [ b ] [ 0 ] ;
          list1 [ a + 2 ] [ b ] [ 0 ] -= list1 [ a ] [ b ] [ 0 ] ;
          list1 [ a ] [ b ] [ 0 ] = 0 ;
        }
      }
    }
    for ( int x = 0 ;
    x < N ;
    x ++ ) {
      String ans = "" ;
      for ( int y = 0 ;
      y < M ;
      y ++ ) {
        ans = ans + list1 [ x ] [ y ] [ 1 ] ;
      }
      System . out . println ( ans ) ;
    }
  }
  