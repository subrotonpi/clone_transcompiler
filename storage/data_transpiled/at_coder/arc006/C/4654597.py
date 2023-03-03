def import import sys
class Main ( object ) :
    def main ( self ) :
        n = int ( self.n )
        ans = 0
        tmp = [ ]
        tmp.append ( 100_001 )
        for i in range ( n ) :
            tmp.sort ( )
            w = sys.maxsize
            can_stack = False
            for j in range ( ans ) :
                if tmp [ j ] >= w :
                    can_stack = True
                    tmp.append ( w )
                    break
            if not can_stack :
                tmp.append ( w )
        print ( ans )
