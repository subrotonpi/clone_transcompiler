@ Produces @ ApplicationScoped public static Object [ ] [ ] getAnswer ( ) {
  int x = 0 , y = 0 , c = 0 , d = 0 , e = 0 , f = 1 ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    if ( s . indexOf ( "Q" ) > 1 ) f = 0 ;
    else if ( s . contains ( "Q" ) ) {
      int n = s . indexOf ( "Q" ) ;
      x = i - n ;
      y = i + n ;
      c = n ;
      d = i ;
      e . add ( new Integer [ ] {
        i , n }
        ) ;
      }
    }
    if ( ArrayUtils . indexOf ( x , y ) != 3 ) f = 0 ;
    if ( f ) {
      /* We have to do this */
      int qx = 0 , qy = 0 , qc = 0 , qd = 0 ;
      for ( int i = 0 ;
      i < 8 ;
      i ++ ) {
        qx = i - x ;
        qy = i + y ;
        qc = j ;
        qd = i ;
      }
      qx = qx + x ;
      qy = qy + y ;
      qc = qc + c ;
      qd = qd + d ;
    }
    List < Integer > c2 = new ArrayList < > ( ) , d2 = new ArrayList < > ( ) , e2 = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < 8 ;
    i ++ ) {
      if ( ! c . contains ( i ) ) c2 . add ( i ) ;
      if ( ! d . contains ( i ) ) d2 . add ( i ) ;
    }
    for ( Integer i : c2 ) for ( int j : d2 ) e2 . add ( j , i ) ;
    for ( int i : e ) {
      if ( f ) {
        f = 1 ;
        break ;
      }
      else f = 0 ;
    }
    if ( f ) {
      List < Integer > ans = new ArrayList < > ( Collections . nCopies ( 7 , e ) ) ;
      for ( int i = 0 ;
      i < ans . size ( ) ;
      i ++ ) ans . add ( i ) System . out . println ( "." + ans . get ( i ) + "Q" + "." ) ;
    }
    else System . out . println ( "No Answer" ) ;
    else System . out . println ( "No Answer" ) ;
    return c2 . toArray