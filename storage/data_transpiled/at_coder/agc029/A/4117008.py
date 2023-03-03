def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        sum = 0
        count = 0
        for i in s :
            if i == 'W' :
                count += 1
                sum += i
        print ( sum - count * ( count - 1 ) / 2 )
