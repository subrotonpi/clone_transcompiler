public static int input ( ) {
  String S = input ( ) ;
  StringBuilder A = new StringBuilder ( ) ;
  for ( int i = Character . MIN_VALUE ;
  i <= Character . MAX_VALUE ;
  i ++ ) {
    A . append ( ( char ) i ) ;
  }
  String ans ;
  if ( S . length ( ) < 26 ) {
    for ( int i = 0 ;
    i < A . length ( ) ;
    i ++ ) {
      if ( ! A . charAt ( i ) . equals ( S ) ) {
        ans = S + A . charAt ( i ) ;
        break ;
      }
    }
  }
  else if ( S . equals ( "" ) ) {
    ans = - 1 ;
  }
  else {
    ArrayList < String > B = new ArrayList < String > ( ) ;
    for ( int i = 0 ;
    i < A . length ( ) - 1 ;
    i ++ ) {
      String right = S . substring ( A . length ( ) - 1 - i ) ;
      String left = S . substring ( A . length ( ) - 1 - ( i + 1 ) ) ;
      B . add ( right ) ;
      if ( left . compareTo ( right ) < 0 ) {
        String last = "z" ;
        for ( String b : B ) {
          if ( left . compareTo ( b ) > 0 ) continue ;
          last = Math . min ( last , b ) ;
        }
        ans = S . substring ( 0 , S . length ( ) - 1 - ( i + 1 ) ) + last ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans . length ( ) ;
}
