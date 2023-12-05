public static void xrange ( Scanner input ) {
  int T = input . nextInt ( ) ;
  int N = input . nextInt ( ) ;
  int [ ] [ ] L = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    L [ i ] = new int [ ] {
      b , a }
      ;
    }
    Arrays . sort ( L ) ;
    System . out . printf ( "Case #%d:%n" , T + 1 ) ;
    int s = 0 ;
    int n = 0 ;
    while ( L . length > 0 ) {
      if ( L [ 0 ] [ 0 ] <= s ) {
        int b = L [ 0 ] [ 0 ] ;
        int a = L [ 0 ] [ 1 ] ;
        s ++ ;
        if ( a != Integer . MIN_VALUE ) s ++ ;
        else {
          for ( int i = xrange ( L . length - 1 , - 1 , - 1 ) ;
          i >= 0 ;
          i -- ) {
            if ( L [ i ] [ 1 ] <= s ) {
              s ++ ;
              L [ i ] [ 1 ] = Double . MAX_VALUE ;
              break ;
            }
          }
          else {
            System . out . println ( "Too Bad" ) ;
            break ;
          }
        }
        n ++ ;
      }
      else System . out . println ( n ) ;
    }
  }
  