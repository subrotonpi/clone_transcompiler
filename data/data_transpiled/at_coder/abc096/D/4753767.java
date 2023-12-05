private static void dFiveFiveEverywhere ( int N ) {
  /*boolean[] primeTable = new boolean[N+1];
  primeTable[0] = primeTable[1] = false;
  for (int j = 2; j < (int) (n*0.5); j++) {
  if (!primeTable[j]) continue;
  for (int k = j*2; k < n+1; k++) {
  primeTable[k] = false;
  }
  }*/
  List < Integer > primeMod5Is1 = primeTable . stream ( ) . map ( p -> p % 5 == 1 ) . collect ( Collectors . toList ( ) ) ;
}
