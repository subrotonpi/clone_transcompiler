public static void check ( String last3 , String way , String add , int num ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < String , Integer > [ ] memo = new HashMap [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    memo [ i ] = new HashMap < String , Integer > ( ) ;
  }
  /* check last3 */
  int i ;
  int last3 = 0 ;
  int add = 0 ;
  int num = 0 ;
  if ( num == 1 ) {
    memo [ num ] . put ( last3 + add , way ) ;
  }
  if ( num == 2 ) {
    String newLast3 = last3 . substring ( last3 . length ( ) - 2 , last3 . length ( ) ) + add ;
    if ( ( newLast3 != "AGC" ) & ( newLast3 != "GAC" ) & ( newLast3 != "ACG" ) ) {
      if ( memo [ num ] . containsKey ( newLast3 ) ) {
        memo [ num ] . put ( newLast3 , way ) ;
      }
      else {
        memo [ num ] . put ( newLast3 , way ) ;
      }
    }
  }
  if ( num > 2 ) {
    String newLast3 = last3 . substring ( last3 . length ( ) - 2 , last3 . length ( ) ) + add ;
    String newLast4 = last3 . substring ( last3 . length ( ) - 3 , last3 . length ( ) ) + add ;
    if ( ( newLast3 != "AGC" ) & ( newLast3 != "GAC" ) & ( newLast3 != "ACG" ) ) {
      if ( memo [ num ] . containsKey ( newLast3 ) ) {
        memo [ num ] . put ( newLast3 , way ) ;
      }
      else {
        memo [ num ] . put ( newLast3 , way ) ;
      }
    }
  }
  for ( char c = "ATGC" ;
  c <= "ATGC" ;
  c ++ ) {
    memo [ 0 ] . put ( c , 1 ) ;
  }
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    for ( String cj : memo [ i - 1 ] ) {
      last3 = cj ;
      int add = memo [ i - 1 ] . get ( cj ) ;
      for ( String newC : "ATCG" ) {
        check ( last3 , way , newC , i ) ;
      }
    }
    