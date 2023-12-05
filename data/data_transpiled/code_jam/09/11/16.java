static final String getStr ( ) {
  String getline = f -> f . nextLine ( ) . trim ( ) ;
  String gettoken = f -> f . split ( "\\s+" ) ;
  String getint = f -> Integer . parseInt ( getline ) ;
  String [ ] k = new String [ N ] ;
  int ans = 0 ;
  int [ ] bases = getints ( f ) ;
  for ( int i = xrange ( 2 , 100000 ) ;
  i < bases . length ;
  i ++ ) {
    int ahh = Arrays . stream ( bases ) . reduce ( happy , i ) ;
    if ( ahh > 0 ) ans = i ;
  }
  print ( "Case #" + ( cases + 1 ) + ": " + ans ) ;
  factorial = n -> product ( xrange ( n , 1 , - 1 ) ) ;
  nPr = n -> product ( xrange ( n , n - r , - 1 ) ) ;
  nCr = n -> nPr ( n , r ) / factorial ( r ) ;
  nMr = l -> factorial ( Math . pow ( l , 2 ) ) / product ( Math . pow ( l , 2 ) ) ;
  gcd = x -> x != 0 ? gcd ( y , x % y ) : x ;
  lcm = x -> x * y / gcd ( x , y ) ;
  / * ▁ if ▁ ( b ▁ = = ▁ 0 ) ▁ return ▁ ( a ▁ = = ▁ 1 ▁ ? ▁ 0 ▁ : ▁ a ▁ = ▁ 1 ▁ ? ▁ b ▁ = ▁ 0 ▁ : ▁ a ▁ = ▁ b ▁ = ▁ 1 ▁ ? ▁ b ▁ = ▁ 0 ▁ : ▁ b ▁ = ▁ 1 ▁ ? ▁ b ▁ = ▁ 0 ▁ : ▁ b ▁ = ▁ 1 ▁ ? ▁ b ▁ = ▁ 0 ▁ : ▁ b ▁ = ▁ 1 ▁ ? ▁ b ▁ = ▁ 0 ▁ : ▁ b ▁ = ▁ 1 ▁ ? ▁ b ▁ = ▁ 0 ▁ : ▁ b ▁ = ▁ 1 ▁ ? ▁ b ▁ = ▁ 0 ▁ : ▁ b ▁ = ▁ 1 ▁ ? ▁ b ▁ = ▁ 0 ▁ : ▁ b ▁ = ▁ 1 ▁ ? ▁ b ▁ = ▁ 1 ▁ : ▁ b ▁ = ▁ 1 ▁ ? ▁ b ▁ = ▁ 1 ▁ : ▁ b ▁ = ▁ 1 ▁ ? ▁ b ▁ = ▁ 1 ▁ : ▁ b ▁ = ▁ 1 ▁ ? ▁ b ▁ = ▁ 1 ▁ : ▁ b ▁ = ▁ 1 ) ;
}
