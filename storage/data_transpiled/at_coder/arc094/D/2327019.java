public static int solve ( String s ) {
  if ( Arrays . equals ( s , s . substring ( 1 , s . length ( ) - 1 ) ) ) return 1 ;
  if ( s . length ( ) == 2 ) return 2 ;
  else if ( s . length ( ) == 3 ) {
    if ( s . charAt ( 0 ) == s . charAt ( 1 ) || s . charAt ( 1 ) == s . charAt ( 2 ) ) return 6 ;
    else if ( s . charAt ( 0 ) == s . charAt ( 2 ) ) return 7 ;
    else return 3 ;
  }
  int dp [ ] [ ] = new int [ 3 ] [ 2 ] ;
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) dp [ i ] [ 1 ] = Integer . parseInt ( s . substring ( 0 , 1 ) ) % MOD ;
  System . out . println ( solve ( s ) ) ;
  System . out . println ( ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println ( "" ) ;
  System . out . println