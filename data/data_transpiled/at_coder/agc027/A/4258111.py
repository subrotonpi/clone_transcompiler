def main ( srgs ) :
    import os
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.srgs = srgs
        def __init__ ( self ) :
            self.srgs = [ ]
        def select ( self ) :
            a = random.randint ( 0 , a )
            x = random.randint ( 0 , a )
            c = [ ]
            count = 0
            ans = 0
            sum = 0
            for i in range ( 0 , a ) :
                b = random.randint ( 0 , a )
                c.append ( b )
                sum += c [ i ]
            c.sort ( )
            for i in range ( a ) :
                count += c [ i ]
                if count > x :
                    break
                ans += 1
            print ( sum < x - 1 )
