static final Scanner solve = new Scanner ( System . in ) {
  private boolean solve ( int n , int m , int A ) {
    boolean changed = false ;
    if ( n < m ) {
      n = m ;
      m = n ;
      changed = true ;
    }
    for ( int t : xrange ( n ) ) {
      int AT = A + t ;
      for ( int i : xrange ( 1 , n + 1 ) ) {
        if ( AT % i == 0 && AT / i <= m ) {
          if ( t > 0 ) {
            if ( changed ) {
              System . out . println ( 0 , 0 , 1 , i , AT / i , t ) ;
            }
            else {
              System . out . println ( 0 , 0 , i , 1 , t , AT / i ) ;
            }
          }
          else {
            if ( changed ) {
              System . out . println ( 0 , 0 , 0 , i , A / i , 0 ) ;
            }
            else {
              System . out . println ( 0 , 0 , i , 0 , 0 , A / i ) ;
            }
          }
        }
        return true ;
      }
    }
    private int solve2 ( int n , int m , int A ) {
      for ( int y1 = 0 ;
      y1 <= m ;
      y1 ++ ) {
        int x1 = 0 ;
        for ( int x2 = 0 ;
        x2 <= n ;
        x2 ++ ) {
          for ( int y2 = 0 ;
          y2 <= m ;
          y2 ++ ) {
            for ( int x3 = 0 ;
            x3 <= n ;
            x3 ++ ) {
              for ( int y3 = 0 <= m ;
              y3 ++ ) {
                if ( Math . abs ( x1 * y2 + x2 * y3 + x3 * y1 - x1 * y3 - x2 * y1 - x3 * y2 ) == A ) {
                  System . out . println ( x1 + "," + y1 + "," + x2 + "," + y2 + "," + x3 + "," + y3 ) ;
                  return 1 ;
                }
              }
            }
          }
        }
      }
      return 0 ;
    }
  }
}
;
psyco . full ( ) ;
int tn = input . nextInt ( ) ;
for ( int loop = 0 ;
loop < tn ;
loop ++ ) {
  System . out . printf ( "Case #%d:%n" , loop + 1 ) ;
  n = n * n ;
  m = n * m ;
  A = A * n ;
}
return solve ( n , m , A ) ;
}
