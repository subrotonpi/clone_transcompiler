def main ( ) :
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin
            self.t = sys.stdin.readline ( ).strip ( )
            for test in range ( 1 , t + 1 ) :
                r , c , w = self.s.split ( ' ' )
                print ( 'Case #%d: %d\n' % ( test , solve ( r , c , w ) ) )
    def solve ( r , c , w ) :
        total = 0
        total += r * ( c // w )
        total += w
        if c % w == 0 :
            total -= 1
        return total
    return solve
