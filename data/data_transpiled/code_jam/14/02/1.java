static final void main ( final String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    private final Enumeration < ? > Prep = new Enumeration < ? > ( ) {
      int index = 0 ;
      @ Override public Object nextElement ( ) {
        return null ;
      }
    }
    ;
    private final double [ ] C = new double [ 1 ] ;
    private final double [ ] F = new double [ 1 ] ;
    private final double [ ] X = new double [ 1 ] ;
    {
      System . setSecurityManager ( new SecurityManager ( ) {
        private final int index = 0 ;
        @ Override public boolean checkInput ( ) {
          return index >= 0 ;
        }
        @ Override public Object nextElement ( ) {
          C [ index ++ ] = Input . readdoubles ( ) ;
          F [ index ++ ] = Input . readdoubles ( ) ;
          X [ index ++ ] = Input . readdoubles ( ) ;
          return C [ index ] ;
        }
        @ Override public Object nextElement ( ) {
          return F [ index ++ ] ;
        }
        @ Override public double [ ] getResult ( ) {
          return X ;
        }
      }
    }
    ) ;
  }
  private static double [ ] solve ( final double [ ] Problem , final int index ) {
    final double C = 2.0 ;
    final double F = 0.0 ;
    final double X = 0.0 ;
    double S = 2.0 ;
    final double Farms = 0.0 ;
    double Time = 0.0 ;
    double cookies = 0.0 ;
    do {
      final double timeToNewFarm = C / S ;
      final double timeToFinish = X / S ;
      if ( timeToFinish < timeToNewFarm ) {
        return new Double [ ] {
          Time + timeToFinish }
          ;
        }
        final double timeDiff = timeToFinish - timeToNewFarm ;
        if ( timeDiff * F < C ) {
          return new Double [ ] {
            Time + timeToFinish }
            ;
          }
          Time += timeToNewFarm ;
          S += F ;
        }
        while ( time < 0 ) ;
        if ( __name__ . equals ( "main" ) ) {
          doit ( new Main ( ) {
            @ Override public Object nextElement ( ) {
              return null ;
            }
          }
          , new Main ( ) {
            @ Override public void run ( ) {
              System . out . println ( "main: " + main ) ;
            }
          }
          , new Main ( ) {
            @ Override public Object nextElement ( ) {
              return null ;
            }
          }
          , new Main ( ) {
            @ Override public Object nextElement ( ) {
              return null ;
            }
          }
          , new Main ( ) {
            @ Override public Object nextElement ( ) {
              return null ;
            }
          }
          ) ;
        }
        return null ;
      }
    }
    