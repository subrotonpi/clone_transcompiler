public static int [ ] solve ( ) {
  int A , B ;
  int res = 0 ;
  res = A + B ;
  res = Math . max ( res , A * B ) ;
  res = Math . max ( res , A - B ) ;
  return res ;
}
