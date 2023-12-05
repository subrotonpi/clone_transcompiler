public static int [ ] [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] A = new int [ N ] [ N ] ;
  int [ ] [ ] B = new int [ N ] [ N ] ;
  int Sa = 0 ;
  int Sb = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ i ] = new int [ ] {
      a , i }
      ;
      B [ i ] = new int [ ] {
        b , i }
        ;
        Sa += a ;
        Sb += b ;
      }
      ArrayList < Integer > C = new ArrayList < Integer > ( A . size ( ) + B . size ( ) ) ;
      C . addAll ( Arrays . asList ( A ) ) ;
      C . addAll ( Arrays . asList ( B ) ) ;
      int [ ] ind = new int [ N ] ;
      int ans = 0 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        ind [ i ] = C . get ( i ) . intValue ( ) ;
        ans += C . get ( i ) . intValue ( ) ;
      }
      Arrays . sort ( ind ) ;
      if ( ind . length == N ) {
        if ( C . get ( N - 1 ) != C . get ( N ) . intValue ( ) ) {
          ans += C . get ( N ) . intValue ( ) - C . intValue ( ) ;
        }
        else {
          ans += Math . min ( C . get ( N ) . intValue ( ) - C . intValue ( ) , C . intValue ( ) ) ;
        }
      }
      ans = Math . min ( Sa , Sb , ans ) ;
      return ans ;
    }
    