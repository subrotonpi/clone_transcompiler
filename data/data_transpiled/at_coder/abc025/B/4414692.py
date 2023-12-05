def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.a = int ( self.a )
        self.b = int ( self.b )
        self.ans = 0
        for po , c in __main__.items ( ) :
            self.ans += ( po == 'East' )
    print ( ( 'East {}'.format ( ans ) if ans else 'West {}'.format ( - ans ) ) )
