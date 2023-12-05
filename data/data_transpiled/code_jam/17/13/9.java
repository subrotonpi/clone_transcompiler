static final int [ ] getUpperCases ( ) {
  for ( int tc = 0 ;
  tc < Integer . parseInt ( input ) ;
  tc ++ ) {
    int Hd = Integer . parseInt ( input . nextLine ( ) ) ;
    int Ad = Integer . parseInt ( input . nextLine ( ) ) ;
    int Hk = Integer . parseInt ( input . nextLine ( ) ) ;
    int Ak = Integer . parseInt ( input . nextLine ( ) ) ;
    int B = Integer . parseInt ( input . nextLine ( ) ) ;
    int D = Integer . parseInt ( input . nextLine ( ) ) ;
    Queue < Integer > Q = new LinkedList < Integer > ( ) ;
    Q . add ( new Integer ( 0 ) ) ;
    Q . add ( new Integer ( Hd ) ) ;
    Q . add ( new Integer ( Ad ) ) ;
    Q . add ( new Integer ( Hk ) ) ;
    Q . add ( new Integer ( Ak ) ) ;
    Integer r = null ;
    while ( Q . size ( ) > 0 ) {
      int t = Q . poll ( ) ;
      int s = Q . poll ( ) ;
      int hd = Q . poll ( ) ;
      int ad = Q . poll ( ) ;
      int hk = Q . poll ( ) ;
      int ak = Q . poll ( ) ;
      if ( 10000 < t ) break ;
      if ( hk <= 0 ) {
        r = t ;
        break ;
      }
      if ( s == 'D' ) {
        if ( 0 < D && 0 < ak && hd > ak - D ) Q . add ( new Integer ( t + 1 ) ) ;
        Q . add ( new Integer ( hd - ( ak - D ) ) ) ;
        Q . add ( new Integer ( ad ) ) ;
        Q . add ( new Integer ( hk ) ) ;
        Q . add ( new Integer ( ak ) ) ;
      }
      if ( s == 'D' || s == 'B' ) {
        if ( 0 < B && ad < hk && hd > ak ) Q . add ( new Integer ( t + 1 ) ) ;
        Q . add ( new Integer ( hd - ak ) ) ;
        Q . add ( new Integer ( ad + B ) ) ;
        Q . add ( new Integer ( hk ) ) ;
        Q . add ( new Integer ( ak ) ) ;
        Q . add ( new Integer ( t + 1 ) ) ;
        Q . add ( new Integer ( s ) ) ;
        Q . add ( new Integer ( Hd - ak ) ) ;
        Q . add ( new Integer