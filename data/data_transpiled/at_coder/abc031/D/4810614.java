public static void main ( String input , int k , int n ) {
  String [ ] [ ] vw = new String [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String a = input . substring ( 0 , i ) ;
    String b = input . substring ( i + 1 ) ;
    vw [ i ] = new String [ ] [ ] {
      Lists . newArrayList ( Integer . parseInt ( a ) - 1 ) , Lists . newArrayList ( Integer . parseInt ( b ) ) }
      ;
    }
    int [ ] d = new int [ k ] ;
    while ( true ) {
      for ( int i = 0 ;
      i < k - 1 ;
      i ++ ) {
        if ( d [ i ] == 3 ) {
          d [ i ] = 0 ;
          d [ i + 1 ] ++ ;
        }
      }
      else {
        if ( d [ k - 1 ] >= 3 ) {
          break ;
        }
      }
    }
    char [ ] [ ] c = new char [ k ] [ ] ;
    for ( int i = 0 ;
    i < k ;
    i ++ ) {
      char [ ] v = vw [ i ] ;
      char [ ] w = v ;
      int p = 0 ;
      for ( int x = 0 ;
      x < v . length ;
      x ++ ) {
        if ( p + d [ x ] >= w . length ) {
          flag = 1 ;
          break ;
        }
        else if ( c [ x ] . length > 0 ) {
          if ( new String ( c [ x ] ) . compareTo ( new String ( w , p , d [ x ] + 1 ) ) != 0 ) {
            flag = 1 ;
            break ;
          }
        }
        else {
          c [ x ] = new char [ w . length ] ;
          System . arraycopy ( w , p , c [ x ] , 0 , w . length ) ;
        }
        p += d [ x ] + 1 ;
      }
      if ( p != w . length ) {
        flag = 1 ;
        break ;
      }
      else if ( flag == 1 ) {
        break ;
      }
    }
    if ( flag == 0 ) {
      break ;
    }
    d [ 0 ] ++ ;
  }
  for ( char [ ] x : c ) {
    System . out . println ( new String ( x ) ) ;
  }
  