@ VisibleForTesting static void solve ( ) {
  int nTestCases = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  for ( int testCaseN = 1 ;
  testCaseN <= nTestCases ;
  testCaseN ++ ) {
    int Hd = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int Ad = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int Hk = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int Ak = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int B = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int D = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    Set < Integer > visited = new HashSet < > ( ) ;
    Queue < Integer > queue = new LinkedList < > ( ) ;
    visited . add ( new Integer ( Hd ) ) ;
    visited . add ( new Integer ( Ad ) ) ;
    visited . add ( new Integer ( Hk ) ) ;
    queue . add ( new Integer ( Ak ) ) ;
    queue . add ( new Integer ( Hd ) ) ;
    queue . add ( new Integer ( Ad ) ) ;
    queue . add ( new Integer ( Hk ) ) ;
    queue . add ( new Integer ( Ak ) ) ;
    Integer res = null ;
    while ( queue . size ( ) > 0 ) {
      int sta_d = queue . poll ( ) ;
      int atk_d = queue . poll ( ) ;
      int sta_k = queue . poll ( ) ;
      int atk_k = queue . poll ( ) ;
      int rounds = queue . poll ( ) ;
      int [ ] newStates = {
        new Integer ( Hd ) , atk_d , sta_k , atk_k }
        ;
        newStates [ 0 ] = new Integer ( sta_d ) , atk_d + B , sta_k , atk_k }
        ;
        newStates [ 1 ] = new Integer ( sta_d ) , atk_d , sta_k , sta_k , Math . max ( 0 , atk_k - D ) , sta_k , Math . max ( 0 , sta_k - atk_d ) , atk_k ) ;
        if ( ArrayUtils . contains ( newStates , 2 ) ) {
          res = rounds + 1 ;
          break ;
        }
        newStates = Arrays . copyOf ( newStates , newStates . length ) ;
        for ( int i