def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        map = [ ]
        sum = 0
        for i in range ( 3 ) :
            map.append ( sc.read ( ) )
            sum += map [ i ]
        min = sum
        for a in map :
            min = min ( min , sum - a )
        print ( min )
