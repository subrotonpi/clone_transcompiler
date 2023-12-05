def gcj2015.r1
import os
import glob
import os
import subprocess
import random
class Mushroom :
    def __init__ ( self ) :
        self.name = 'gcj2015/r1/A-large'
        with open ( self.name + '.in' , 'r' ) as s :
            count = s.read ( )
    f = open ( self.name + '.out' , 'w' )
    for cc in range ( 1 , count + 1 ) :
        f.write ( 'Case #%d: ' % cc )
        n = random.randint ( 1 , n )
        a = [ random.randint ( 1 , n ) for _ in range ( n ) ]
        res1 = solve1 ( n , a )
        res2 = solve2 ( n , a )
        f.write ( res1 )
        f.write ( ' ' )
        f.write ( res2 )
        f.write ( '\n' )
    f.close ( )
    def solve1 ( n , a ) :
        res = 0
        for i in range ( n - 1 ) :
            res += max ( a [ i ] - a [ i + 1 ] , 0 )
        return res
    def solve2 ( n , a ) :
        res = 0
        for i in range ( n - 1 ) :
            res = max ( a [ i ] - a [ i + 1 ] , max ( a [ i ] , 0 ) )
        for i in range ( n - 1 ) :
            res += min ( a [ i ] , max ( a [ i ] , 0 ) )
        return res
