def _import ( ) :
    from math import sqrt
    import math
    class SecondRoundProbD ( object ) :
        def __init__ ( self , problemType ) :
            self.problemType = problemType.startswith ( 's' ) and 'D-' + problemType + '-attempt0.in' or 'D-' + problemType + '.in'
            self.input = self.problemType.strip ( )
            self.output = '{} {}'.format ( self.input , self.output )
        def write ( self , s ) :
            s = s.replace ( '{}' , '' )
            self.output += '{} {}'.format ( self.input , self.output )
    f = open ( '{}Res.txt'.format ( self.input ) , 'r' )
    s = f.readline ( )
    NR_CASES = int ( s )
    for CASE in range ( 1 , NR_CASES + 1 ) :
        s = f.readline ( )
        strs = s.split ( )
        N = int ( strs [ 0 ] )
        M = int ( strs [ 1 ] )
        px = [ int ( strs [ 0 ] ) for strs in s.split ( ) ]
        py = [ int ( strs [ 1 ] ) for strs in s.split ( ) ]
        mx = [ int ( strs [ 0 ] ) for strs in s.split ( ) ]
        my = [ int ( strs [ 1 ] ) for strs in s.split ( ) ]
        res = ''
        d = sqrt ( ( px [ 1 ] - px [ 0 ] ) ** 2 + ( py [ 1 ] - py [ 0 ] ) ** 2 )
        for i in range ( M ) :
            r1sq = ( px [ 0 ] - mx [ i ] ) ** 2 + ( py [ 0 ] - my [ i ] ) ** 2
            r1 = sqrt ( r1sq )
            r2sq = ( py [ 1 ] - my [ i ] ) ** 2 + ( py [ 1 ] - my [ i ] ) ** 2
            res += '{} {}'.format ( self.input , r1 )
