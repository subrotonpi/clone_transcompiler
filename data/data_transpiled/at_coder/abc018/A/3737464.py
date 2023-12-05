def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self._main = _main
    def rank ( self , a , b , c ) :
        self._main.rank ( a , b , c )
        print ( self._main.rank ( a , b , c ) )
        print ( self._main.rank ( b , a , c ) )
        print ( self._main.rank ( c , a , b ) )
    def rank ( self , a , b ) :
        if self._main.rank ( a , b ) :
            return 3
        elif self._main.rank ( a , b ) or self._main.rank ( a , b ) :
            return 2
        else :
            return 1
