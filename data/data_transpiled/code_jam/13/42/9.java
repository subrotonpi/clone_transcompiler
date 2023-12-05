private static int solve ( int lgn , int p ) {
  int n = 2 * lgn ;
  if ( p == 1 ) return 0 ;
  if ( p == n ) return n - 1 ;
  int q = 0 ;
  int always = 0 ;
  int chunk = n / 2 ;
  int add = 2 ;
  while ( q + chunk < p ) {
    q += chunk ;
    chunk /= 2 ;
    always += add ;
    add *= 2 ;
  }
  q = 0 ;
  int chance = 0 ;
  chunk = 1 ;
  add = n / 2 ;
  while ( q + chunk < p ) {
    q += chunk ;
    chunk *= 2 ;
    chance += add ;
    add /= 2 ;
  }
  return always + chance ;
}
