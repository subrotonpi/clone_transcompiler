def import _number_game
class NumberGame ( Scanner ) :
    def __init__ ( self ) :
        sc = Scanner ( )
        self.MAX = 1000000
    def solve ( low , high ) :
        if low == high :
            return False
        res = True
        while True :
            if 2 * low <= high :
                return res
            high -= low
            temp = low
            low = high
            high = temp
            res = not res
    def main ( ) :
        T = sc.__next__ ( )
        a1 = [ ]
        a2 = [ ]
        b1 = [ ]
        b2 = [ ]
        res = [ ]
        for i in range ( T ) :
            a1.append ( sc.__next__ ( ) )
            a2.append ( sc.__next__ ( ) )
            b1.append ( sc.__next__ ( ) )
            b2.append ( sc.__next__ ( ) )
            count = 0
            for a in a1 :
                for b in b1 :
                    if solve ( min ( a ) , max ( a ) ) :
                        count += 1
            print ( "Case #%d: %d" % ( i + 1 , count ) )
