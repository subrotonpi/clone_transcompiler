def import _A
class A ( object ) :
    def __init__ ( self ) :
        self.T = int ( self.T )
        for case in range ( 1 , T + 1 ) :
            super ( A , self ).__init__ ( )
    def has ( char ) :
        return has ( char , 0 , 1 ) or has ( char , 1 , 0 ) or has ( char , 1 , 1 ) or has ( char , - 1 , 1 )
    def has ( char , dx , dy ) :
        for i in range ( N ) :
            for j in range ( N ) :
                ok = True
                for t in range ( K ) :
                    nyi = i + t * dx
                    nyj = j + t * dy
                    if nyi >= N or nyj >= N or nyi < 0 or nyj < 0 or map [ nyi ] [ nyj ] != char :
                        ok = False
                        break
                if ok : return True
        return False
    def go ( self ) :
        self.N = int ( self.N )
        self.K = int ( self.K )
        map = [ [ char.capitalize ( ) for char in self.map [ char ] ] for char in self.map [ char ] ]
        for i in range ( self.N ) :
            for k in range ( self.N - 2 , - 1 , - 1 ) :
                if map [ i ] [ j + 1 ] == '.' :
                    map [ i ] [ j + 1 ] = map [ i ] [ j ]
                    map [ i ] [ j ] = '.'
    blue = has ( 'B' )
    red = has ( 'R' )
    if blue and red :
        ans = 'Both'
    elif blue :
        ans = 'Blue'
    elif red :
        ans = 'Red'
    else :
        ans = 'Neither'
    print ( 'Case #%d: %s' % ( self.CASE , ans ) )
