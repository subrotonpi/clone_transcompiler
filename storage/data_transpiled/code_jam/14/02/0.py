def import _b
class b ( ) :
    MAXFARMS = 1000000
    def __init__ ( self ) :
        self.T = int ( self.T )
    for t in range ( 1 , T + 1 ) :
        c = float ( 'inf' )
        f = float ( 'inf' )
        x = float ( 'inf' )
        curFarms = 0
        ans = 1e9
        time = 0
        done = False
        while not done or curFarms < MAXFARMS :
            tans = ( x / ( 2 + f * curFarms ) ) + time
            if tans <= ans :
                ans = tans
            else :
                done = True
            time += c / ( 2 + f * curFarms )
            curFarms += 1
        print ( 'Case #%d: %.7f' % ( t , ans + 1e-9 ) )
