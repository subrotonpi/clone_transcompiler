static final String solve ( int n , int b ) throws IOException {
  String fn = System . getProperty ( "file" ) ;
  BufferedReader br = new BufferedReader ( new FileReader ( fn ) ) ;
  int t = Integer . parseInt ( br . readLine ( ) ) ;
  {
    int [ ] out = new int [ n ] ;
    while ( n > 0 ) {
      out = new int [ n ] ;
      out [ n ] = n % b ;
      n /= b ;
    }
    return out ;
  }
  {
    int [ ] s = new int [ t ] ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      s [ i ] = tobase ( n , b ) ;
    }
    int total = Integer . parseInt ( s [ 0 ] ) ;
    return total ;
  }
  {
    int [ ] s = new int [ t ] ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      s [ i ] = s [ i ] ;
    }
    int i = 1 ;
    boolean check = true ;
    for ( int j = 0 ;
    j < s . length ;
    j ++ ) {
      check = ! isHappy ( i , j ) ;
      break ;
    }
    if ( check ) {
      return i ;
    }
  }
  {
    int [ ] s = new int [ t ] ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      s [ i ] = s [ i ] ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + s [ i ] ) ;
    System . out . flush ( ) ;
  }
  {
    int [ ] s = new int [ t ] ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      s [ i ] = s [ i ] ;
    }
    System . out . flush ( ) ;
  }
  {
    int [ ] s = new int [ t ] ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      s [ i ] = s [ i ] ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + s [ i ] ) ;
    System . out . flush ( ) ;
  }
  {
    int [ ] s = new int [ t ] ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      s [ i ] = s [ i ] ;
    }
    System . out . println ( "Case #" + ( i +