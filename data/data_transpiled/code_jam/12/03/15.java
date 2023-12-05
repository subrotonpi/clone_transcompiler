static final List < Integer > getInts ( ) {
  final List < Integer > ints = new ArrayList < > ( ) ;
  final int length = Integer . parseInt ( String . valueOf ( length ) ) ;
  int shift ;
  int i ;
  int mask = 0 ;
  int total = 0 ;
  int i ;
  int length = String . valueOf ( length ) . length ( ) ;
  if ( length % 2 == 0 ) {
    shift = 10 * ( length / 2 ) ;
    i = A / shift ;
    mask = shift + 1 ;
    while ( i * 1111 < A ) {
      total = total - 3 ;
      i = i + 1 ;
    }
  }
  if ( length % 7 == 0 ) {
    shift = 10 ;
    i = A / 100000 ;
    if ( i * 11111 < A ) i = i + 1 ;
    while ( i * 11111 <= B ) {
      total = total - 4 ;
      i = i + 1 ;
    }
  }
  if ( length % 3 == 0 ) {
    shift = 10 ;
    i = A / 1000000 ;
    if ( i * 111111 < A ) i = i + 1 ;
    while ( i * 1111111 <= B ) {
      total = total - 5 ;
      i = i + 1 ;
    }
  }
  if ( length % 4 == 0 ) {
    shift = 10 ;
    i = A / 10 ;
    mask = shift * 2 + 1 ;
    while ( i * 1111111 < A ) {
      total = total - 6 ;
      i = i + 1 ;
    }
  }
  if ( length % 3 == 0 ) {
    shift = 10 ;
    i = A / 10 ;
    mask = shift * 2 + 1 ;
    while ( i * 1111111 <= B ) {
      total = total - 5 ;
      i = i + 1 ;
    }
  }
  if ( length % 4 == 0 ) {
    shift = 10 ;
    i = A / 10 ;
    mask = shift * 2 + 1 ;
    while ( i * 1111111 <= B ) {
      total = total - 5 ;
      i = i + 1 ;
    }
  }
  if ( length % 3 == 0 ) {
    shift = 10 ;
    i = A / 10 ;
    mask = shift * 2 + 1 ;
    while ( i * 1111111 <= B ) {
      total = total - 5 ;
      i = i + 1 ;
    }
  }
  if ( length % 4 == 0 ) {
    shift = 10 ;
    i = A / 10 ;
    mask = shift * 2 + 1 ;
    while ( i * 1111111 <= B ) {
      total = total - 6 ;
      i = i + 1 ;
    }
  }
  int t = 0 ;
  if ( length % 4 ==