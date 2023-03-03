public static int claimDiffer ( int hp , int mydmg , int twrdmg ) {
  int towShots = hp / twrdmg ;
  hp %= twrdmg ;
  if ( hp == 0 ) {
    towShots -- ;
    hp += twrdmg ;
  }
  int myShots = hp / mydmg ;
  hp %= mydmg ;
  if ( hp > 0 ) {
    myShots ++ ;
    hp = 0 ;
  }
  return towShots - myShots ;
}
