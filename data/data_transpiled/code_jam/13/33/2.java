static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  for ( int testcase = xrange ( 1 , Integer . parseInt ( scanner . nextLine ( ) ) ) ;
  testcase <= 0 ;
  testcase ++ ) {
    final int numTribes = Integer . parseInt ( scanner . nextLine ( ) ) ;
    final Map < Integer , Integer > wallHeights = new HashMap < Integer , Integer > ( ) ;
    final List < Integer > daysOfAttacks = new ArrayList < Integer > ( ) ;
    final Map < Integer , List < Integer >> attackingTribes = new HashMap < Integer , List < Integer >> ( ) ;
    final List < int [ ] > tribeInfos = new ArrayList < int [ ] > ( ) ;
    for ( int index = 0 ;
    index < numTribes ;
    index ++ ) {
      final int firstAttack = scanner . nextInt ( ) ;
      final int numAttacks = scanner . nextInt ( ) ;
      final int firstWest = scanner . nextInt ( ) ;
      final int firstEast = scanner . nextInt ( ) ;
      final int firstStrengh = scanner . nextInt ( ) ;
      final int daysBetween = scanner . nextInt ( ) ;
      final int eastBetween = scanner . nextInt ( ) ;
      final int strengthBetween = scanner . nextInt ( ) ;
      for ( int attackDay = firstAttack ;
      attackDay < firstAttack + daysBetween * numAttacks ;
      attackDay += daysBetween ) {
        if ( attackingTribes . containsKey ( attackDay ) ) {
          attackingTribes . get ( attackDay ) . add ( index ) ;
        }
        else {
          attackingTribes . put ( attackDay , new ArrayList < Integer > ( ) ) ;
        }
        daysOfAttacks . add ( attackDay ) ;
      }
      tribeInfos . add ( new int [ ] {
        firstAttack , numAttacks , firstWest , firstEast , firstStrengh , daysBetween , eastBetween , strengthBetween }
        ) ;
      }
      Collections . sort ( daysOfAttacks ) ;
      int successfulAttacks = 0 ;
      for ( int attackDay : daysOfAttacks ) {
        final Map < Integer , Integer > newHeights = new HashMap < Integer , Integer > ( ) ;
        for ( int tribeIndex : attackingTribes . get ( attackDay ) ) {
          int success = 0 ;
          final int [ ] tribeInfo = tribeInfos . get ( tribeIndex ) ;
          final int firstAttack = tribeInfo [ 0