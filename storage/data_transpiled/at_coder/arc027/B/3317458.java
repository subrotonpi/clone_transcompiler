static String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
{
  /* Find the parents of the graph */
  find ( parents . get ( p ) ) ;
  /* Union the parents of the graph */
  parents . put ( find ( parents . get ( p ) ) , find ( parents . get ( p ) ) ) ;
  /* Find the first element */
  int n = Integer . parseInt ( input ( ) ) ;
  String s1 = input ( ) ;
  String s2 = input ( ) ;
  Set < String > used = new HashSet < > ( ) ;
  for ( String c : s1 + s2 ) {
    if ( ABC . contains ( c ) ) {
      used . add ( c ) ;
    }
  }
  parents . clear ( ) ;
  for ( String a : used ) {
    parents . put ( a , a ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ABC . contains ( s1 . charAt ( i ) ) && ABC . contains ( s2 . charAt ( i ) ) ) {
      union ( parents . get ( s1 . charAt ( i ) ) , parents . get ( s2 . charAt ( i ) ) ) ;
    }
  }
  Set < String > groups = new HashSet < > ( ) ;
  for ( String g : used ) {
    groups . add ( find ( g ) ) ;
  }
  Map < String , Set < Integer >> possible = new HashMap < > ( ) ;
  for ( String c : new String [ ] {
    s1 . substring ( 0 , 1 ) , s2 . substring ( 0 , 1 ) }
    ) {
      if ( ABC . contains ( c ) ) {
        int g = find ( c ) ;
        possible . put ( g , new HashSet < > ( ) ) ;
      }
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ABC . contains ( s1 . substring ( i ) ) && ! ABC . contains ( s2 . substring ( i ) ) ) {
        possible . put ( find ( s1 . substring ( i ) ) , new HashSet < > ( ) ) ;
      }
      if ( ! ABC . contains ( s2 . substring ( i ) ) && ! ABC . contains ( s2 . substring ( i ) ) ) {
        possible . put ( find ( s2 . substring ( i ) ) , new HashSet < > ( ) ) ;
      }
    }
    int cnt = 1 ;
    for ( String g : groups ) {
      cnt *= possible . get ( g ) . size ( ) ;
    }
    System