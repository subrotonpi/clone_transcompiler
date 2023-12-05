@ Nullable private static String compute ( int [ ] D , int [ ] L , int total ) {
  final HashMap < Integer , String > cache = new HashMap < Integer , String > ( ) ;
  {
    if ( cache . containsKey ( i ) ) {
      return cache . get ( i ) ;
    }
    cache . put ( i , i ) ;
  }
  int [ ] D = new int [ D . length ] ;
  int [ ] L = new int [ L . length ] ;
  int total = 0 ;
  @ SuppressWarnings ( {
    "HardCodedStringLiteral" }
    ) @ Override public boolean canJump ( int a , int b ) {
      int d = Math . min ( L [ b ] , D [ b ] - D [ a ] ) ;
      if ( D [ b ] + d >= total ) {
        return true ;
      }
      for ( int i : xrange ( b + 1 , L . length ) ) {
        if ( D [ i ] - D [ b ] > d ) {
          return false ;
        }
        if ( canJump ( b , i ) ) {
          return true ;
        }
      }
      return false ;
    }
    @ Override public String compute ( int [ ] D , int [ ] L , int total ) {
      return canJump ( 0 , 1 ) ? "YES" : "NO" ;
    }
    @ Override public String parse ( ) {
      int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      D = new int [ N ] ;
      L = new int [ N ] ;
      for ( int i : xrange ( N ) ) {
        int d = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
        int l = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
        D [ i ] = d ;
        L [ i ] = l ;
      }
      total = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      return ( D ) ? "YES" : "NO" ;
    }
  }
  