public static int T = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) {
  char bestc = 0 ;
  char bestj = 0 ;
  char bestd = 0 ;
  {
    int val = ( char ) - 48 ;
    int pow10 [ ] = {
      10 * * i }
      ;
      for ( int i = 0 ;
      i < 20 ;
      i ++ ) {
        pow10 [ i ] = 10 * * i ;
      }
    }
    int i , delta , s , t , cc , cj ;
    int p10 , max , min , ncc , ncj ;
    for ( i = 0 ;
    i < T ;
    i ++ ) {
      s = new Scanner ( System . in ) . nextLine ( ) ;
      t = new Scanner ( System . in ) . nextLine ( ) ;
      N = s . length ( ) ;
      delta = 0 ;
      for ( i = 0 ;
      i < N ;
      i ++ ) {
        p10 = N - 1 - i ;
        if ( s . charAt ( i ) != '?' && t . charAt ( i ) != '?' ) {
          delta += ( Character . digit ( s . charAt ( i ) , 10 ) - Character . digit ( t . charAt ( i ) , 10 ) ) * ( Character . digit ( s . charAt ( i ) , 10 ) ) ;
        }
      }
      bestd = 0 ;
      search ( 0 , s , t , 0 , 0 ) ;
      c = String . valueOf ( bestj ) ;
      j = String . valueOf ( bestj ) ;
      System . out . format ( "Case #%d: %s %s" , tn + 1 , c . zfill ( N ) , j . zfill ( N ) ) ;
    }
    if ( t . charAt ( 0 ) == '?' || t . charAt ( 0 ) == '?' ) {
      p10 = s . length ( ) - 1 - i ;
      max = 0 ;
      min = 0 ;
      if ( s . charAt ( i ) == '?' && t . charAt ( i ) == '?' ) {
        max = 9 ;
        min = - 9 ;
      }
      else if ( s . charAt ( i ) == '?' ) {
        max = 9 - val ( t . charAt ( i ) ) ;
        min = - val ( t . charAt ( i ) ) ;
      }
      else if ( t . charAt ( i ) == '?' ) {
        max = val ( s . charAt ( i ) ) ;
        min = val ( t . charAt ( i )