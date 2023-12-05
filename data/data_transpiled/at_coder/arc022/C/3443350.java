@ VisibleForTesting static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] G = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    a = a - 1 ;
    b = b - 1 ;
    G [ a ] [ b ] = b ;
    G [ b ] [ a ] = a ;
  }
  final double INF = Double . POSITIVE_INFINITY ;
  int [ ] d = new int [ N ] ;
  boolean [ ] used = new boolean [ N ] ;
  Deque < Integer > que = new LinkedList < Integer > ( ) ;
  que . add ( 0 ) ;
  d [ 0 ] = 0 ;
  int [ ] ma = {
    0 , 0 }
    ;
    while ( que . size ( ) > 0 ) {
      int v = que . poll ( ) ;
      if ( used [ v ] ) continue ;
      used [ v ] = true ;
      for ( int w : G [ v ] ) {
        if ( d [ w ] > d [ v ] + 1 ) {
          d [ w ] = d [ v ] + 1 ;
          que . add ( w ) ;
          if ( d [ w ] > ma [ 0 ] ) {
            ma [ 0 ] = d [ w ] ;
            ma [ 1 ] = w ;
          }
        }
      }
    }
    used [ v ] = false ;
    que = new LinkedList < Integer > ( ) ;
    que . add ( ma [ 1 ] ) ;
    d = new int [ N ] ;
    d [ ma [ 1 ] ] = 0 ;
    int [ ] ma2 = {
      0 , ma [ 1 ] }
      ;
      while ( que . size ( ) > 0 ) {
        int v = que . poll ( ) ;
        if ( used [ v ] ) continue ;
        used [ v ] = true ;
        for ( int w : G [ v ] ) {
          if ( d [ w ] > d [ v ] + 1 ) {
            d [ w ] = d [ v ] + 1 ;
            que . add ( w ) ;
            if ( d [ w ] > ma2 [ 0 ] ) {
              ma2 [ 0 ] = d [ w ] ;
              ma2 [ 1 ] = w ;
            }
          }
        }
      }
      System . out . println ( ma [ 1 ] + 1 + "," + ma2 [ 1 ] + 1 ) ;
    }
    