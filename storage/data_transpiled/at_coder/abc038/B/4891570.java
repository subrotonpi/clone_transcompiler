public static boolean display ( @ IntRange ( from = 0 , to = 1 ) int H1 , int W1 , int H2 , int W2 ) {
  return H1 == H2 || H1 == W2 || W1 == H2 || W1 == W2 ;
}
