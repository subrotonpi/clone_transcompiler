def import _Prison2
class C ( object ) :
    def __init__ ( self , start , end ) :
        self.start = start
        self.end = end
    def __hash__ ( self ) :
        return self.start * 10001 + end
    def solve ( self ) :
        solution = self.cache.get ( self )
        if solution is not None : return solution
        solution = solve0 ( )
        self.cache [ self ] = solution
        return solution
    def solve0 ( self ) :
        if self.length ( ) == 0 : return 0
        answer = sys.maxint
        for q in self.Q :
            if q < start or q > end : continue
            left = _Prison2 ( start , q - 1 )
            right = _Prison2 ( q + 1 , end )
            sol = len ( left ) + len ( right ) + left.solve ( ) + right.solve ( )
            if sol < answer : answer = sol
        if answer == sys.maxint : return 0
        return answer
    def length ( self ) :
        return end - start + 1
Q = [ ]
def main ( ) :
    s = open ( "/etc/init.d" , "r" )
    s.readline ( )
    test_cases = s.readlines ( )
    for t in range ( test_cases ) :
        Q = [ ]
        p = s.readline ( )
        q = s.readline ( )
        for i in range ( q ) :
            Q.append ( s.readline ( ) )
        prison = _Prison2 ( 1 , p )
        cache = { }
        sol = prison.solve ( )
        print ( "Case #%d: %d\n" % ( t + 1 , sol ) )
