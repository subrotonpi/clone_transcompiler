public static double input ( ) {
  String s = input ;
  ArrayList < String > L = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ! s . equals ( "" ) ) {
      L . add ( s . substring ( i , i + 1 ) ) ;
    }
  }
  double ans = Double . MAX_VALUE ;
  if ( L . size ( ) == 1 ) {
    System . out . println ( 0 ) ;
  }
  else {
    for ( int i = 0 ;
    i < L . size ( ) ;
    i ++ ) {
      String k = s ;
      int sub = 0 ;
      boolean flag = false ;
      while ( flag == false ) {
        String cur = "" ;
        int cnt = 0 ;
        for ( int j = k . length ( ) - 2 ;
        j >= 0 ;
        j -- ) {
          if ( cnt == cur . length ( ) ) {
            if ( k . charAt ( j ) == L . get ( i ) ) {
              cur = L . get ( i ) * 2 + cur ;
            }
            else {
              cur = k . charAt ( j ) + cur ;
            }
          }
          else {
            if ( k . charAt ( j ) == L . get ( i ) ) {
              cur = L . get ( i ) + cur ;
            }
            else {
              null ;
            }
          }
          cnt ++ ;
        }
        double check = L . get ( i ) * cur . length ( ) ;
        sub ++ ;
        if ( check == cur ) {
          if ( sub <= ans ) {
            ans = sub ;
          }
          flag = true ;
        }
        else {
          k = cur ;
        }
      }
    }
    System . out . println ( ans ) ;
  }
  return ans ;
}
