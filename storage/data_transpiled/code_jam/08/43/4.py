def import readline
import readline
import sys
class Solution ( object ) :
    def __init__ ( self ) :
        self.stdin = readline
        self.stdout = readline
        self.stdout = open
        self.stdout.write = readline
        self.stdout.readline = readline
        self.stdout.write = readline
        self.stdout.readline = readline
        self.stdout.write = readline
        self.tests = randint ( 1 , 10000 )
        for test in range ( 1 , tests + 1 ) :
            n = randint ( 1 , 10000 )
            x = [ ]
            y = [ ]
            z = [ ]
            p = [ ]
            for i in range ( n ) :
                x.append ( readline ( ) )
                y.append ( readline ( ) )
                z.append ( readline ( ) )
                p.append ( readline ( ) )
            l = 0.0
            r = 1e9
            loop : for it in range ( 100 ) :
                xx = ( l + r ) / 2.0
                d = [ float ( 'inf' ) ] * 8
                for i in range ( 8 ) :
                    rad = xx * p [ i ]
                    for j in range ( 8 ) :
                        tmp = rad
                        if j & 1 == 0 :
                            tmp += x [ i ]
                        else :
                            tmp -= x [ i ]
                        if j & 2 == 0 :
                            tmp += y [ i ]
                        else :
                            tmp -= y [ i ]
                        if j & 4 == 0 :
                            tmp += z [ i ]
                        else :
                            tmp -= z [ i ]
                        d [ j ] = min ( d [ j ] , tmp )
                for i in range ( 8 ) :
                    if - d [ i ] > d [ i ^ 7 ] :
                        l = xx
                        continue loop
                r = xx
            print ( 'Case #%d: %s' % ( self.test , r ) )
