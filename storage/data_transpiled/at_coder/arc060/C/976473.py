def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n = len ( sys.stdin )
        self.x = [ ]
        for i in range ( self.n ) :
            self.x.append ( sys.stdin.read ( ) )
        self.limit = sys.stdin.read ( )
        self.dptable = [ [ ] for _ in range ( 18 ) ]
        begin = end = 0
        sum = self.x [ 0 ]
        while begin < n :
            while True :
                if end + 1 < n and self.x [ end + 1 ] - self.x [ begin ] <= limit :
                    end += 1
                else :
                    break
            self.dptable.append ( [ begin , end ] )
            begin += 1
        for i in range ( 1 , 18 ) :
            for j in range ( self.n ) :
                self.dptable [ i ] [ j ] = self.dptable [ i - 1 ] [ dptable [ i - 1 ] [ j ] ]
        self.q = sys.stdin.read ( )
        for i in range ( self.q ) :
            ta = self.x [ i ] - 1
            tb = self.x [ i ] - 1
            a = min ( ta , tb )
            b = max ( ta , tb )
            current = a
            days = 0
            depth = 0
            for depth in range ( 17 ) :
                if self.dptable [ depth + 1 ] [ current ] >= b :
                    current = self.dptable [ depth ] [ current ]
                    days = 1 << depth
                    break
            while depth >= 0 :
                if self.dptable [ depth ] [ current ] < b :
                    current = self.dptable [ depth ] [ current ]
                    days += ( 1 << depth )
                depth -= 1
            print ( days , ( current , b ) )
