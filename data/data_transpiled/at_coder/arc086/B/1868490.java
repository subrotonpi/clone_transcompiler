public static List < Point > getPoints ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ma = - 100000000 ;
  int mi = 100000000 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] > ma ) {
      ma = a [ i ] ;
      maIndex = i ;
    }
    if ( a [ i ] < mi ) {
      mi = a [ i ] ;
      miIndex = i ;
    }
  }
  List < Point > ans = new ArrayList < > ( ) ;
  if ( ma >= - mi ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      ans . add ( new Point ( maIndex , i ) ) ;
    }
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      ans . add ( new Point ( i , i + 1 ) ) ;
    }
  }
  else {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      ans . add ( new Point ( miIndex , i ) ) ;
    }
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      ans . add ( new Point ( n - 1 - i , n - 2 - i ) ) ;
    }
  }
  System . out . println ( ans . size ( ) ) ;
  for ( Point x : ans ) {
    System . out . println ( x . x + 1 + " " + x . y + 1 ) ;
  }
  return ans ;
}
