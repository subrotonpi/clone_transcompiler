public static String input ( ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > info = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    info . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  String sRuiseki = "X" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( sRuiseki . charAt ( i - 1 ) == 'X' ) {
      sRuiseki = sRuiseki + s . charAt ( i ) ;
    }
    else if ( sRuiseki . charAt ( i - 1 ) != s . charAt ( i ) ) {
      sRuiseki = sRuiseki + "X" ;
    }
    else if ( sRuiseki . charAt ( i ) == 'A' ) {
      sRuiseki = sRuiseki + "B" ;
    }
    else {
      sRuiseki = sRuiseki + "A" ;
    }
  }
  String tRuiseki = "X" ;
  for ( int i = 0 ;
  i < t . length ( ) ;
  i ++ ) {
    if ( tRuiseki . charAt ( i - 1 ) == 'X' ) {
      tRuiseki = tRuiseki + t . charAt ( i ) ;
    }
    else if ( tRuiseki . charAt ( i - 1 ) != t . charAt ( i ) ) {
      tRuiseki = tRuiseki + "X" ;
    }
    else if ( tRuiseki . charAt ( i - 1 ) == 'A' ) {
      tRuiseki = tRuiseki + "B" ;
    }
    else {
      tRuiseki = tRuiseki + "A" ;
    }
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    if ( sRuiseki . charAt ( i ) - 1 == 'X' ) {
      ans1 = sRuiseki . charAt ( i ) ;
    }
    else if ( sRuiseki . charAt ( i ) - 1 == 'X' ) {
      ans1 = "X" ;
    }
    else if ( sRuiseki . charAt ( i ) == 'B' ) {
      ans1 = "X" ;
    }
    else {
      if ( sRuiseki . charAt (