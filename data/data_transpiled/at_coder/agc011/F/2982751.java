static final List < Pair < Integer , Integer >> mergeDelayPattern ( int k , List < Pair < Integer , Integer >> half1 , List < Pair < Integer , Integer >> half2 ) {
  int len1 = half1 . size ( ) ;
  int len2 = half2 . size ( ) ;
  int start = half1 . get ( 0 ) . left ;
  int delay1_next = half1 . get ( 0 ) . right ;
  int start2 = half2 . get ( 0 ) . left ;
  int time1 = start - start2 ;
  int midStart = start + time1 + delay1_next ;
  int offset2_num_period = ( midStart - start2 ) / k ;
  int offset2_phase = midStart - offset2_num_period * k ;
  for ( int i = 0 ;
  i < ( n + 1 ) ;
  i += 2 ) {
    int a = intList . get ( i ) . left ;
    int b = intList . get ( i + 1 ) . right ;
    if ( b == 1 ) {
      int a2 = a * 2 ;
      if ( i < a2 ) return Collections . singletonList ( new Pair < > ( - position , 0 ) ) ;
    }
    position += a ;
    int [ ] pat_adj_pairs = new int [ len2 ] ;
    for ( int i = 1 ;
    i < len2 ;
    i ++ ) {
      int head2 = i ;
      if ( i >= offset2_phase ) {
        head2 -- ;
        break ;
      }
    }
    head2 += offset2_num_period * len2 ;
    int head1 = 0 ;
    List < Pair < Integer , Integer >> ret = new ArrayList < > ( ) ;
    Integer prev = new Integer ( 0 ) ;
    half1 . add ( new Pair < > ( start + k , null ) ) ;
    int pos1_next = start ;
    int pos2_next = half2 . get ( head2 % len2 ) ;
    int delay2_next = half2 . get ( head2 ) . right ;
    pos2_next += ( head2 / len2 ) * k ;
    int mid = pos2_next ;
    while ( true ) {
      if ( mid <= pos2_next ) {
        if ( head1 == len1 ) break ;
        head1 ++ ;
        int pos1 = pos1_next ;
        int delay1 = delay1_next ;
        pos1_next = half1 . get ( pos1 ) . left ;
        delay1_next = start ;
      }
      if ( pos2_next <= mid ) {
        if ( prev != null ) {
          ret . add ( new Pair < > ( start , 0 )