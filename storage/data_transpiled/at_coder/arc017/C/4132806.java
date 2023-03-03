public static final int [ ] getCounts ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] w = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) w [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = N / 2 ;
  int b = N - a ;
  int [ ] former = new int [ a ] ;
  int [ ] latter = new int [ b ] ;
  for ( int i = 0 ;
  i < 2 * a ;
  i ++ ) former [ i ] = Math . pow ( w [ i ] , ( i >> j & 1 ) ) ;
  for ( int i = 0 ;
  i < 2 * b ;
  i ++ ) latter [ i ] = Math . pow ( w [ j + a ] , ( i >> j & 1 ) ) ;
  Map < Integer , Integer > formerMap = new LinkedHashMap < Integer , Integer > ( former ) ;
  Map < Integer , Integer > latterMap = new LinkedHashMap < Integer , Integer > ( latter ) ;
  Set < Integer > keys1 = formerMap . keySet ( ) ;
  Set < Integer > keys2 = latterMap . keySet ( ) ;
  int ans = 0 ;
  for ( Integer key : keys1 ) {
    if ( key < X ) {
      if ( keys2 . contains ( X - key ) ) ans += formerMap . get ( key ) * latterMap . get ( X - key ) ;
    }
    else if ( key == X ) ans += formerMap . get ( X ) ;
  }
  System . out . println ( ans ) ;
  return null ;
}
