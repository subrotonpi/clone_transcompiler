static final int [ ] combinations ( int N , int K ) {
  int mod = Integer . parseInt ( input ( ) ) ;
  int kousu = N ;
  int d = N ;
  int kousu = N ;
  int kousu = 0 ;
  int index = 2 ;
  while ( ( index * index <= K ) && ( Ktmp % index == 0 ) ) {
    d -= finish % start ;
    kousu = finish / start ;
    return ( kousu * ( finish + start ) ) / 2 ;
  }
  int Ktmp = K ;
  Map < Integer , Integer > D = Maps . newHashMap ( ) ;
  int index = 2 ;
  while ( ( index * index <= K ) && ( Ktmp % index == 0 ) ) {
    D . put ( index , 0 ) ;
    while ( ( ( i = D . get ( index ) ) != 0 ) && ( Ktmp % index == 0 ) ) {
      if ( Ktmp % index == 0 ) {
        Ktmp = Ktmp / index ;
        D . put ( index , ++ index ) ;
      }
      else {
        break ;
      }
    }
    index ++ ;
  }
  if ( Ktmp > 1 ) D . put ( Ktmp , 1 ) ;
  List < Integer > prime = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < D . size ( ) ;
  i ++ ) {
    prime . add ( D . get ( i ) ) ;
  }
  Set < Integer > division = Sets . newHashSet ( ) ;
  index = 1 ;
  while ( ( index * index <= K ) && ( K % index == 0 ) ) {
    if ( K % index == 0 ) {
      division . add ( index ) ;
      division . add ( K / index ) ;
    }
    index ++ ;
  }
  division = Sets . newHashSet ( division ) ;
  int ans = 0 ;
  for ( int d : division ) {
    List < Integer > primelist = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < prime . size ( ) ;
    i ++ ) {
      if ( ( K / d ) % prime . get ( i ) == 0 ) primelist . add ( prime . get ( i ) ) ;
    }
    int gK = primelist . size ( ) ;
    int tmp = 0 ;
    for ( int i = 0 ;
    i < gK ;
    i ++ ) {
      int seq = Math . min ( 2 , gK ) ;
      int fugou = ( - 1 ) * ( sum ( seq ) % 2 ) ;
      int aiu =