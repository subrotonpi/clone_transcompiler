public static String testcase ( ) {
  int myHealth = Integer . parseInt ( input . nextLine ( ) ) ;
  int myAttack = Integer . parseInt ( input . nextLine ( ) ) ;
  int hisHealth = Integer . parseInt ( input . nextLine ( ) ) ;
  int hisAttack = Integer . parseInt ( input . nextLine ( ) ) ;
  int buff = Integer . parseInt ( input . nextLine ( ) ) ;
  int debuff = Integer . parseInt ( input . nextLine ( ) ) ;
  int bestAttackRounds = 100 ;
  for ( int d = 0 ;
  d < 101 ;
  d ++ ) {
    int tmpAttack = myAttack + buff * d ;
    int roundsToKill = hisHealth / tmpAttack ;
    if ( tmpAttack * roundsToKill < hisHealth ) {
      roundsToKill ++ ;
    }
    bestAttackRounds = Math . min ( bestAttackRounds , roundsToKill + d ) ;
  }
  if ( hisAttack * ( bestAttackRounds - 1 ) < myHealth ) {
    return Integer . toString ( bestAttackRounds ) ;
  }
  int bestTime = 1000000 ;
  for ( int how_many_debuffs = 0 ;
  how_many_debuffs < 101 ;
  how_many_debuffs ++ ) {
    int myH = myHealth ;
    int hisA = hisAttack ;
    int used_debuffs = 0 ;
    int empty_moves = 0 ;
    for ( int step = 0 ;
    step < 2000 ;
    step ++ ) {
      if ( hisA - debuff < myH && used_debuffs < how_many_debuffs ) {
        hisA = Math . max ( 0 , hisA - debuff ) ;
        used_debuffs ++ ;
      }
      else if ( myH > hisA || empty_moves == bestAttackRounds - 1 ) {
        empty_moves ++ ;
      }
      else {
        myH = myHealth ;
      }
      if ( empty_moves == bestAttackRounds ) {
        bestTime = Math . min ( bestTime , step + 1 ) ;
        break ;
      }
      myH -= hisA ;
      if ( myH <= 0 ) {
        break ;
      }
    }
  }
  return bestTime < 1000000 ? Integer . toString ( bestTime ) : "IMPOSSIBLE" ;
}
