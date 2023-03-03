def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.original = sys.argv [ 0 ]
    def __call__ ( self , * args , ** kwargs ) :
        reader = _sys.stdin.readline ( )
        R = reader.read ( )
        ans = ''
        if R < 1200 :
            ans = 'ABC'
        elif R < 2800 :
            ans = 'ARC'
        else :
            ans = 'AGC'
        sys.stdout.write ( ans )
