def import import sys , string , * , line , ** kwargs ) :
    import string
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            s = string.strip ( )
            x = s.find ( "????????" )
            print ( chr ( x ) == "T" )
        def __call__ ( self , x ) :
            return string.strip ( x )
    return Main ( )
