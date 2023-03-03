def _import ( ) :
    import os
    import random
    import sys
    import struct
    import os
    import sys
    class B ( object ) :
        PROBLEM = 'B'
        SIZE = 'large'
        MAX_A = 11000
        def solve ( self ) :
            l = randint ( 0 , len ( self.a ) )
            t = randint ( 0 , len ( self.a ) )
            n = randint ( 0 , len ( self.a ) )
            c = randint ( 0 , len ( self.a ) )
            a = [ ]
            for i in range ( c ) :
                x = randint ( 0 , len ( self.a ) )
                for k in range ( c * k + i , n ) :
                    a.append ( x )
            build = [ ]
            ans = struct.unpack ( '>i' , a [ 0 ] ) [ 0 ]
            if l == 0 :
                ans = calc ( a , build , t )
            else :
                time = 0
                first = - 1
                for i in range ( n ) :
                    next_time = time + 2 * a [ i ]
                    if next_time < t :
                        pass
                    elif time < t :
                        tmp = calc ( a , i , l , t , True )
                        ans = min ( ans , tmp )
                        first = i
                    elif i == first + 1 :
                        tmp = calc ( a , i - 1 , l , t , False )
                        ans = min ( ans , tmp )
                    time = next_time
            return '%s' % ans
        def calc ( a , first_idx , count , t , takefirst ) :
            if takefirst :
                count -= 1
            time = 0
            cnt = struct.unpack ( '>i' , a [ 0 ] )
            for i in range ( MAX_A ) :
                if i == first_idx and takefirst :
                    if time >= t :
                        time += a [ i ]
                    elif time + 2 * a [ i ] <= t :
                        time += 2 * a [ i ]
                    else :
                        tmp = t - time
                        if tmp % 2 :
                            raise
                        time += a [ i ] + tmp / 2
            return time
    return B ( )
