public static void IOHandlerObject ( ) {
  String source = "a.in" ;
  String target = "a.out" ;
  BufferedReader sreader = null ;
  BufferedReader treader = null ;
  {
    sreader = new BufferedReader ( new FileReader ( source ) ) ;
    sreader . mark ( 0 ) ;
    treader = new BufferedReader ( new FileWriter ( target ) ) ;
  }
  {
    String inputs = sreader . readLine ( ) . trim ( ) ;
    if ( inputs . equals ( "" ) ) {
      return inputs ;
    }
    if ( inputs . equals ( "" ) ) {
      return inputs . split ( " " ) ;
    }
    if ( inputs . equals ( "" ) ) {
      return new Integer [ ] {
        Integer . parseInt ( inputs ) }
        ;
      }
    }
    {
      String s ;
      if ( s == null ) {
        s = "" ;
      }
      treader . reset ( ) ;
      treader . reset ( ) ;
    }
    {
      IOHandler IOHandler = new IOHandlerObject ( ) ;
      BufferedReader g = IOHandler . getInput ( ) ;
      BufferedWriter w = IOHandler . writeToWriter ( s ) ;
    }
    {
      int t = 0 ;
      int i = 0 ;
      while ( i < s . length ( ) ) {
        if ( s . charAt ( i ) != s . charAt ( i ) ) a += s . charAt ( i ++ ) ;
      }
      return a ;
    }
    {
      int [ ] a = new int [ 1 ] ;
      i = 1 ;
      while ( i < s . length ( ) ) {
        if ( s . charAt ( i - 1 ) == s . charAt ( i ) ) a [ a . length - 1 ] ++ ;
        else a [ i ] = 1 ;
        i ++ ;
      }
      return a ;
    }
    int t = g . nextInt ( ) ;
    for ( ;
    t > 0 ;
    t -- ) {
      w . write ( "Case #" + ( i + 1 ) + ": " ) ;
      int n = g . nextInt ( ) ;
      String s [ ] = new String [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        s [ j ] = g . readLine ( 0 ) ;
      }
      String x = unique ( s [ 0 ] ) ;
      if ( StringUtils . isEmpty ( x ) ) {
        w . write ( "Fegla Won" ) ;
      }
      else {
        int [ ] st = new int [ n ] ;
        for ( int j = 0 ;
        j < st [ 0 ] . length ;
        j ++ ) {
          st [ j ] =