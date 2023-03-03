def import import _sys , _imp
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        with _sys.stdin :
            self._sys = _imp ( * args , ** kwargs )
    def main ( ) :
        return _sys.modules.pop ( '_sys' )
