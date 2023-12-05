public static List < int [ ] > input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a . add ( i ) ;
  }
  int posMax = Math . max ( a . size ( ) , Integer . MAX_VALUE ) ;
  int negMax = Math . min ( a . size ( ) , Integer . MAX_VALUE ) ;
  List < int [ ] > res = new ArrayList < > ( ) ;
  if ( Math . abs ( posMax ) >= Math . abs ( negMax ) ) {
    int pos = a . indexOf ( posMax ) + 1 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      a . set ( i , posMax ) ;
      res . add ( new int [ ] {
        pos , i + 1 }
        ) ;
      }
      for ( int i = 0 ;
      i < N - 1 ;
      i ++ ) {
        a . set ( i + 1 , a . get ( i ) ) ;
        res . add ( new int [ ] {
          i + 1 , i + 2 }
          ) ;
        }
      }
      else {
        int pos = a . indexOf ( negMax ) + 1 ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          a . set ( i , negMax ) ;
          res . add ( new int [ ] {
            pos , i + 1 }
            ) ;
          }
          for ( int i = N - 2 ;
          i >= 0 ;
          i -- ) {
            a . set ( i , a . get ( i + 1 ) ) ;
            res . add ( new int [ ] {
              i + 2 , i + 1 }
              ) ;
            }
          }
          System . out . println ( res . size ( ) ) ;
          for ( int [ ] l : res ) {
            System . out . println ( ( int [ ] ) l ) ;
          }
          return res ;
        }
        