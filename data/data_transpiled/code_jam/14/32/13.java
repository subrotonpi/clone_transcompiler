@ GwtIncompatible ( "java.util.Scanner" ) public static int [ ] solve ( String input ) {
  final int MOD = 10 * 9 + 7 ;
  final int [ ] FACT = new int [ 101 ] ;
  for ( int i : xrange ( 1 , 101 ) ) {
    FACT [ i ] = ( FACT [ i - 1 ] * i ) % MOD ;
  }
  {
    int [ ] ret = solve ( input ) ;
    System . out . println ( "Case #" + i + ":" + ret ) ;
  }
  {
    int [ ] r = new int [ n ] ;
    for ( int i = 1 ;
    i < r . length ;
    i ++ ) {
      ret [ i ] = solve ( input ) ;
      System . out . println ( "Case #" + i + ":" + ret [ i ] ) ;
    }
  }
  {
    int [ ] n = Integer . parseInt ( input . trim ( ) ) . split ( " " ) ;
    String [ ] cars = readLine ( ) . split ( " " ) ;
    ArrayList < Integer > cc = new ArrayList < Integer > ( n ) ;
    HashSet < Integer > no = new HashSet < Integer > ( ) ;
    for ( String [ ] car : cars ) {
      int [ ] ints = uniq ( car ) ;
      if ( ints . length > 1 && car [ 0 ] . equals ( ints [ ints . length - 1 ] ) ) return 0 ;
      cc . add ( new Integer ( ints [ 0 ] ) ) ;
      for ( int i = 1 ;
      i < ints . length - 1 ;
      i ++ ) {
        if ( ints [ i ] != ints [ i ] ) return 0 ;
        no . add ( ints [ i ] ) ;
      }
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int a = cc . get ( i ) ;
      int b = cc . get ( i ) ;
      if ( a == b == l ) {
        m ++ ;
      }
      else if ( a == l ) {
        if ( e != 0 ) return 0 ;
        e = true ;
      }
      else if ( b == l ) {
        if ( s != 0 ) return 0 ;
        s = true ;
      }
    }
    r = ( r * FACT [ m ] ) % MOD ;
    if ( s != 0 || m > 0 || e != 0 ) {
      ex . add ( l ) ;
    }
  }
  HashMap < Integer , Integer > nxt = new HashMap < Integer , Integer > ( ) ;
  HashSet < Integer > has @ @