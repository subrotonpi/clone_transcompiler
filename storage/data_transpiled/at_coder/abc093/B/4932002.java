public static void input ( ) {
  lists = input . split ( " " ) ;
  int a = Integer . parseInt ( lists [ 0 ] ) ;
  int b = Integer . parseInt ( lists [ 1 ] ) ;
  int x = Integer . parseInt ( lists [ 2 ] ) * 2 ;
  int [ ] answer = new int [ x ] ;
  int next = 0 ;
  for ( int num = 0 ;
  ( next = x ) != 0 ;
  ) {
    if ( ( a == b ) && ( b == a ) ) {
      answer [ next ++ ] = a ;
      break ;
    }
    answer [ next ++ ] = a ;
    answer [ next ++ ] = b ;
    b -- ;
    if ( ( answer . length >= x ) || ( a > b ) || ( b < 0 ) ) {
      break ;
    }
    if ( ( a == b ) && ( b == a ) ) {
      answer [ next ++ ] = a ;
      if ( ( a + num < b - num ) && ( b < a ) ) {
        for ( int bNum = b ;
        bNum < a ;
        bNum ++ ) {
          answer [ next ++ ] = bNum ;
          if ( ( answer . length > x ) && ( b == b ) ) {
            break ;
          }
        }
      }
      else if ( ( a + num > b - num ) && ( b < a ) ) {
        for ( int aNum = a ;
        aNum < b ;
        aNum ++ ) {
          answer [ next ++ ] = aNum ;
          if ( ( answer . length > x ) && ( b == a ) ) {
            break ;
          }
        }
      }
      break ;
    }
  }
  Arrays . sort ( answer ) ;
  for ( int a : answer ) {
    System . out . println ( a ) ;
  }
}
