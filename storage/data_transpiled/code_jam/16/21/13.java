@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int from ( int input ) {
  int T = Integer . parseInt ( input ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    Counter c = new Counter ( ) ;
    Counter res = new Counter ( ) ;
    for ( int d = 0 ;
    d < 10 ;
    d ++ ) {
      res . add ( d ) ;
    }
    res . add ( 8 ) ;
    c . add ( 'G' ) ;
    for ( int let = 0 ;
    let < "EIGHT" . length ( ) ;
    let ++ ) {
      c . add ( c . get ( let ) . get ( ) . subtract ( res . get ( 8 ) ) ) ;
    }
    res . add ( 3 ) ;
    c . add ( 'H' ) ;
    for ( int let = 0 ;
    let < "THREE" . length ( ) ;
    let ++ ) {
      c . add ( c . get ( let ) . subtract ( res . get ( 3 ) ) ) ;
    }
    res . add ( 4 ) ;
    c . add ( 'U' ) ;
    for ( int let = 0 ;
    let < "FOUR" . length ( ) ;
    let ++ ) {
      c . add ( c . get ( let ) . subtract ( res . get ( 4 ) ) ) ;
    }
    res . add ( 2 ) ;
    c . add ( 'W' ) ;
    for ( int let = 0 ;
    let < "TWO" . length ( ) ;
    let ++ ) {
      c . add ( c . get ( let ) . subtract ( res . get ( 2 ) ) ) ;
    }
    res . add ( 6 ) ;
    c . add ( 'X' ) ;
    for ( int let = 0 ;
    let < "SIX" . length ( ) ;
    let ++ ) {
      c . add ( c . get ( let ) . subtract ( res . get ( 6 ) ) ) ;
    }
    res . add ( 5 ) ;
    c . add ( 'F' ) ;
    for ( int let = 0 ;
    let < "FIVE" . length ( ) ;
    let ++ ) {
      c . add ( c . get ( let ) . subtract ( res . get ( 5 ) ) ) ;
    }
    res . add ( 7 ) ;
    c . add ( 'V' ) ;
    for ( int let = 0 ;
    let < "SEVEN" . length ( ) ;
    let ++ ) {
      c . add ( c . get ( let ) . subtract ( res . get ( let