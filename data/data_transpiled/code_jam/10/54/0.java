public static int n = 0 ;
int b = 0 ;
HashSet < Integer > used = new HashSet < Integer > ( ) ;
int counter = 0 ;
{
  for ( int num = minnum ;
  num <= n ;
  num ++ ) {
    int [ ] rep = new int [ n ] ;
    int nnum = num ;
    while ( nnum > 0 ) {
      rep [ nnum ] = nnum % b ;
      nnum = nnum / b ;
    }
    boolean ok = true ;
    for ( int i = 0 ;
    i < rep . length ;
    i ++ ) {
      if ( used . contains ( new Integer ( i ) ) ) {
        ok = false ;
        break ;
      }
    }
    if ( ok ) {
      for ( int i = 0 ;
      i < rep . length ;
      i ++ ) {
        used . add ( new Integer ( i ) ) ;
      }
      if ( n - num == 0 ) {
        counter = counter + 1 ;
      }
      else {
        count ( n - num , num + 1 , b ) ;
      }
      for ( int i = 0 ;
      i < rep . length ;
      i ++ ) {
        used . remove ( new Integer ( i ) ) ;
      }
    }
  }
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    Arrays . fill ( br . split ( " " ) , Integer . valueOf ( i ) ) ;
    counter = 0 ;
    used . clear ( ) ;
    count ( n , 1 , b ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + counter ) ;
  }
  return counter ;
}
