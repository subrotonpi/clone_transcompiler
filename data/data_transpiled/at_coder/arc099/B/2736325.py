def _import ( ) :
    from os import urandom
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.sc = urandom
        def run ( self ) :
            with open ( self.sc , 'r' ) as f :
                K = f.read ( )
    ans = 0
    add = 1
    f = sys.stdout
    cnt = 0
    while cnt < K :
        if ( ans + add ) * S ( ans + add * 10 ) > ( ans + add * 10 ) * S ( ans + add ) :
            add = add * 10
        ans += add
        f.write ( ans )
    f.close ( )
    def S ( a ) :
        ret = 0
        while a :
            ret += a % 10
            a //= 10
        return ret
    def tr ( * args ) :
        print ( " ".join ( map ( str , args ) ) )
