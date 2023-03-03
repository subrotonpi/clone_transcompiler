@ Function public static Integer iipt = new Function ( ) {
  int i ;
  int [ ] miipt = new int [ ] {
    Integer . parseInt ( input ( ) ) }
    ;
    int n = iipt . length ;
    List < int [ ] > up = new ArrayList < > ( ) ;
    List < int [ ] > down = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int a = miipt [ i ] ;
      int b = miipt [ i ] ;
      if ( a < b ) {
        down . add ( new int [ ] {
          a , b }
          ) ;
        }
        else {
          up . add ( new int [ ] {
            b , a }
            ) ;
          }
        }
        Collections . sort ( down ) ;
        Collections . sort ( up , Collections . reverseOrder ( ) ) ;
        int ans = 0 ;
        int t = 0 ;
        for ( int [ ] a : down ) {
          t += a ;
          ans = Math . max ( ans , t ) ;
          t -= b ;
        }
        System . out . println ( ans ) ;
        return ans ;
      }
      