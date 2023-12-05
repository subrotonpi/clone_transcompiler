def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        height , bmi = _sys.argv [ 1 ] / 100 , _sys.argv [ 2 ]
        print ( height * height * bmi )
