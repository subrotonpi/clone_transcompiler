def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        nums = [ ]
        for i in range ( sc.readline ( ).strip ( ) ) :
            nums.append ( sc.readline ( ) )
        nums.sort ( )
        tmp = 0
        output = 0
        for a in nums :
            if tmp == a :
                output += 1
            tmp = a
        print ( output )
