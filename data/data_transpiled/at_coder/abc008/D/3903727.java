static final int [ ] [ ] search ( int east , int south , int west , int north , int [ ] xy , int [ ] [ ] memo ) {
  final int [ ] [ ] in = new int [ 10 ] [ 5 ] ;
  System . setOut ( new PrintStream ( System . out ) {
    @ Override public int [ ] li ( ) {
      return map ( in [ 0 ] , in [ 1 ] ) ;
    }
    @ Override public int [ ] li$ ( ) {
      return map ( in [ 0 ] , in [ 1 ] ) ;
    }
    @ Override public float [ ] lf ( ) {
      return map ( Float . parseFloat ( in [ 2 ] ) , in [ 3 ] ) ;
    }
    @ Override public String [ ] ls ( ) {
      return in [ 0 ] . split ( " " ) ;
    }
    @ Override public String [ ] ns ( ) {
      return in [ 1 ] ;
    }
    @ Override public List < String > lc ( ) {
      return Collections . singletonList ( ns [ 0 ] ) ;
    }
    @ Override public int [ ] ni ( ) {
      return Integer . parseInt ( in [ 2 ] ) ;
    }
    @ Override public float [ ] nf ( ) {
      return Float . parseFloat ( in [ 3 ] ) ;
    }
  }
  , new int [ ] [ ] {
    0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 ,