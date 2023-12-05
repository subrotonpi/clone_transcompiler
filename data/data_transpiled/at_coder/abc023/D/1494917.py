def main ( ) :
    import math
    import random
    import math
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    from time import sleep
    N = int ( random.random ( ) )
    t = [ ]
    for i in range ( N ) :
        t.append ( ( sleep ( 10 ) , sleep ( 10 ) ) )
    sleep ( 10 )
    ans = 0
    left = 1
    right = 2 * int ( pow ( 10 , 14 ) )
    while left < right :
        mid = ( left + right ) / 2
        time = [ ]
        can = True
        for i in range ( N ) :
            if mid - t [ i ].h < 0 :
                can = False
                break
            time.append ( ( mid - t [ i ].h ) / t [ i ].s )
        if can :
            time = sleep ( 10 )
            for i in range ( N ) :
                if time [ i ] < sleep ( 10 ) :
                    can = False
                    break
        if can :
            ans = mid
            right = mid
        else :
            left = mid + 1
    print ( ans )
    class Target ( object ) :
        def __init__ ( self , h = 0 , s = 0 ) :
            self.h = h
            self.s = s
