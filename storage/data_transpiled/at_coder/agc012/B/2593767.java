static final int HUGE = 2147483647 ;
final int HUGEL = 9223372036854775807 ;
final String ABC = "abcdefghijklmnopqrstuvwxyz" ;
final int MAX = 100001 ;
int [ ] dp = new int [ MAX ] ;
for ( int i = 0 ;
i < MAX ;
i ++ ) {
  dp [ i ] = 0 ;
}
int [ ] color = new int [ MAX ] ;
int [ ] [ ] e = new int [ MAX ] [ MAX ] ;
for ( int i = 0 ;
i < MAX ;
i ++ ) {
  e [ i ] = new int [ MAX ] ;
}
{
  int v = 0 ;
  int d = 0 ;
  int c = 0 ;
  for ( int i = 0 ;
  i < MAX ;
  i ++ ) {
    v = i ;
    d = Math . min ( v , Math . min ( v , Math . min ( v , Math . min ( v , Math . min ( v , Math . min ( v , Math . min ( v , Math . max ( v , Math . min ( v , Math . min ( v , Math . min ( v , Math . max ( v , Math . min ( v , Math . min ( v , Math . min ( v , Math . min ( v , Math . max ( v , Math . min ( v , Math . min ( Math . min ( v , Math . min ( Math . max ( Math . min ( Math . max ( Math . max ( Math . min ( Math . max ( Math . max ( Math . max ( Math . max ( Math . max ( Math . max ( Math . max ( Math . max ( Math . max ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math . clamp ( Math .