static final int [ ] [ ] s ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > s = new LinkedList < Integer > ( ) ;
  Deque < Integer > key = new LinkedDeque < Integer > ( ) ;
  int [ ] [ ] lis = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lis [ i ] = new int [ n ] ;
  int [ ] [ ] li = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    lis [ a - 1 ] [ b - 1 ] = a - 1 ;
    lis [ b - 1 ] [ s [ b - 1 ] ] ++ ;
    li [ a - 1 ] [ s [ b - 1 ] ] ++ ;
  }
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ans [ i ] = 0 ;
  while ( key . size ( ) > 0 ) {
    int num = key . removeFirst ( ) ;
    for ( int nu : lis [ num ] ) {
      li [ nu ] [ s [ num ] ] -- ;
      if ( li [ nu ] [ s [ num ] ] == 0 || li [ nu ] [ s [ num ] ] == 0 ) {
        if ( ans [ nu ] == 0 ) {
          key . add ( nu ) ;
          ans [ nu ] = 1 ;
        }
      }
    }
  }
  if ( Arrays . equals ( ans , n ) ) System . out . println ( "No" ) ;
  else System . out . println ( "Yes" ) ;
}
