def _main ( ) :
    from os import urandom
    from os import urandom
    from os import fdopen
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import isfile
    from os.walk import walk
    class B ( B ) :
        def __init__ ( self , f ) :
            self.f = open ( join ( expanduser ( '~' ) , 'input.txt' ) , 'w' )
            self.f = open ( join ( expanduser ( '~' ) , 'output.txt' ) , 'w' )
            self.T = len ( self.f )
            for i in range ( self.T ) :
                s = 'Case #%d: %s' % ( i + 1 , B ( ).solve ( self.f ) )
                self.f.write ( s )
    def prepare ( self , w ) :
        R = len ( w )
        C = len ( w )
        res = [ ]
        for i in range ( R ) :
            for j in range ( C ) :
                w [ i ] [ j ] = s [ j ] - '0'
        return res
    def solve ( self , w ) :
        R = len ( w )
        C = len ( w )
        for i in range ( R ) :
            s = f.read ( )
            for j in range ( C ) :
                w [ i ] [ j ] = s [ j ] - '0'
        wi = [ ]
        wj = [ ]
        for i in range ( R ) :
            for j in range ( C ) :
                wi.append ( w [ i ] [ j ] * i )
                wj.append ( w [ i ] [ j ] * j )
        sw = prepare ( w )
        swi = prepare ( wi )
        swj = prepare ( wj )
        max = 0
        for i in range ( R ) :
            for j in range ( C ) :
                si , sj = calc ( swi , wi , i , j , k )
                s = max + si + sj + s
                max = max + s
        return max
        