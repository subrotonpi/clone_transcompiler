def _import ( ) :
    from os import getenv
    from os import getenv
    from os import getenv
    from os.path import join
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import expanduser
    from os.environ import environ
    sc = getenv ( 'SC' )
    N = sc.__next__ ( )
    arr = [ ]
    counter = 0
    ary = [ ]
    for i in range ( N ) :
        ary.append ( sc.__next__ ( ) )
    dekiru = True
    for i in range ( N ) :
        basyo = num = 0
        for j in range ( len ( ary ) ) :
            if i + 1 == ary [ j ] :
                if ary [ j ] > num :
                    basyo = j
                    num = ary [ j ]
        if num > 0 :
            del ary [ basyo ]
            arr.append ( num )
            counter += 1
    if len ( ary ) == 0 :
        for i in range ( N ) :
            pl ( arr [ i ] )
    else :
        pl ( - 1 )
    class SC ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.tokens = None
        def readline ( self ) :
            if not self.tokens or not self.tokens :
                try :
                    self.tokens = iter ( self.f )
                except StopIteration :
                    raise OSError ( "No tokens found for %r" % self.tokens )
            return self.tokens [ 0 ]
        def readline ( self ) :
            return int ( self.tokens [ 0 ] )
        def readline ( self ) :
            return str ( self.tokens [ 1 ] )
        def write ( self , x ) :
            print ( x )
    pl = SC ( )
    pl.write ( "\n" )
    pl.close ( )
