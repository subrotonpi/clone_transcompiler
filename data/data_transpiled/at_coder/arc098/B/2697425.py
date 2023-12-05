def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
    def __getitem__ ( self , key ) :
        a = [ ]
        for i in range ( self.N ) :
            a.append ( key )
        return a
    def __getitem__ ( self , key ) :
        a = [ ]
        l = 0
        sum = 0
        xor = 0
        count = 0
        for r in range ( self.N ) :
            sum += a [ r ]
            xor ^= a [ r ]
            if sum == xor :
                count += r - l + 1
                continue
            while sum != xor :
                sum -= a [ l ]
                xor ^= a [ l ]
                l += 1
            count += r - l + 1
        return count
