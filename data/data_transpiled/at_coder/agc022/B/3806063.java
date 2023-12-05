public static void print ( int n ) {
  int [ ] res ;
  if ( n == 3 ) {
    res = new int [ ] {
      2 , 5 , 63 }
      ;
    }
    else if ( n == 4 ) {
      res = new int [ ] {
        2 , 5 , 20 , 63 }
        ;
      }
      else if ( n == 5 ) {
        res = new int [ ] {
          2 , 5 , 20 , 30 , 63 }
          ;
        }
        else {
          res = Arrays . stream ( res ) . filter ( i -> i % 6 != 1 && i % 5 != 0 ) . limit ( n ) . toArray ( ) ;
          int s = Arrays . stream ( res ) . mapToInt ( i -> i ) . sum ( ) ;
          switch ( s % 6 ) {
            case 2 : res [ res . length - 1 ] = 2 ;
            res [ res . length - 1 ] = 30000 ;
            break ;
            case 3 : res [ res . length - 1 ] = 3 ;
            res [ res . length - 1 ] = 30000 ;
            break ;
            case 5 : res [ res . length - 1 ] = 29998 ;
            break ;
          }
        }
        System . out . println ( ( int [ ] ) res ) ;
      }
      