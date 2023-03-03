public static int gcd ( int a , int b ) {
  if ( b == 0 ) {
    return a ;
  }
  else {
    return gcd ( b , a % b ) ;
  }
  int test = Integer . parseInt ( readLine ( ) ) ;
  for ( int i = xrange ( 1 , test + 1 ) ;
  i <= xrange ( test ) ;
  i ++ ) {
    String lista = readLine ( ) ;
    final int n = lista . length ( ) ;
    int x = Integer . parseInt ( lista . substring ( 0 , n ) ) ;
    int y = Integer . parseInt ( lista . substring ( n , n + 1 ) ) ;
    lista = readLine ( ) ;
    int res = - 1 ;
    for ( int wynik = xrange ( x , y + 1 ) ;
    i <= xrange ( y ) ;
    i ++ ) {
      boolean ok = true ;
      for ( String liczba : lista . substring ( 0 , n ) . split ( "\\s" ) ) {
        int licz = Integer . parseInt ( liczba ) ;
        if ( licz % wynik != 0 && wynik % licz != 0 ) {
          ok = false ;
          break ;
        }
      }
      if ( ok ) {
        res = wynik ;
        break ;
      }
    }
    if ( res == - 1 ) {
      System . out . println ( "Case #" + i + ": NO" ) ;
    }
    else {
      System . out . println ( "Case #" + i + ": " + res ) ;
    }
  }
  return res ;
}
