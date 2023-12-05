def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = float ( self.a )
            self.b = int ( self.b )
        def __repr__ ( self ) :
            return "%s" % self.a
    a = Main ( )
    b = int ( a )
    box = b / a
    calc = b % a
    result = 0
    if calc == 0 :
        result = int ( box )
        print ( result )
    else :
        box = math.ceil ( box )
        result = int ( box )
        print ( result )
