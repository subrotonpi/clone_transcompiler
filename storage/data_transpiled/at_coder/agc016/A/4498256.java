static final String [ ] copyStrings ( ) {
  final String S = list ( input ( ) ) ;
  int ans = 1000 ;
  final String A [ ] = {
    "a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j" , "k" , "l" , "m" , "n" , "o" , "p" , "q" , "r" , "s" , "t" , "u" , "v" , "w" , "x" , "y" , "z" }
    ;
    List < String > Li = null ;
    List < String > li = null ;
    for ( int i = 0 ;
    i < 26 ;
    i ++ ) {
      li = new ArrayList < > ( S ) ;
      if ( li . indexOf ( A [ i ] ) == li . size ( ) ) {
        System . out . println ( 0 ) ;
        exit ( ) ;
      }
      else {
        Li = new ArrayList < > ( li ) ;
        li = new ArrayList < > ( ) ;
        for ( int k = 0 ;
        k < S . length ( ) ;
        k ++ ) {
          for ( int j = 0 ;
          j < Li . size ( ) - 1 ;
          j ++ ) {
            if ( Li . get ( j ) . equals ( A [ i ] ) || Li . get ( j + 1 ) . equals ( A [ i ] ) ) {
              li . add ( A [ i ] ) ;
            }
            else {
              li . add ( "1" ) ;
            }
          }
          if ( li . indexOf ( A [ i ] ) == li . size ( ) ) {
            if ( ans > S . length ( ) - li . size ( ) ) {
              ans = S . length ( ) - li . size ( ) ;
            }
            break ;
          }
          else {
            Li = new ArrayList < > ( li ) ;
            li = new ArrayList < > ( li ) ;
          }
        }
      }
    }
    System . out . println ( ans ) ;
    return Li ;
  }
  