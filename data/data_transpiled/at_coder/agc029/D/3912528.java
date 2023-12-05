public static int X , int Y , int N = Integer . parseInt ( input ) {
  List < int [ ] > l = new ArrayList < int [ ] > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    l . add ( new int [ ] {
      x , y }
      ) ;
    }
    Collections . sort ( l ) ;
    int cnt = 0 ;
    int ans = 0 ;
    for ( int [ ] i : l ) {
      if ( i [ 0 ] > i [ 1 ] + cnt ) {
        ans = i [ 0 ] ;
        break ;
      }
      else if ( i [ 0 ] == i [ 1 ] + cnt ) {
        cnt ++ ;
      }
    }
    if ( ans != 0 ) {
      System . out . println ( ans - 1 ) ;
    }
    else {
      System . out . println ( X ) ;
    }
    return ans ;
  }
  