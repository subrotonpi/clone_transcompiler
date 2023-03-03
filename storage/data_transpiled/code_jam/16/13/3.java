public static int oneTest ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] g = new int [ n ] ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    g [ s ] = Integer . parseInt ( s ) - 1 ;
  }
  int [ ] cycle = new int [ n ] ;
  cycle [ 0 ] = - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( cycle [ i ] == - 1 ) {
      Set < Integer > set = new HashSet < > ( ) ;
      int v = i ;
      while ( ! set . contains ( v ) ) {
        set . add ( v ) ;
        v = g [ v ] ;
      }
      if ( v == i ) {
        int length = set . size ( ) ;
        while ( g [ v ] != i ) {
          cycle [ v ] = length ;
          v = g [ v ] ;
        }
      }
    }
  }
  int [ ] maxIn = new int [ n ] ;
  Set < Integer > ugly = new HashSet < > ( ) ;
  ugly . addAll ( Arrays . asList ( g ) ) ;
  for ( int v : ugly ) {
    int i = v , cur = 0 ;
    while ( cycle [ i ] == - 1 ) {
      maxIn [ i ] = Math . max ( maxIn [ i ] , cur ) ;
      cur ++ ;
      i = g [ i ] ;
    }
    maxIn [ i ] = Math . max ( maxIn [ i ] , cur ) ;
  }
  int ans = Collections . max ( cycle ) ;
  int ans_2 = 0 ;
  for ( int v = 0 ;
  v < n ;
  v ++ ) {
    if ( cycle [ v ] == 2 && g [ v ] > v ) ans_2 += maxIn [ v ] + maxIn [ g [ v ] ] + 2 ;
  }
  return Math . max ( ans , ans_2 ) ;
}
int t = Integer . parseInt ( input . nextLine ( ) ) ;
for ( int i = 1 ;
i <= t ;
i ++ ) {
  System . out . println ( "Case #" + i + ": " + oneTest ( ) ) ;
}
