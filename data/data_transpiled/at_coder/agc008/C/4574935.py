def _import ( ) :
    from os import getenv
    from os import O_UNIX , O_UNIX , T , J , L , S , Z
    class Main ( object ) :
        sc = _sc
        I = sc.__next__
        O = sc.__next__
        T = sc.__next__
        J = sc.__next__
        L = sc.__next__
        S = sc.__next__
        Z = sc.__next__
    ans = 0
    tmp = 0
    if I > 0 :
        ans += ( ( I - 1 ) / 2 ) * 2
    ans += O
    if J > 0 :
        ans += ( ( J - 1 ) / 2 ) * 2
    if L > 0 :
        ans += ( ( L - 1 ) / 2 ) * 2
    if I > 0 and J > 0 and L > 0 :
        ans += 3
    tmp += I / 2 * 2
    tmp += O
    tmp += J / 2 * 2
    tmp += L / 2 * 2
    pl ( max ( ans , tmp ) )
class SC ( object ) :
    def __init__ ( self , stream = None ) :
        self.stream = stream
        self.tokens = [ ]
    def readline ( self ) :
        if not stream or not stream.closed :
            try :
                stream = open ( self.stream , "r" )
            except IOError :
                raise IOError ( "File not closed" )
        return self.tokens [ 0 ]
    def readline ( self ) :
        return int ( self.stream.readline ( ) )
    def pl ( self , stream = None ) :
        return self.stream.readline ( )
    def p ( self , stream = None ) :
        print ( stream , file = stream )
