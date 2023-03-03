public static String alphabet ( int n , int [ ] z ) throws IOException {
  int [ ] ans = new int [ n ] ;
  Arrays . fill ( ans , 0 ) ;
  ans [ ans . length - 1 ] = 1000000000 ;
  for ( int i : xrange ( n - 1 , - 1 , - 1 ) ) {
    boolean fir = true ;
    int firj = 0 ;
    for ( int j : xrange ( i ) ) {
      if ( z [ j ] == i ) {
        if ( fir ) {
          if ( i == n - 1 ) {
            ans [ j ] = ans [ i ] ;
          }
          else {
            int h = ans [ z [ i ] ] - ans [ i ] ;
            int w = z [ i ] - i ;
            int v = i - j ;
            ans [ j ] = ans [ i ] - ( h * v + w - 1 ) / w ;
          }
          fir = false ;
          firj = j ;
        }
        else {
          if ( i == n - 1 ) {
            ans [ j ] = ans [ i ] - 1 ;
          }
          else {
            int h = ans [ i ] - ans [ firj ] ;
            int w = i - firj ;
            int v = i - j ;
            ans [ j ] = ans [ i ] - ( h * v + w ) / w ;
          }
        }
      }
    }
    boolean ver = true ;
    for ( int i = 0 ;
    i < xrange ( n - 1 ) ;
    i ++ ) {
      int see = i + 1 ;
      for ( int j : xrange ( i + 2 , n ) ) {
        if ( ( ans [ j ] - ans [ i ] ) * ( see - i ) > ( ans [ see ] - ans [ i ] ) * ( j - i ) ) {
          see = j ;
        }
      }
      if ( see != z [ i ] ) {
        ver = false ;
        break ;
      }
    }
    int m = Math . min ( ans . length , n ) ;
    if ( m < 0 || ! ver ) {
      return "Impossible" ;
    }
    else {
      StringBuilder ansBuilder = new StringBuilder ( ) ;
      for ( int y : ans ) {
        ansBuilder . append ( y - m ) ;
      }
      return ansBuilder . toString ( ) ;
    }
  }
  if ( className . equals ( "java.util.Scanner" ) ) {
    BufferedReader fn = new BufferedReader ( new FileReader ( "C-small-attempt1.in" ) ) ;
    int tcase = Integer . parseInt ( fn . readLine ( ) ) ;
    for ( int