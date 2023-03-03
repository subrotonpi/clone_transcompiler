public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] prime = new int [ n ] ;
  prime [ 0 ] = 2 ;
  int no = 3 ;
  ArrayList < Integer > mod1 = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > mod2 = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > mod3 = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > mod4 = new ArrayList < Integer > ( ) ;
  while ( mod1 . size ( ) < n && mod2 . size ( ) < n && mod3 . size ( ) < n && mod4 . size ( ) < n ) {
    for ( int i = 0 ;
    i < prime . length ;
    i ++ ) {
      if ( ( no % prime [ i ] ) == 0 ) {
        no ++ ;
        break ;
      }
    }
    else {
      prime [ i ] = no ;
      if ( ( no % 5 ) == 1 ) {
        mod1 . add ( no ) ;
      }
      else if ( ( no % 5 ) == 2 ) {
        mod2 . add ( no ) ;
      }
      else if ( ( no % 5 ) == 3 ) {
        mod3 . add ( no ) ;
      }
      else if ( ( no % 5 ) == 4 ) {
        mod4 . add ( no ) ;
      }
      no ++ ;
    }
  }
  int ans [ ] ;
  if ( ( ans = mod1 . size ( ) ) == n ) ans = mod1 . toArray ( new int [ n ] ) ;
  else if ( ( ans = mod2 . size ( ) ) == n ) ans = mod2 . toArray ( new int [ n ] ) ;
  else if ( ( ans = mod3 . size ( ) ) == n ) ans = mod3 . toArray ( new int [ n ] ) ;
  else if ( ( ans = mod4 . size ( ) ) == n ) ans = mod4 . toArray ( new int [ n ] ) ;
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    System . out . print ( ans [ i ] + " " ) ;
  }
}
