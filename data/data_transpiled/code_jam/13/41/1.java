static final int [ ] read ( ) {
  int [ ] [ ] result = new int [ ] [ ] {
    Integer . parseInt ( System . in . readLine ( ) ) , Integer . parseInt ( System . in . readLine ( ) ) }
    ;
    int t , n ;
    {
      int s = 0 ;
      {
        int x = 0 ;
      }
      {
        int x = 0 ;
      }
      {
        int x = 0 ;
      }
      {
        int x = n ;
      }
      {
        int x = 0 ;
      }
      {
        int x = 0 ;
      }
      {
        int MOD = 1000002013 ;
        {
          int n = n ;
          int m = n ;
          List < Integer > ev = new ArrayList < Integer > ( ) ;
          List < Integer > stos = new ArrayList < Integer > ( ) ;
          int price = 0 ;
          for ( int i = 0 ;
          i < m ;
          i ++ ) {
            int a = read ( ) ;
            int b = read ( ) ;
            int c = read ( ) ;
            price += c * cost ( a , b , n ) ;
            ev . add ( new Integer ( a ) ) ;
            ev . add ( new Integer ( b ) ) ;
          }
          Collections . sort ( ev ) ;
          for ( int i = 0 ;
          i < m ;
          i ++ ) {
            t = ev . get ( i ) ;
            int a = read ( ) ;
            if ( a < 0 ) {
              stos . add ( new Integer ( t ) ) ;
            }
            else {
              while ( a > 0 ) {
                if ( stos . get ( stos . size ( ) - 1 ) . intValue ( ) > a ) {
                  stos . get ( stos . size ( ) - 1 ) . intValue ( ) - = a ;
                  price -= a * cost ( stos . get ( stos . size ( ) - 1 ) . intValue ( ) , t , n ) ;
                  a = 0 ;
                }
                else {
                  int ot = stos . remove ( stos . size ( ) - 1 ) ;
                  int oa = stos . remove ( stos . size ( ) - 1 ) ;
                  price -= oa * cost ( ot , t , n ) ;
                  a -= oa ;
                }
              }
            }
          }
          return price % MOD ;
        }
      }
      ;
      for ( int i = 1 ;
      i <= t ;
      i ++ ) {
        System . out . println ( "Case #" + i + ": " + result [ i ] ) ;
      }
      return result ;
    }
    