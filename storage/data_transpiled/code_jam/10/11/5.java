@ Function public static String from ( ) {
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int c = 1 ;
  c <= t ;
  c ++ ) {
    String n = input . nextLine ( ) ;
    String k = input . nextLine ( ) ;
    n = Integer . parseInt ( n ) ;
    k = Integer . parseInt ( k ) ;
    String g [ ] [ ] = new String [ n ] [ k ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String l = input . nextLine ( ) ;
      l = l . replace ( "." , "" ) ;
      while ( l . length ( ) < n ) l = "." + l ;
      g [ i ] [ j ] = l ;
    }
    HashMap < String , Boolean > q = new HashMap < String , Boolean > ( ) ;
    q . put ( "R" , false ) ;
    q . put ( "B" , false ) ;
    q . put ( "." , false ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        for ( int di = - 1 ;
        di <= 2 ;
        di ++ ) {
          for ( int dj = - 1 ;
          dj <= 2 ;
          dj ++ ) {
            if ( di > 0 || dj > 0 ) {
              boolean ok = true ;
              int x = i ;
              int y = j ;
              for ( int kk = 0 ;
              kk < k - 1 ;
              kk ++ ) {
                x += di ;
                y += dj ;
                if ( x < 0 || y < 0 || x >= n || y >= n || g [ x ] [ y ] != g [ i ] [ j ] ) {
                  ok = false ;
                  break ;
                }
              }
              if ( ok ) q . put ( g [ i ] [ j ] , true ) ;
            }
          }
        }
      }
    }
    String str ;
    if ( q . get ( "R" ) && q . get ( "B" ) ) str = "Both" ;
    else if ( q . get ( "R" ) ) str = "Red" ;
    else if ( q . get ( "B" ) ) str = "Blue" ;
    else str = "Neither" ;
    System . out . println ( "Case #" + c + ": " + str ) ;
  }
  return "" ;
}
