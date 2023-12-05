@ Nullable public static String tryInteger ( String x ) {
  try {
    return Integer . parseInt ( x ) ;
  }
  catch ( NumberFormatException e ) {
    return x ;
  }
  /* Enter the number of characters in the string */
  String ret = tryInteger ( readLine ( ) . trim ( ) ) ;
  for ( int i : xrange ( 1 , t + 1 ) ) {
    String a = tryInteger ( readLine ( ) . trim ( ) ) ;
    for ( int j = 0 ;
    j < t ;
    j ++ ) {
      String b = readLine ( ) . substring ( j , j ) ;
      System . out . println ( "Case #" + i + ":" + b ) ;
    }
  }
  /* Solve the following code */
  int n = readLine ( ) . length ( ) ;
  BitSet door = new BitSet ( n ) ;
  BitSet anon = new BitSet ( n ) ;
  Map < String , Boolean > face = new LinkedHashMap < String , Boolean > ( n ) ;
  for ( int i : xrange ( n ) ) {
    String a = readLine ( ) . substring ( 0 , i ) ;
    String f = readLine ( ) . substring ( i + 1 ) ;
    door . set ( a . equals ( "E" ) ) ;
    if ( f . length ( ) == 0 ) {
      anon . set ( ( a . equals ( "E" ) ) ? i : i ) ;
    }
    else {
      face . get ( f ) . set ( ( a . equals ( "E" ) ) ? i : i ) ;
    }
  }
  BitSet need = new BitSet ( n ) ;
  for ( Map . Entry < String , Boolean > entry : face . entrySet ( ) ) {
    Set < Boolean > fit = entry . getValue ( ) ;
    for ( boolean a1 : pairwise ( actions ) ) {
      String a2 = entry . getValue ( ) ;
      if ( a1 . equals ( a2 ) ) {
        need . set ( ( ! a1 . equals ( "E" ) ) ? i : i ) ;
      }
    }
  }
  for ( boolean a : anon ) {
    BitSet fit = new BitSet ( n ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( na == i ) {
        fit . set ( i ) ;
      }
      else {
        if ( nf > 0 ) {
          fit . set ( i ) ;
        }
      }
      else {
        na = Math . max ( na - 1 , 0 ) ;
      }
    }
  }
  if ( need . isEmpty ( ) ) {
    return "