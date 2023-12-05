public static int [ ] nagase ( int n ) {
  int m = n ;
  int r = n % 8 ;
  int [ ] reg = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    reg [ i ] = i * 12 + 2 ;
    reg [ i ] = i * 12 + 3 ;
    reg [ i ] = i * 12 + 4 ;
    reg [ i ] = i * 12 + 6 ;
    reg [ i ] = i * 12 + 8 ;
    reg [ i ] = i * 12 + 9 ;
    reg [ i ] = i * 12 + 10 ;
    reg [ i ] = i * 12 + 12 ;
  }
  switch ( r ) {
    case 1 : reg [ m ] = m * 12 + 6 ;
    break ;
    case 2 : reg [ ( m ) * 12 + 2 ] = ( m ) * 12 + 2 ;
    reg [ ( m ) * 12 + 4 ] = ( m ) * 12 + 4 ;
    break ;
    case 3 : if ( m == 0 ) {
      reg = new int [ ] {
        2 , 5 , 63 }
        ;
      }
      else {
        reg [ ( m ) * 12 + 2 ] = ( m ) * 12 + 2 ;
        reg [ ( m ) * 12 + 4 ] = ( m ) * 12 + 6 ;
      }
      break ;
      case 4 : if ( m == 0 ) {
        reg = new int [ ] {
          2 , 5 , 20 , 63 }
          ;
        }
        else {
          reg [ ( m ) * 12 + 2 ] = ( m ) * 12 + 2 ;
          reg [ ( m ) * 12 + 4 ] = ( m ) * 12 + 4 ;
          reg [ ( m ) * 12 + 6 ] = ( m ) * 12 + 8 ;
          reg [ ( m ) * 12 + 12 ] = ( m ) * 12 + 10 ;
        }
        break ;
        case 5 : reg [ ( m ) * 12 + 2 ] = ( m ) * 12 + 3 ;
        reg [ ( m ) * 12 + 4 ] = ( m ) * 12 + 4 ;
        reg [ ( m ) * 12 + 6 ] = ( m ) * 12 + 8 ;
        reg [ ( m ) * 12 + 12 ] = ( m ) * 12 + 10 ;
        break ;
      }
      return reg ;
    }
    