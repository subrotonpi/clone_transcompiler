static final void solve ( int N , int M , @ NonNull final List < Integer > x , @ NonNull final List < Integer > y , @ NonNull final List < Integer > z ) {
  final int [ ] coef = {
    1 , - 1 }
    ;
    final Iterable < List < Integer >> cand = Iterables . product ( coef , 3 ) ;
    int sumMax = 0 ;
    for ( final List < Integer > can : cand ) {
      final List < Integer > combined = new ArrayList < > ( ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        combined . add ( can . get ( 0 ) * x . get ( i ) + can . get ( 1 ) * y . get ( i ) + can . get ( 2 ) * z . get ( i ) ) ;
      }
      Collections . sort ( combined ) ;
      final int s = sum ( combined , 0 , M ) ;
      sumMax = Math . max ( sumMax , Math . abs ( s ) ) ;
    }
    System . out . println ( sumMax ) ;
    return ;
  }
  