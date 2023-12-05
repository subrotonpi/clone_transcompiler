def import time , x , purchase
class bb ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        self.T = self.T
for t in range ( T ) :
    print ( "Case #%d: " % ( t + 1 ) , end = end )
    c , f , x = self.input.split ( )
    start , end = 0 , 300000
    while end - start > 5 :
        mid1 = start + ( end - start ) // 3
        mid2 = start + 2 * ( end - start ) // 3
        if time ( c , f , x , mid1 ) > time ( c , f , x , mid2 ) :
            start = mid1
        else :
            end = mid2
    res = 1e18
    for iter in range ( max ( 0 , start - 10 ) , end + 10 ) :
        res = min ( res , time ( c , f , x , iter ) )
    print ( res )
def time ( c , f , x , purchase ) :
    if not purchase :
        return - 1e18
    cps = 2
    if x < c :
        return x / 2
    res = 0
    for i in range ( purchase ) :
        res += c / cps
        cps += f
    return res + x / cps
