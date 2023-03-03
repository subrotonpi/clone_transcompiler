public static void memo ( final Runnable r ) {
  final Map < Integer , Object > save = new HashMap < > ( ) ;
  new Thread ( ) {
    @ Override public void run ( ) {
      if ( save . containsKey ( x ) ) {
        return ;
      }
      Object ret = r . run ( ) ;
      save . put ( x , ret ) ;
      return ;
    }
  }
  . start ( ) ;
  new Thread ( ) {
    @ Override public int run ( ) {
      int aIdx = 0 ;
      int bIdx = 0 ;
      int acount = 0 ;
      int bCount = 0 ;
      @ SuppressWarnings ( "resource" ) int aCount = 0 ;
      int bCount = 0 ;
      int k ;
      if ( aIdx >= n || bIdx >= m ) return 0 ;
      if ( boxes [ aIdx ] . y != toys [ bIdx ] . y ) {
        return Math . max ( r . nextInt ( aIdx + 1 ) + bCount , boxes [ aIdx + 1 ] . x , bCount ) ;
      }
      else {
        k = Math . min ( acount , bCount ) ;
        acount -= k ;
        bCount -= k ;
        if ( acount == 0 ) {
          aIdx ++ ;
          acount = boxes [ aIdx ] . x ;
        }
        if ( bCount == 0 ) {
          bIdx ++ ;
          bCount = toys [ bIdx ] . x ;
        }
        return k + r . nextInt ( aIdx + 1 ) ;
      }
    }
  }
  . start ( ) ;
  int t = input . nextInt ( ) ;
  Function < Integer , Integer > getnums = new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( Integer input ) {
      return Integer . parseInt ( input . toString ( ) ) ;
    }
  }
  . start ( ) ;
  for ( int x : xrange ( t ) ) {
    int n = getnums . apply ( x ) ;
    int m = getnums . apply ( x ) ;
    int [ ] bs = getnums . apply ( x ) ;
    boxes = new int [ n ] ;
    for ( int y : xrange ( n ) ) {
      boxes [ y ] = new Integer ( bs [ 2 * y ] ) ;
      boxes [ y + 1 ] = bs [ 2 * y + 1 ] ;
    }
    boxes [ m ] = new Integer ( - 1 ) ;
    int [ ] ts = getnums . apply ( x ) ;
    toys = new int [ m ] ;
    for ( int y : xrange ( m ) ) {
      toys [ y + 1 ] = ts