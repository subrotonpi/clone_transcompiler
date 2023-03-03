static final int resoudre ( int n , int m , int k ) {
  if ( ( n < m ) || ( m > n ) ) return resoudre ( m , n , k ) ;
  if ( ( m <= 2 ) && ( n < m ) ) return k ;
  else if ( ( m == 3 ) && ( k < 5 ) ) return k ;
  else if ( ( k < 8 ) || ( n == 3 ) ) return k - 1 ;
  else if ( ( k < 11 ) || ( n == 4 ) ) return k - 2 ;
  else if ( ( k < 14 ) || ( n == 5 ) ) return k - 3 ;
  else if ( ( k < 17 ) || ( n == 6 ) ) return k - 4 ;
  else return k - 4 ;
  else if ( ( m == 4 ) && ( k < 5 ) ) return k ;
  else if ( ( k < 8 ) && ( k < 10 ) ) return k - 1 ;
  else if ( ( k < 12 ) && ( k < 13 ) ) return k - 3 ;
  else if ( ( k < 14 ) && ( k < 15 ) ) return k - 4 ;
  else if ( ( k < 16 ) && ( k < 17 ) ) return k - 5 ;
  else return k - 6 ;
  System . out . println ( "Bug " + n + " " + m ) ;
  int nbcases = Integer . parseInt ( readLine ( ) ) ;
  for ( int testCase : xrange ( 1 , nbcases + 1 ) ) {
    Arrays . fill ( new Object [ ] {
      readLine ( ) , ( int ) testCase }
      , ( int ) testCase ) ;
      System . out . println ( "Case #" + testCase + ": " + resoudre ( n , m , k ) ) ;
    }
    return nbcases ;
  }
  