@ VisibleForTesting static int binarySearch ( String input ) {
  int X = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int [ ] rList = new int [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) rList [ i ] = 0 ;
  int Q = Integer . parseInt ( input ) ;
  List < List < Integer >> queryList = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) queryList . add ( Collections . singletonList ( input ) ) ;
  List < int [ ] > MmRL_list = new ArrayList < > ( ) ;
  int M = X ;
  int m = 0 ;
  int R = X ;
  int L = 0 ;
  MmRL_list . add ( new int [ ] {
    M , m , R , L }
    ) ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      int M_ = M ;
      int m_ = m ;
      int R_ = R ;
      int L_ = L ;
      int lag = rList [ i + 1 ] - rList [ i ] ;
      if ( i % 2 == 0 ) {
        if ( M_ - lag < 0 ) {
          M = 0 ;
          R = 0 ;
        }
        else {
          M = M_ - lag ;
          R = R_ ;
        }
        if ( m_ - lag < 0 ) {
          m = 0 ;
          L = L + lag - m_ ;
        }
        else {
          m = m_ - lag ;
          L = L ;
        }
      }
      else {
        if ( M_ + lag > X ) {
          M = X ;
          R = R_ - ( M_ + lag - X ) ;
        }
        else {
          M = M_ + lag ;
          R = R_ ;
        }
        if ( m_ + lag > X ) {
          m = X ;
          L = X ;
        }
        else {
          m = m_ + lag ;
          L = L ;
        }
      }
      MmRL_list . add ( new int [ ] {
        M , m , R , L }
        ) ;
      }
      for ( int q = 0 ;
      q < Q ;
      q ++ ) {
        int t = queryList . get ( q ) ;
        int a = queryList . get ( q ) ;
        int j = Arrays . binarySearch ( rList , t ) - 1 ;
        int a_ , m , R , L ;
        if ( a <= L ) a_ = m ;
        else if ( a >= R ) a_ = M ;
        else a_ = m + ( a -