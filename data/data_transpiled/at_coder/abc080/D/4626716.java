@ VisibleForTesting static void print ( ) {
  final int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int I = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int LS = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int S = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int IR = IR ;
  final int LIR = LIR ;
  final int SR = SR ;
  final int LSR = LS ;
  final int mod = 1000000007 ;
  {
    final int N = I ;
    final int [ ] F = LIR ;
    final int [ ] P = LIR ;
    double ans = - 1 * Double . parseDouble ( "INF" ) ;
    final List < Integer > kaiten = Lists . newArrayList ( ( new Integer [ ] {
      0 , 1 }
      ) , ( new Integer [ ] {
        N }
        ) ) ;
        kaiten . remove ( 0 ) ;
        for ( Integer patern : kaiten ) {
          final int [ ] i = Lists . newArrayList ( patern ) ;
          final int [ ] anskaiten = new int [ N ] ;
          for ( int i = 0 ;
          i < N ;
          i ++ ) {
            anskaiten [ i [ i ] ] = 0 ;
            for ( int youbi = 0 ;
            youbi < i ;
            youbi ++ ) {
              final int n = i [ youbi ] ;
              if ( n == 1 ) {
                for ( int nn = 0 ;
                nn < F . length ;
                nn ++ ) {
                  if ( F [ youbi ] == 1 ) {
                    anskaiten [ nn ] ++ ;
                  }
                }
              }
            }
            int ansb = 0 ;
            for ( int k = 0 ;
            k < P . length ;
            k ++ ) {
              final int [ ] p = P [ k ] ;
              ansb += p [ anskaiten [ k ] ] ;
            }
            ans = Math . max ( ans , ansb ) ;
          }
          System . out . println ( ans ) ;
        }
      }
      {
        final int N = LI ;
        final int C = LIR ;
        final int STC = LIR ;
        int ans = 0 ;
        final int [ ] [ ] channel = new int [ C + 1 ] [ 10 * 5 + 2 ] ;
        for ( int i = 0 ;
        i < C ;
        i ++ ) {
          channel [ i ] [ C ] = 0 ;
        }
        for ( int i = 0 ;
        i < STC ;
        