public static void input ( ) {
  T = input . nextInt ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int [ ] data = map . get ( ) ;
    int N = data [ 0 ] ;
    int Pd = data [ 1 ] ;
    int Pg = data [ 2 ] ;
    int gcd = 1 ;
    for ( int d = 2 ;
    d < 101 ;
    d ++ ) {
      if ( Pd % d == 0 && 100 % d == 0 ) gcd = d ;
    }
    boolean poss = true ;
    if ( ( 100 / gcd ) > N ) poss = false ;
    else if ( Pg == 100 && Pd < 100 ) poss = false ;
    else if ( Pg == 0 && Pd > 0 ) poss = false ;
    String ans = poss ? "Possible" : "Broken" ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
  }
}
