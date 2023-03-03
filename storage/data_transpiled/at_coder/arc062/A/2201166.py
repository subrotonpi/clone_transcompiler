def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        t = 1
        a = 1
        for i in range ( n ) :
            ti = int ( sc.readline ( ) )
            ai = int ( sc.readline ( ) )
            temp = long ( max ( ceil ( t , ti ) , ceil ( a , ai ) ) )
            t = temp * ti
            a = temp * ai
        print ( t , a )
        sc.close ( )
    def ceil ( a , b ) :
        ret = a // b
        if a % b :
            ret += 1
        return ret
